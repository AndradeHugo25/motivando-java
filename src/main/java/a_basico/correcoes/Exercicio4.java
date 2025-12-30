package a_basico.correcoes;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantia em R$: ");
        double quantia = sc.nextDouble();
        double cotacao = 5.34;
        double conversao = quantia / cotacao;
        System.out.println("Você pode comprar US$" + String.format("%.2f", conversao));
    }
}

