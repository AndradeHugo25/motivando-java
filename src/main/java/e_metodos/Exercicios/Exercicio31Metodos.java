package e_metodos.Exercicios;

import java.util.Scanner;

public class Exercicio31Metodos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempMin , tempMax;
        System.out.println("Digite a temperatura mínima: ");
        tempMin = in.nextDouble();
        System.out.println("Digite a temperatura máxima: ");
        tempMax = in.nextDouble();
        mediaTemperatura(tempMin, tempMax);
    }

    public static void mediaTemperatura(Double min, Double max) {
        Double media = (min + max) / 2;
        System.out.println("A média da temperatura é: " + media + "°C");
    }
}
