package a_basico;

import java.util.Scanner;

public class Basico {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Sexo:");
        String sexo = in.next();

        System.out.println("Altura:");
        double h = in.nextDouble();

        double pesoIdeal;
        if (sexo.equals("M")) {
            pesoIdeal = (72.7 * h) - 58;
        } else {
            pesoIdeal = (62.1 * h) - 44.7;
        }

        System.out.println("O seu peso ideal é: " + pesoIdeal);
    }

//    Scanner in = new Scanner(System.in);
//        System.out.println("Digite um numero:");
//        int idade = in.nextInt();
//
//        System.out.println();

}






















/*
 * Operador ternário
 * (expressão booleana) ? código 1 : código 2;
 *
 * */