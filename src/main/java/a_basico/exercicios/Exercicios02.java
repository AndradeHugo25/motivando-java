package a_basico.exercicios;

import java.util.Scanner;

public class Exercicios02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = in.nextInt();
        System.out.println("O antecessor de " + numero + " é " + (numero-1) + " e o sucessor é " + (numero+1));

    }
}
