package h_exercicios;

import java.util.Scanner;

public class Exercicios2Basico {

    //Programa de antecessor e sucessor

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = in.nextInt();

        System.out.println("O antecessor de " + numero + " é " + (numero - 1) + " e o seu sucessor é " + (numero + 1));

    }
}