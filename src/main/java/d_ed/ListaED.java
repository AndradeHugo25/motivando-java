package d_ed;

import java.util.ArrayList;

public class ListaED {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ale");
        nomes.add("Ju");
        nomes.add("Helen");

        System.out.print("LISTA: " + nomes);

//        for (String nome : nomes) {
//            System.out.print(nome + " ");
//        }

//        String resposta = nomes.contains("Helen") ? "Helen? Sim, contém!" : "Helen? Vixi, tem não!";
//        System.out.println("\n" + resposta);
//
//        nomes.remove("Helen");
//
//        System.out.println("\nLISTA: " + nomes);
//
//        resposta = nomes.contains("Helen") ? "Helen? Sim, contém!" : "Helen? Vixi, tem mais não!";
//        System.out.println(resposta);
    }

}