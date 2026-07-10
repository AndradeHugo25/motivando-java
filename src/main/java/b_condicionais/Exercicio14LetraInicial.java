package b_condicionais;

import java.util.Scanner;

public class Exercicio14LetraInicial {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = in.nextLine();

        char primeiraLetra = Character.toLowerCase(nome.charAt(0));

        if (primeiraLetra == 'a' ||
                primeiraLetra == 'e' ||
                primeiraLetra == 'i' ||
                primeiraLetra == 'o' ||
                primeiraLetra == 'u') {

            System.out.println("Inicia com uma vogal.");
        } else {
            System.out.println("Não inicia com uma vogal.");
        }

        in.close();
    }
}