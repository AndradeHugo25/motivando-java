package a_basico.exercicios;

import java.util.Scanner;

public class exercicioQuatro {
    public static void main(String[] args) {
//        Faça um programa que leia a quantia em dinheiro que uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar.
//
//                Considere US$1,00 = R$5,34.

        System.out.println("O programa irá calcular quantos dólares você pode comprar.\n");
        System.out.println("De acordo com a sua quantia em real (R$).\n");

        Scanner in = new Scanner(System.in);
        System.out.println("Informa a sua quantia em real: ");

        float quantia = in.nextFloat();
        float quantidadeDolar = (float) (quantia/5.34);

        System.out.printf("Você pode comprar %.2f dólares.\n", quantidadeDolar); //se for pegar os centavos

//        int quantidadeDolarInt = (int) (quantidadeDolar);
//        System.out.printf("Você pode comprar %d dólares.\n", quantidadeDolarInt); //se for pegar apenas inteiro
    }
}
