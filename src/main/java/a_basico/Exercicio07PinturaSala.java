package a_basico;

import java.util.Scanner;

public class Exercicio07PinturaSala {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a largura da parede:");
        double largura = in.nextDouble();

        System.out.println("Digite a altura da parede:");
        double altura = in.nextDouble();

        double area = largura * altura;
        double litrosTinta = area / 2;

        System.out.println("A área a ser pintada é " + area + " m².");
        System.out.println("Você vai precisar de " + litrosTinta + " litros de tinta.");

        in.close();
    }
}