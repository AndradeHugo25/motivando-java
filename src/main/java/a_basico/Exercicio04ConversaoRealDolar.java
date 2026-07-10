package a_basico;

import java.util.Scanner;

public class Exercicio04ConversaoRealDolar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor em reais:");
        double reais = in.nextDouble();

        double cotacaoDolar = 5.34;
        double dolares = reais / cotacaoDolar;

        System.out.println("Com R$" + reais +
                " você pode comprar US$" + dolares);

        in.close();
    }
}