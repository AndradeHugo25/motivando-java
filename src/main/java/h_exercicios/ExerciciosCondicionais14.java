package h_exercicios;

import java.util.Scanner;

public class ExerciciosCondicionais14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = String.valueOf(in.nextLine().charAt(0));

        if (nome.equals("a") || nome.equals("e") || nome.equals("i")|| nome.equals("o") || nome.equals("u"))
            System.out.println("Inicia com vogal");
        else {
            System.out.println("Não inicia com vogal");
        }
    }
}