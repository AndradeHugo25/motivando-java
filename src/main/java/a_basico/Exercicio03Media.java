package a_basico;

import java.util.Scanner;

public class Exercicio03Media {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Nota 1:");
        double nota1 = in.nextDouble();

        System.out.println("Nota 2:");
        double nota2 = in.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média do aluno é " + media + "!");

        in.close();
    }
}