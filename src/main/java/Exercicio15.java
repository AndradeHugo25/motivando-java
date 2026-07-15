/*Exercicio15*/

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga 3 frutas que você gosta de comer, separados por vírgula: ");
        String frutas = scanner.nextLine();

        if (frutas.toLowerCase().contains("banana")) {
            System.out.println("A lista possui banana!");
        } else {
            System.out.println("A lista não possui banana!");
        }
    }
}
