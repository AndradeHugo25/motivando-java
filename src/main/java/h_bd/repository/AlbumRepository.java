package h_bd.repository;

import h_bd.database.DBConnection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class AlbumRepository {

    private final DBConnection conexaoBanco;
    private final String NOME_TABELA = "album";

    public AlbumRepository() {
        this.conexaoBanco = new DBConnection();
        this.conexaoBanco.connectSQLiteDB("src/main/resources/auto-qa.db");
    }

    public AlbumRepository(Properties props) {
        this.conexaoBanco = new DBConnection(props);
        this.conexaoBanco.connectDB("auto-qa");
    }

    public List<Map<String, Object>> selecionarAlbunsPorArtistaId(int artistaId) {
        return conexaoBanco.select(NOME_TABELA, "artista_id", artistaId);
    }
}