package h_bd.repository;

import h_bd.database.DBConnection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AlbumRepository {

    private final DBConnection dbConnection;
    private final String NOME_TABELA = "album";

    public AlbumRepository() {
        this.dbConnection = new DBConnection();
        this.dbConnection.connectSQLiteDB("src/main/resources/auto-qa.db");
    }

    public List<Map<String, Object>> selecionarNomesAlbunsPorArtistaId(int artistaId) {
        return dbConnection.select(NOME_TABELA, "artista_id", artistaId);


    }
}
