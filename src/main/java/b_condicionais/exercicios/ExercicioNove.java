package b_condicionais.exercicios;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número e irei dizer se é par ou ímpar: ");
        String resultado = in.nextInt() % 2 == 0 ? "Par" : "Impar";
        // o tipo está relacionado com a saída que eu espero
        // a condição não tem relação com o tipo da variavel

        System.out.println(resultado);
    }
}

/* Escreva um programa que leia um número do teclado e diga se ele é par ou ímpar.

Obs.: Utilize operador ternário. */