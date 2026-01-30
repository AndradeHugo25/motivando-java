package d_ed.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ale");
        nomes.add("Ju");
        nomes.add("Carol");
        //       nomes.add("Aline");

        System.out.println("Lista de quem deve dividir " + nomes);

        nomes.add("Aline");

        System.out.println("Lista nova " + nomes);

    }

}
