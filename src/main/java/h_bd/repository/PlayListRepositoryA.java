package h_bd.repository;

import h_bd.database.DBConnection;

import java.util.List;
import java.util.Map;

public class PlayListRepositoryA {

    private final DBConnection conexaoBanco;
    private final String NOME_TABELA = "playlist";

    public PlayListRepositoryA() {
        this.conexaoBanco = new DBConnection();
        this.conexaoBanco.connectSQLiteDB("src/main/resources/auto-qa.db");
    }

    public List<Map<String, Object>> selecionarPlaylistsPorId(int id) {
        return conexaoBanco.select(NOME_TABELA, "id", id);
    }

    public int atualizarPlaylistsPorId(int id, String novoNome) {
        return conexaoBanco.update(NOME_TABELA, "id", id, "nome", novoNome);
    }
}
