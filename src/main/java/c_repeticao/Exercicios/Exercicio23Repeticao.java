package c_repeticao.Exercicios;

import java.util.Scanner;

public class Exercicio23Repeticao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = in.nextInt();
        int n = 0;
        int temp = numero;
        while (temp != 0){
          temp /= 10;
          n++;
        }
        System.out.println("O numero " +numero+ " possui " + n + " dígitos: ");
    }
}
