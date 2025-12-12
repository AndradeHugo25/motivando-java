package h_exercicios;

import java.util.Scanner;

public class Exercicios16Condicionais {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numero = in.nextInt();

        if (numero <= 100) {
            System.out.println("O número " + numero + " está dentro do intervalo");
        } else {
            System.out.println("O número " + numero + " está fora do intervalo");
        }
    }
}
