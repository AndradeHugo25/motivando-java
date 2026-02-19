package h_bd.repository;

import h_bd.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PlayListRepository {
    private final DBConnection db1Connection;

    public PlayListRepository() {
        this.db1Connection = new DBConnection();
        this.db1Connection.connectSQLiteDB("src/main/resources/auto-qa.db");
    }
    public String atualizarPlaylistIncrementandoNumeroPorNome() {
        String nomeAtual = buscarNomePlaylistPorNome();
        if (nomeAtual == null) {
            return null;
        }
        int numero = 1;
        String[] partes = nomeAtual.split(" ");
        if (partes.length > 2) {
            try {
                numero = Integer.parseInt(partes[2]);
                numero++;
            } catch (NumberFormatException e) {
                numero = 1;
            }
        }
        String novoNome = "Minha Playlist " + numero;
        if (atualizarNomePlaylistPorNome(nomeAtual, novoNome)) {
            return novoNome;
        } else {
            return null;
        }
    }

    private String buscarNomePlaylistPorNome() {
        String nomePlaylist = null;
        String sql = "SELECT nome FROM playlist WHERE nome LIKE 'Minha Playlist %' LIMIT 1";
        try (Connection conn = db1Connection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {


            if (rs.next()) {
                nomePlaylist = rs.getString("nome");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nomePlaylist;
    }

    // Atualiza o nome da playlist pelo nome atual
    private boolean atualizarNomePlaylistPorNome(String nomeAtual, String novoNome) {
        String sql = "UPDATE playlist SET nome = ? WHERE nome = ?";
        try (Connection conn = db1Connection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, novoNome);
            stmt.setString(2, nomeAtual);
            return stmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Lista todas as playlists, mostrando ID e nome.
     */
    public void listarPlaylists() {
        String sql = "SELECT id, nome FROM playlist";
        try (Connection conn = db1Connection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            System.out.println("Playlists cadastradas:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                System.out.println("ID: " + id + ", Nome: " + nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
