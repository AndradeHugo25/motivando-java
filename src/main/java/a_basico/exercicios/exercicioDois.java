package a_basico.exercicios;

import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {
//        Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
//
//
//        Exemplo:
//        Digite um número:
//        9
//        O antecessor de 9 é 8 e o sucessor é 10

        Scanner in = new Scanner(System.in);
        System.out.println("O programa irá mostrar o antecessor e o sucessor do número informado.");
        System.out.println("Digite um número inteiro: ");
        int numero = in.nextInt();
        int numeroAntecessor = numero - 1;
        int numeroSucessor = numero + 1;
        System.out.println("O antecessor de " + numero + " é " + numeroAntecessor + " e o sucessor é " + numeroSucessor);
    }
}
