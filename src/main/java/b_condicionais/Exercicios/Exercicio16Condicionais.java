package b_condicionais.Exercicios;

import java.util.Scanner;

public class Exercicio16Condicionais {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = Integer.parseInt(in.nextLine());

        if (numero >= 1 && numero <= 100) {
            System.out.println("O número "+ numero + " está entre 1 e 100");
        } else {
            System.out.println("O número "+ numero + " NÃO está entre 1 e 100");
        }
    }
}
