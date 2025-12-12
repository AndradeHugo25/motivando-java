package h_exercicios;

import java.util.Scanner;

public class Exercicios1Basico {

    //Hello Word

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = in.next();
        System.out.println("Olá, " + nome + ",bem vindo!");
    }
}
