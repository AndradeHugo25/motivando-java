package a_basico.Execicios_Feitos;

import java.util.Scanner;

public class ExercícioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Conversão Para Dolar(Moeda de Um Pais Imperialista) ");
        System.out.println("Informe um valor em R$:");
        String carteira1 = scanner.next();
        double valor = Double.parseDouble(carteira1.replace(",", "."));

        System.out.println("Valor informado: R$ " + String.format("%.2f", valor));

        double dolar = valor * 5.53;

        System.out.println("Dolar informado: U$ " + String.format("%.2f", dolar));

        System.out.println("Não Use Dolar, Valorize a sua Moeda ou a Moeda da sua Região");

    }

}
