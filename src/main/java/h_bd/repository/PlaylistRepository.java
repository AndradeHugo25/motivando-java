package h_bd.repository;

import h_bd.database.DBConnection;

import java.util.Map;
import java.util.Properties;

public class PlaylistRepository {

    private final DBConnection conexaoBanco;
    private final String NOME_TABELA = "playlist";

    public PlaylistRepository() {
        this.conexaoBanco = new DBConnection();
        this.conexaoBanco.connectSQLiteDB("src/main/resources/auto-qa.db");
    }

    public PlaylistRepository(Properties props) {
        this.conexaoBanco = new DBConnection(props);
        this.conexaoBanco.connectDB("auto-qa");
    }

    public Map<String, Object> selecionarPlaylistPorId(int id) {
        return conexaoBanco.select(NOME_TABELA, "id", id)
                .getFirst();
    }

    public void atualizarNomePlaylist(int id, String novoNome) {
        conexaoBanco.update(
                NOME_TABELA,
                "id", id,
                "nome", novoNome
        );
    }
}
