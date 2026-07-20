package c_repeticao.Exercicios;

import java.util.Scanner;

public class Exercicio21Repeticao {
    public static void main(String[] args) {
        int numero = 0;
        int maior = Integer.MIN_VALUE;
        Scanner in = new Scanner(System.in);

        while (numero != -1){
            System.out.println("Digite um número (ou -1 para sair): ");
            numero = in.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
    }
}
