package a_basico;

import java.util.Scanner;

public class Exercicio01HelloWorld {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        // Utilizei nextLine() para permitir a leitura do nome completo
        String nome = in.nextLine();

        System.out.println("Olá " + nome + ", seja bem-vindo!");

        in.close();
    }
}