package h_bd.repository;

import h_bd.database.DBConnection;

public class PlaylistRepository {

    private final DBConnection conexaoBanco;
    private final String NOME_TABELA = "playlist";

    public PlaylistRepository(){
        this.conexaoBanco = new DBConnection();
        this.conexaoBanco.connectSQLiteDB("src/main/resources/auto-qa.db");
    }

    public int atualizarPlaylist (String nome, String valorCond, String coluna, String valorUpdate){
        return conexaoBanco.update(NOME_TABELA, nome, valorCond, coluna, valorUpdate);
    }
}
