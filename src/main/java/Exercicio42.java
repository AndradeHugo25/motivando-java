/*Exercicio42*/

import h_bd.database.ConexaoBD;

import java.sql.ResultSet;

public class Exercicio42 {

    public static void main(String[] args) {

        try {
            ConexaoBD conexaoBD = new ConexaoBD();
            conexaoBD.conectarBanco();

            String query = """
                    SELECT al.title
                    FROM album al
                    INNER JOIN artist ar
                        ON al.artistid = ar.artistid
                    WHERE ar.name = 'Djavan';
                    """;

            ResultSet resultado = conexaoBD.select(query);

            System.out.println("ÁLBUNS DO DJAVAN:");

            while (resultado.next()) {
                System.out.println(resultado.getString("title"));
            }

            conexaoBD.desconectarBanco();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}