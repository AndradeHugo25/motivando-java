package e_metodos.Exercicios;

import java.util.Scanner;

public class Exercicio32Metodos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        int idade = in.nextInt();

        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida. Digite uma idade entre 0 e 120.");
        }else if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade <= 65) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é idoso.");
        }

    }
}
