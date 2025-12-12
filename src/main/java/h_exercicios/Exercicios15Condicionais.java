package h_exercicios;

import java.util.Scanner;

public class Exercicios15Condicionais {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 3 frutas, separados por vírgula:");
        String fruta = in.nextLine();

        if (fruta.contains("banana")) {
            System.out.println("A lista possui banana");
        } else {
            System.out.println("A lista não possui banana");
        }
    }
}
