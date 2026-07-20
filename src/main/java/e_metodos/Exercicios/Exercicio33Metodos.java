package e_metodos.Exercicios;

import java.util.Scanner;

public class Exercicio33Metodos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        int idade = in.nextInt();

        while (idade < 0 || idade > 120) {
             try {
                throw new IllegalArgumentException("Idade inválida. Digite uma idade entre 0 e 120.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                 idade = in.nextInt();
            }
        } if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade <= 65) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é idoso.");
        }
    }
}
