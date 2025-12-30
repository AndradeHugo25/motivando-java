package a_basico.exercicios;

import java.util.Scanner;

//Cotação em Dólares
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quanto você tem na carteira (em R$): ");
        double reais = scanner.nextDouble();

        // Cotação do dólar (exemplo: 1 USD = 5,44 BRL na cotação do dia 5/12)
        double cotacaoDolar = 5.44;

        // Conversão
        //double dolares = Math.floor(reais / cotacaoDolar);
        double dolares = reais / cotacaoDolar;

        // Truncar para 2 casas decimais
        dolares = Math.floor(dolares * 100) / 100.0;

        // Também pode truncar o valor em reais, se quiser
        //reais = Math.floor(reais * 100) / 100.0;

        // Saída
        System.out.printf("Com R$" + reais + " você pode comprar aproximadamente US$" + dolares);
        //System.out.printf("Com R$ %.2f você pode comprar aproximadamente US$ %.2f%n", reais, dolares);
    }
}
