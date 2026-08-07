/*Exercicio31*/

import java.util.Scanner;

public class Exercicio31 {

    public static double calcularMedia(double temp1, double temp2) {

        return (temp1 + temp2) / 2;

    }

    public static void main(String[] args) {
        System.out.println("TEMPERATURA MÉDIA");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira temperatura: ");

        double temp1 = scanner.nextDouble();

        System.out.print("Digite a segunda temperatura: ");

        double temp2 = scanner.nextDouble();

        double media = calcularMedia(temp1, temp2);

        System.out.println("Temperatura média: " + media + "°C");
    }
}