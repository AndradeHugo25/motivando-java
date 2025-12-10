package h_exercicios;

import java.util.Scanner;

public class ExerciciosCondicionais11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = in.nextLine();

        if (nome.contains(" ")) {
            System.out.println("Seu nome é composto");
        } else {
            System.out.println("Seu nome não é composto");
        }

        in = new Scanner(System.in);
        System.out.println("Digite outro nome:");
        boolean nomeComposto = in.nextLine().contains(" ");

        System.out.println("O nome digitado é composto? " + nomeComposto);
    }
}
