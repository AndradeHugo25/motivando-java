package a_basico.correcoes;

import java.util.Scanner;

public class Exercicio1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o seu nome? ");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + ", seja bem-vindo!");
    }
}