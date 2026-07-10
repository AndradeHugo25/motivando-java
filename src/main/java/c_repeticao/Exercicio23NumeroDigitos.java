package c_repeticao;

import java.util.Scanner;

public class Exercicio23NumeroDigitos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = in.nextInt();

        int quantidadeDigitos = 0;

        if (numero == 0) {
            quantidadeDigitos = 1;
        } else {

            numero = Math.abs(numero);

            while (numero > 0) {
                numero /= 10;
                quantidadeDigitos++;
            }
        }

        System.out.println("O número digitado possui " +
                quantidadeDigitos +
                " dígitos");

        in.close();
    }
}