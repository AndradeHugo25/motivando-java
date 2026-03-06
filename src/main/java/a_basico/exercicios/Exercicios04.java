package a_basico.exercicios;

import java.util.Scanner;

public class Exercicios04 {
    public static void main(String[] args) {
        double dolar = 5.34;
        Scanner in = new Scanner(System.in);
        System.out.println("Quanto você tem na carteira(em R$):");
        double conversao = Float.parseFloat(in.nextLine().replace(',', '.'));
        double dinheiro = (conversao / dolar);
        System.out.println("Você pode comprar: " + Math.round(dinheiro) + " dólar(es)");
    }
}
