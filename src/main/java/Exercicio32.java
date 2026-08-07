/*Exercicio32*/

import java.util.Scanner;

public class Exercicio32 {

    public static void validarIdade(int idade) {

        if (idade < 0 || idade > 120) {

            throw new IllegalArgumentException("Idade inválida!");

        }

        System.out.println("Idade válida: " + idade);

    }

    public static void main(String[] args) {

        System.out.println("IDADE INVÁLIDA");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");

        int idade = scanner.nextInt();

        try {

            validarIdade(idade);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

        scanner.close();

    }

}