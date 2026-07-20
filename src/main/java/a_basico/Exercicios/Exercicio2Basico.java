package a_basico.Exercicios;

import java.util.Scanner;

public class Exercicio2Basico {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = in.nextInt();

        System.out.println("O antecessor de " +numero1 + " é " + (numero1-1) + " e o sucessor é " + (numero1+1));
    }
}
