/*Exercicio30*/

import java.util.Scanner;

public class Exercicio30 {

    public static void boasVindas(String nome) {

        System.out.println("Bem-vindo(a), " + nome + "!");

    }

    public static void main(String[] args) {
        System.out.println("HELLO WORLD 2.0");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        String nome = scanner.nextLine();

        boasVindas(nome);
    }

}
