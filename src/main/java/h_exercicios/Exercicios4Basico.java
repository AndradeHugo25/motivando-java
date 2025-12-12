package h_exercicios;

import java.util.Scanner;


public class Exercicios4Basico {

    //Conversão real x dólar

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Preencha quantos reais você possui:");
        double real = in.nextDouble();
        double dolar = 5.33;
        double resultado = (real / dolar);

        System.out.println("Você possui " + resultado + " doláres");
    }
}