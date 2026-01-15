package h_exercicios;

import java.util.*;

public class Exercicios28Dados {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Helen");
        nomes.add("Ju");
        nomes.add("Fellipe");
        nomes.add("Hugo");
        nomes.add("Pedro");

        System.out.println("LISTA: " + nomes);

        String resposta = nomes.contains("Aline") ? "Aline tá na lista já, divide a conta por 6" : "Aline ficou de fora, inclui ai!";

        System.out.println("\n" + resposta);

        nomes.add("Aline");

        System.out.println("\nLISTA: " + nomes);

        resposta = nomes.contains("Aline") ? "Aline tá na lista, divide a conta por 6" : "Aline ficou de fora, inclui ai!";
        System.out.println(resposta);
    }
}
