package h_exercicios;

import java.util.Scanner;

public class Exercicios8Condicionais {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = in.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Número Par");
            } else {
                System.out.println("Número Impar");
            }

    }
}
