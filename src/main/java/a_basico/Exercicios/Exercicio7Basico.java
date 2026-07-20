package a_basico.Exercicios;

import java.util.Scanner;

public class Exercicio7Basico {

    public static void main(String[] args) {

        int tinta = 2;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a largura da parede: ");
        int numero1 = in.nextInt();
        System.out.println("Digite a altura da parede: ");
        int numero2 = in.nextInt();
        System.out.println("A área a ser pintada é: " + (numero1 * numero2));
        System.out.println("Você vai precisar de " + (numero1 * numero2) / tinta + " litros de tinta");
    }
}
