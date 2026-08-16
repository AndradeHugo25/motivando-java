/*Exercicio28*/

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio28 {

    public static void main(String[] args) {

        System.out.println("QUEM VAI DIVIDIR A CONTA?");

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> bebeuCerveja = new ArrayList<>();

        System.out.println("Digite os nomes das pessoas que pediram cerveja (-1 para encerrar):");

        while (true) {
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("-1")) {
                break;
            }

            bebeuCerveja.add(nome);
        }

        System.out.println("Lista para dividir a conta:");
        System.out.println(bebeuCerveja);

        bebeuCerveja.add("Aline");

        System.out.println("\nNova lista:");
        System.out.println(bebeuCerveja);

    }
}
