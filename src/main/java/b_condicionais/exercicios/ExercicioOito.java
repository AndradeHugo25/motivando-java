package b_condicionais.exercicios;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número e irei dizer se é par ou ímpar: ");
        int numero = in.nextInt();

        if (numero % 2 == 0){
            System.out.println(numero + " é par");
        }
        else {
            System.out.println(numero + " é ímpar");
        }
    }
}

/* Escreva um programa que leia um número do teclado e diga se ele é par ou ímpar. */