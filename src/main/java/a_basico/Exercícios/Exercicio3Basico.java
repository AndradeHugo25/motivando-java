package a_basico.Exercícios;

import java.util.Scanner;

public class Exercicio3Basico {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a Primeira Nota: ");
        int numero1 = input.nextInt();
        System.out.println("Digite o Segunda Nota: ");
        int numero2 = input.nextInt();

        double media = (numero1 + numero2 ) / 2.0;
        System.out.println("A Média do aluno é: " + media + "!");

    }
}
