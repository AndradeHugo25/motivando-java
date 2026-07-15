/*Exercicio21*/

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("MAIOR NÚMERO");
        System.out.println("(Digite '-1'para encerrar)\n");

        int maior = Integer.MIN_VALUE;
        boolean digitouAlgumNumero = false;

        while (true) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }

            digitouAlgumNumero = true;
        }

        System.out.println();

        if (digitouAlgumNumero) {
            System.out.println("O maior número foi o " + maior);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

    }
}
