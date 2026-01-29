package h_bd.repository;

import h_bd.database.DBConnection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class MusicaRepository {

    private final DBConnection conexaoBanco;
    private final String NOME_TABELA = "musica";

    public MusicaRepository() {
        this.conexaoBanco = new DBConnection();
        this.conexaoBanco.connectSQLiteDB("src/main/resources/auto-qa.db");
    }

    //Quando for projeto real
    public MusicaRepository(Properties props) {
        this.conexaoBanco = new DBConnection(props);
        this.conexaoBanco.connectDB("auto-qa");
    }

    public List<Map<String, Object>> selecionarMusicasPorAlbumId(int albumId) {
        return conexaoBanco.select(NOME_TABELA, "album_id", albumId);
    }
}
