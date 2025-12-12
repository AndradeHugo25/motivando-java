package h_exercicios;

import java.util.Scanner;

public class Exercicios7Basico {

    //Pintura da sala

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a largura da parede: ");
        double largura = in.nextDouble();

        System.out.println("Digite a altura da parede");
        double altura = in.nextDouble();

        double area = largura * altura;
        double tinta = area / 2;

        System.out.println("A área a ser pintada é de : " + area + "m². Você vai precisar de " + tinta + " litros de tinta");
    }
}