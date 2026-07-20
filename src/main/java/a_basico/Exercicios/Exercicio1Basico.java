package a_basico.Exercicios;

import java.util.Scanner;

public class Exercicio1Basico {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = in.nextLine();
        System.out.println("Olá, " + name + ", seja bem-vindo(a)!");
    }
}
