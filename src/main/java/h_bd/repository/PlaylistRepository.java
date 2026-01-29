package h_bd.repository;

import h_bd.database.DBConnection;

import java.util.List;
import java.util.Map;

public class PlaylistRepository {

    private final DBConnection conexaoBanco;
    private final String NOME_TABELA = "playlist";

    public PlaylistRepository() {
        this.conexaoBanco = new DBConnection();
        this.conexaoBanco.connectSQLiteDB("src/main/resources/auto-qa.db");
    }

    public List<Map<String, Object>> atualizarPlaylist(String nomeTabela, String colunaCond, Object valorCond, String colunaUpdate, Object valorUpdate) {
        return conexaoBanco.update(NOME_TABELA, "nomeTabela", "colunaCond", 1, "colunaUpdate", 1);
    }
}
