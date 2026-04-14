package h_bd.repository;

import h_bd.database.DBConnection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PlaylistRepository {
    private final DBConnection conexaoBanco;
    private final String NOME_TABELA = "playlist";

    public PlaylistRepository() {
        this.conexaoBanco = new DBConnection();
        this.conexaoBanco.connectSQLiteDB("src/main/resources/auto-qa.db");
    }

    //Quando for projeto real
    public PlaylistRepository(Properties props) {
        this.conexaoBanco = new DBConnection(props);
        this.conexaoBanco.connectDB("auto-qa");
    }

    public List<Map<String, Object>> selecionarTodasPlaylists() {
        return conexaoBanco.selectNoWhere(NOME_TABELA);
    }

    public List<Map<String, Object>> selecionarPlaylistPorId(int playlistId) {
        return conexaoBanco.select(NOME_TABELA, "id", playlistId);
    }

    public void updatePlaylist(String colunaCond, Map<String, Object> whereParams, Map<String, Object> updateParams){
        conexaoBanco.update(NOME_TABELA, whereParams, updateParams);
    }
}
