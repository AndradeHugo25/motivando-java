package b_condicionais.exercicios;

import java.util.Scanner;

//Determinar se o número digitado é par ou ímpar
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificação se é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        scanner.close();
    }
}

