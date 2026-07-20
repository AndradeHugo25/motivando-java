package a_basico.Exercicios;

import java.util.Scanner;

public class Exercicio4Basico {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite quantos R$ você tem na carteira:");
        double dinheiro = Double.parseDouble(in.nextLine());
        double dolar = dinheiro / 5.34;
        System.out.println("Você tem R$ " + dinheiro + " na carteira.");
        System.out.println("Você pode comprar US$ " + String.format("%.2f", dolar) + " com essa quantia.");
    }
}
