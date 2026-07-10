package a_basico;

import java.util.Scanner;

public class Exercicio02AntecessorSucessor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = in.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de " + numero +
                " é " + antecessor +
                " e o sucessor é " + sucessor);

        in.close();
    }
}