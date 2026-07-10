package b_condicionais;

import java.util.Scanner;

public class Exercicio15Frutas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Diga 3 frutas que você gosta de comer, separados por vírgula:");
        String frutas = in.nextLine();

        if (frutas.toLowerCase().contains("banana")) {
            System.out.println("A lista possui banana!");
        } else {
            System.out.println("A lista não possui banana!");
        }

        in.close();
    }
}