package h_bd.repository;

import h_bd.database.DBConnection;

public class PlaylistRepository {

    private final DBConnection conexaoBanco;
    private final String NOME_TABELA = "playlist";

    public PlaylistRepository() {
        this.conexaoBanco = new DBConnection();
        this.conexaoBanco.connectSQLiteDB("src/main/resources/auto-qa.db");
    }

    public int atualizarPlaylist(String colunaCond, Object valorCond, String colunaUpdate, Object valorUpdate) {
        return conexaoBanco.update(NOME_TABELA, colunaCond, valorCond, colunaUpdate, valorUpdate);
    }

    public String selecionarPlaylist(int id) {
        return conexaoBanco.select(NOME_TABELA, "id", id)
                .getFirst()
                .get("nome").toString();
    }
}
