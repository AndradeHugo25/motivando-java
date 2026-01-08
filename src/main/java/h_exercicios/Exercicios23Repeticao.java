package h_exercicios;

import java.util.Scanner;

public class Exercicios23Repeticao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = in.nextInt();

        int qtdDigitos;

        if (n >= 0 && n <= 9) {
            qtdDigitos = 1;
        } else if (n >= 10 && n <= 99) {
            qtdDigitos = 2;
        } else if (n >= 100 && n <= 999) {
            qtdDigitos = 3;
        } else if (n >= 1000 && n <= 9999) {
            qtdDigitos = 4;
        } else if (n >= 10000 && n <= 99999) {
            qtdDigitos = 5;
        } else if (n >= 100000 && n <= 999999) {
            qtdDigitos = 6;
        } else if (n >= 1000000 && n <= 9999999) {
            qtdDigitos = 7;
        } else if (n >= 10000000 && n <= 99999999) {
            qtdDigitos = 8;
        } else {
            qtdDigitos = 9;
        }
        System.out.println("O número digitado possui " + qtdDigitos + " dígitos");
    }
}

