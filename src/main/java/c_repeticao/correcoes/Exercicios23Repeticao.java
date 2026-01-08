package c_repeticao.correcoes;

import java.util.Scanner;

public class Exercicios23Repeticao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = in.nextInt();
        int qtdDigitos = 0;

        while (n > 0) {
            n /= 10;
            qtdDigitos++;
        }

        System.out.println("O número possui " + qtdDigitos + " dígito(s)");
    }
}

