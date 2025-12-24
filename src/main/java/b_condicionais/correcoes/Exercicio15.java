package b_condicionais.correcoes;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga 3 frutas que você gosta de comer, separados por vírgula: ");
        String frutas = sc.nextLine().toLowerCase();

        if (frutas.contains("banana")) {
            System.out.println("A lista possui banana.");
        } else {
            System.out.println("A lista não possui banana.");
        }
    }
}
