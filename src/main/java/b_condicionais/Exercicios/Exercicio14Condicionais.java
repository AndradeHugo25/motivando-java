package b_condicionais.Exercicios;

import java.util.Scanner;

public class Exercicio14Condicionais {
    public static void main(String[] args) {

        System.out.println("Digite seu nome: ");
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();

        if ("aeiouAEIOU".contains(String.valueOf(nome.charAt(0)))) {
            System.out.println("Seu nome começa com uma vogal.");
        } else {
            System.out.println("Seu nome não começa com uma vogal.");
        }
    }
}
