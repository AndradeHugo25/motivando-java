package e_metodos;

import java.util.Scanner;

public class Exercicio33IdadeInvalida20 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean idadeValida = false;

        while (!idadeValida) {

            try {

                System.out.println("Digite uma idade:");
                int idade = in.nextInt();

                validarIdade(idade);

                System.out.println("Idade válida.");
                idadeValida = true;

            } catch (IllegalArgumentException e) {

                System.out.println("Tente uma nova idade");
            }
        }

        in.close();
    }

    public static void validarIdade(int idade) {

        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida.");
        }
    }
}