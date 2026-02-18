package c_repeticao.correcoes;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maior = 0;

        System.out.println("Digite um número inteiro positivo ou -1 para sair: ");
        int numero = in.nextInt();

        while (numero != -1) {
            if (numero > maior) {
                maior = numero;
            }
            System.out.println("Digite outro inteiro positivo ou -1 para sair: ");
            numero = in.nextInt();
        }

        System.out.println("O maior número foi " + maior);
    }
}
