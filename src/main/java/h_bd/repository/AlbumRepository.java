package h_bd.repository;

import h_bd.database.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AlbumRepository {

    private final DBConnection dbConnection;

    public AlbumRepository() {
        this.dbConnection = new DBConnection();
        this.dbConnection.connectSQLiteDB("src/main/resources/auto-qa.db");
    }
    public List<String> selecionarNomesAlbunsPorArtistaId(int artistaId) {
        List<Map<String, Object>> resultado = dbConnection.select("album", "artista_id", artistaId);
        List<String> nomesAlbuns = new java.util.ArrayList<>();
        for (Map<String, Object> linha : resultado) {
            nomesAlbuns.add(linha.get("nome").toString());
        }
        return nomesAlbuns;
    }
}
