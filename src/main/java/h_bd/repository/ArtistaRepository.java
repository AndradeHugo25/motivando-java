package h_bd.repository;

import h_bd.database.DBConnection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ArtistaRepository {

    private final DBConnection conexaoBanco;
    private final String NOME_TABELA = "artista";

    public ArtistaRepository() {
        this.conexaoBanco = new DBConnection();
        this.conexaoBanco.connectSQLiteDB("src/main/resources/auto-qa.db");
    }

    //Quando for projeto real
    public ArtistaRepository(Properties props) {
        this.conexaoBanco = new DBConnection(props);
        this.conexaoBanco.connectDB("auto-qa");
    }

    //Apenas para fins didáticos
    public String selecionarNomeArtistaPorId(int id) {
        List<Map<String, Object>> resultado = conexaoBanco.select(NOME_TABELA, "id", id);

        Map<String, Object> primeiraLinha = resultado.getFirst();

        String nomeArtista = primeiraLinha.get("nome").toString();

        return nomeArtista;
    }

    public String selecionarNomeArtistaPorIdReduzido(int id) {
        return conexaoBanco.select(NOME_TABELA, "id", id)
                .getFirst()
                .get("nome").toString();
    }

    public List<Map<String, Object>> selecionarTodosArtistas() {
        return conexaoBanco.selectNoWhere(NOME_TABELA);
    }
}
