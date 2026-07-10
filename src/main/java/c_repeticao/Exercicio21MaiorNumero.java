package c_repeticao;

import java.util.Scanner;

public class Exercicio21MaiorNumero {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int maiorNumero = Integer.MIN_VALUE;

        while (true) {

            System.out.println("Digite um número inteiro:");
            int numero = in.nextInt();

            if (numero == -1) {
                break;
            }

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior número foi o " + maiorNumero);

        in.close();
    }
}