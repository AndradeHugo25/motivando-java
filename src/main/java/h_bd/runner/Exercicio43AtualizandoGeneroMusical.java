package h_bd.runner;

import h_bd.database.DBConnection;

public class Exercicio43AtualizandoGeneroMusical {

    public static void main(String[] args) {

        DBConnection conexaoBanco = new DBConnection();

        conexaoBanco.connectSQLiteDB(
                "src/main/resources/auto-qa.db");

        conexaoBanco.update(
                "playlist",
                "id",
                3,
                "nome",
                "Minha Playlist 1"
        );

        System.out.println("Playlist atualizada com sucesso!");
    }
}