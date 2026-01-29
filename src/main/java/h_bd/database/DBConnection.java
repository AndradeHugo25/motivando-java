package h_bd.database;

import lombok.Data;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Data
public class DBConnection {

    private static final Logger logger = LoggerFactory.getLogger(DBConnection.class);

    private Jdbi jdbi;
    private String schema;
    private Properties properties;
    private static PreparedStatement stmt;
    private static ResultSet result;
    private Connection connection;
    private static final int tempoEspera = 20;
    public static final String GENERATE_UUID_POSTGRE = "gen_random_uuid()";

    public DBConnection() {
    }

    public DBConnection(Properties properties) {
        this.properties = properties;
    }

    public enum Types {
        VARCHAR, INTEGER, DECIMAL, TIME_STAMP, BOOL, DATE, NULL, UUID
    }

    public void connectDB() {
        connectDB("default");
    }

    public void connectDB(String base) {
        //Em um projeto concreto, o ambiente vem da variável de ambiente
        String env = "tst";
        logger.info("[BANCO] Conectando base de dados no ambiente {} e base {}...", env, base);

        //Em um projeto concreto, esses valores podem vir do config.properties
        String url = "jdbc:postgresql://ep-broad-water-acyrhc0w-pooler.sa-east-1.aws.neon.tech:5432/neondb?sslmode=require";
        String usuario = "neondb_owner";
        String senha = "npg_g20wsjRuaUpL";
        schema = "public";

        if (url != null) {
            jdbi = Jdbi.create(url, usuario, senha);
            logger.info("[BANCO] Base de dados conectada no ambiente {} e base {}...", env, base);
        } else {
            logger.info("[BANCO] Configuração default de banco inexistente. Prosseguindo com os testes...");
        }
    }

    public void connectSQLiteDB(String dbFilePath) {
        File file = new File(dbFilePath);
        String absolutePath = file.getAbsolutePath();
        String url = "jdbc:sqlite:" + absolutePath;
        logger.info("[BANCO] Conectando banco SQLite local: {}", url);

        jdbi = Jdbi.create(url);
        logger.info("[BANCO] Banco SQLite conectado: {}", dbFilePath);
    }

    public void disconnectDB() {
        jdbi = null;
        logger.info("[BANCO] Base de dados desconectada");
    }

    public List<Map<String, Object>> select(String nomeTabela, String nomeColuna, Object valor) {
        return select(nomeTabela, Map.of(nomeColuna, valor));
    }

    public List<Map<String, Object>> select(String nomeTabela, Map<String, Object> whereParams) {
        String whereClause = whereParams.keySet().stream()
                .map(k -> k + " = :" + k)
                .reduce((a, b) -> a + " AND " + b)
                .orElse("");

        String sql;
        if (schema == null) {
            sql = String.format("SELECT * FROM %s WHERE %s", nomeTabela, whereClause);
        } else {
            sql = String.format("SELECT * FROM %s.%s WHERE %s", schema, nomeTabela, whereClause);
        }

        logger.info("[BANCO] Executando query: {} | Parâmetros: {}", sql, whereParams);
        return jdbi.withHandle(handle ->
                handle.createQuery(sql)
                        .bindMap(whereParams)
                        .setQueryTimeout(tempoEspera)
                        .mapToMap()
                        .list()
        );
    }

    public List<Map<String, Object>> selectIn(String nomeTabela, String nomeColuna, List<Object> valores) {
        if (valores == null || valores.isEmpty()) {
            return new ArrayList<>();
        }
        String inClause = valores.stream()
                .map(v -> ":v" + valores.indexOf(v))
                .reduce((a, b) -> a + ", " + b)
                .orElse("");
        String sql = String.format("SELECT * FROM %s.%s WHERE %s IN (%s)", schema, nomeTabela, nomeColuna, inClause);
        logger.info("[BANCO] Executando query: {} | Parâmetros IN: {}", sql, valores);
        return jdbi.withHandle(handle -> {
            var query = handle.createQuery(sql);
            for (int i = 0; i < valores.size(); i++) {
                query.bind("v" + i, valores.get(i));
            }
            query.setQueryTimeout(tempoEspera);
            return query.mapToMap().list();
        });
    }

    public List<Map<String, Object>> selectEqualsAndIn(String nomeTabela, String colunaEquals, Object valorEquals, String colunaIn, List<Object> valoresIn) {
        return selectEqualsAndInOrNotIn(nomeTabela, colunaEquals, valorEquals, colunaIn, valoresIn, false);
    }

    public List<Map<String, Object>> selectEqualsAndNotIn(String nomeTabela, String colunaEquals, Object valorEquals, String colunaNotIn, List<Object> valoresNotIn) {
        return selectEqualsAndInOrNotIn(nomeTabela, colunaEquals, valorEquals, colunaNotIn, valoresNotIn, true);
    }

    private List<Map<String, Object>> selectEqualsAndInOrNotIn(String nomeTabela, String colunaEquals, Object valorEquals, String colunaIn, List<Object> valoresIn, boolean notIn) {
        if (valorEquals == null || valoresIn == null || valoresIn.isEmpty()) {
            return new ArrayList<>();
        }
        StringBuilder inClause = new StringBuilder();
        for (int i = 0; i < valoresIn.size(); i++) {
            if (i > 0) inClause.append(", ");
            inClause.append(notIn ? ":notin" + i : ":in" + i);
        }
        String operador = notIn ? "NOT IN" : "IN";
        String sql = String.format(
            "SELECT * FROM %s.%s WHERE %s = :eq AND %s %s (%s)",
            schema, nomeTabela, colunaEquals, colunaIn, operador, inClause
        );
        logger.info("[BANCO] Executando query: {} | Parâmetro EQ: {} | Parâmetros {}: {}", sql, valorEquals, operador, valoresIn);
        return jdbi.withHandle(handle -> {
            var query = handle.createQuery(sql);
            query.bind("eq", valorEquals);
            for (int i = 0; i < valoresIn.size(); i++) {
                query.bind(notIn ? "notin" + i : "in" + i, valoresIn.get(i));
            }
            query.setQueryTimeout(tempoEspera);
            return query.mapToMap().list();
        });
    }

    public int delete(String nomeTabela, String nomeColuna, Object valor) {
        return delete(nomeTabela, Map.of(nomeColuna, valor));
    }

    public int delete(String nomeTabela, Map<String, Object> whereParams) {
        String whereClause = whereParams.keySet().stream()
                .map(k -> k + " = :" + k)
                .reduce((a, b) -> a + " AND " + b)
                .orElse("");
        String sql = String.format("DELETE FROM %s.%s WHERE %s", schema, nomeTabela, whereClause);
        logger.info("[BANCO] Executando query: {} | Parâmetros: {}", sql, whereParams);
        return jdbi.withHandle(handle ->
                handle.createUpdate(sql)
                        .bindMap(whereParams)
                        .setQueryTimeout(tempoEspera)
                        .execute()
        );
    }

    public int update(String nomeTabela, String colunaCond, Object valorCond, String colunaUpdate, Object valorUpdate) {
        return update(nomeTabela, Map.of(colunaCond, valorCond), Map.of(colunaUpdate, valorUpdate));
    }

    public int update(String nomeTabela, Map<String, Object> whereParams, Map<String, Object> updateParams) {
        String setClause = updateParams.keySet().stream()
                .map(k -> k + " = :set_" + k)
                .reduce((a, b) -> a + ", " + b)
                .orElse("");
        String whereClause = whereParams.keySet().stream()
                .map(k -> k + " = :where_" + k)
                .reduce((a, b) -> a + " AND " + b)
                .orElse("");
        String sql = String.format("UPDATE %s.%s SET %s WHERE %s", schema, nomeTabela, setClause, whereClause);
        logger.info("[BANCO] Executando query: {} | Parâmetros WHERE: {} | Parâmetros SET: {}", sql, whereParams, updateParams);
        return jdbi.withHandle(handle -> {
            var update = handle.createUpdate(sql);
            updateParams.forEach((k, v) -> update.bind("set_" + k, v));
            whereParams.forEach((k, v) -> update.bind("where_" + k, v));
            update.setQueryTimeout(tempoEspera);
            return update.execute();
        });
    }

    public int insert(String nomeTabela, Map<String, Object> valores) {
        String colunas = String.join(", ", valores.keySet());
        String params = valores.keySet().stream().map(k -> ":" + k).reduce((a, b) -> a + ", " + b).orElse("");
        String sql = String.format("INSERT INTO %s.%s (%s) VALUES (%s)", schema, nomeTabela, colunas, params);
        logger.info("[BANCO] Executando query: {} | Parâmetros: {}", sql, valores);
        return jdbi.withHandle(handle ->
                handle.createUpdate(sql)
                        .bindMap(valores)
                        .setQueryTimeout(tempoEspera)
                        .execute()
        );
    }
}
