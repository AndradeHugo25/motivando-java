package h_exercicios;

import java.util.Scanner;


public class ExerciciosBasico5 {

    //Happy hour parte 1 e 2

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cerveja = 6;
        System.out.println("Preencha qual nota você possui: ");
        double nota = in.nextDouble();
        int resultado = (int) (nota / cerveja);
        int troco = (int) (nota % cerveja);

        System.out.println("Com uma nota de R$" + nota + " reais, você consegue comprar " + resultado + " cervejas e o troco é de R$" + troco);

    }
}