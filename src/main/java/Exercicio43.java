/*Exercicio43*/

import h_bd.database.ConexaoBD;

public class Exercicio43 {

    public static void main(String[] args) {

        try {
            ConexaoBD conexaoBD = new ConexaoBD();
            conexaoBD.conectarBanco();

            String query = """
                    UPDATE playlist
                    SET nome = 'Minha Playlist 1'
                    WHERE id = 3;
                    """;

            conexaoBD.update(query);

            System.out.println("Playlist atualizada com sucesso!");

            conexaoBD.desconectarBanco();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}