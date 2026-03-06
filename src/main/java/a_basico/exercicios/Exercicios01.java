package a_basico.exercicios;

import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = in.nextLine();
        System.out.println("Olá " + nome + ", seja bem-vindo!");
    }
}
