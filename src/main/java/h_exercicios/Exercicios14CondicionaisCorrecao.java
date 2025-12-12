package h_exercicios;

import java.util.Scanner;

public class Exercicios14CondicionaisCorrecao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = in.nextLine().toLowerCase();

        if (nome.startsWith("a") || nome.startsWith("e") || nome.startsWith("i") || nome.startsWith("o") || nome.startsWith("u")) {
            System.out.println("Inicia com vogal");
        } else {
            System.out.println("Não inicia com vogal");
        }
    }
}