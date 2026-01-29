package h_bd.repository;
import h_bd.database.DBConnection;

import java.util.List;
import java.util.Map;

public class AlbumRepository {
    private final DBConnection conexaoBanco;
    private final String NOME_TABELA = "album";

    public AlbumRepository() {
        this.conexaoBanco = new DBConnection();
        this.conexaoBanco.connectSQLiteDB("src/main/resources/auto-qa.db");
    }

    public List<Map<String, Object>> selecionarAlbumPorArtistaId(int artista_id) {
        return conexaoBanco.select(NOME_TABELA, "artista_id", artista_id);
    }
}
