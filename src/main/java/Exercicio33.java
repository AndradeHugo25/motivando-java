/*Exercicio33*/

import java.util.Scanner;

public class Exercicio33 {

    public static void validarIdade(int idade) {

        if (idade < 0 || idade > 120) {

            throw new IllegalArgumentException("Idade inválida!");
        }
    }

    public static void main(String[] args) {
        System.out.println("IDADE INVÁLIDA 2.0");

        Scanner scanner = new Scanner(System.in);

        boolean idadeValida = false;

        while (!idadeValida) {

            try {

                System.out.print("Digite sua idade: ");

                int idade = scanner.nextInt();

                validarIdade(idade);

                System.out.println("Idade válida: " + idade);

                idadeValida = true;


            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

                System.out.println("Tente uma nova idade: ");

            }

        }

        scanner.close();

    }

}