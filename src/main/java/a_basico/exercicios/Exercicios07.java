package a_basico.exercicios;

import java.util.Scanner;

public class Exercicios07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a largura da parede?");
        double largura = Float.parseFloat(in.nextLine().replace(',', '.'));
        System.out.println("Qual a altura da parede?");
        double altura = Float.parseFloat(in.nextLine().replace(',', '.'));
        System.out.println("A área a ser pintada é de " + (largura * altura) + "m² e a quantidade de tinta necessária é de " + ((largura * altura) / 2) + " litros");
    }
}
