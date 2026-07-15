/*Exercicio24*/

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("NUMERO TRIANGULAR");

        System.out.print("\nDigite um número inteiro: ");

        int numero = scanner.nextInt();

        int i = 1;
        int produto = 0;

        while (produto < numero) {
            produto = i * (i + 1) * (i + 2);

            if (produto == numero) {
                break;
            }
            i++;
        }

        System.out.println();

        if (produto == numero) {
            System.out.println("O número " + numero + " é triangular!");
            System.out.println("    " + i + " x " + (i + 1) + " x " + (i + 2) + " = " + numero);
        } else {
            System.out.println("O número " + numero + " não é triangular.");
        }
    }
}
