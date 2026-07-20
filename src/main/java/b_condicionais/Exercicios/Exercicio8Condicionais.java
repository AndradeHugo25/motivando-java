package b_condicionais.Exercicios;

import java.util.Scanner;

public class Exercicio8Condicionais {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = in.nextInt();

        if  (numero % 2 == 0) {
            System.out.printf("O número %d é par.", numero);
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
