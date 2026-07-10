package b_condicionais;

import java.util.Scanner;

public class Exercicio11NomeComposto {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = in.nextLine();

        if (nome != null && !nome.isBlank() && nome.contains(" ")) {
            System.out.println("Seu nome é composto.");
        } else {
            System.out.println("Seu nome não é composto.");
        }

        in.close();
    }
}