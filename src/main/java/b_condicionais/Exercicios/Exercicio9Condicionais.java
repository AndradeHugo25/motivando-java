package b_condicionais.Exercicios;

import java.util.Scanner;

public class Exercicio9Condicionais {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = in.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("O número " + numero + " é " + resultado + ".");
    }
}
