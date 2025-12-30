package a_basico.correcoes;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média do aluno é " + media);
    }
}
