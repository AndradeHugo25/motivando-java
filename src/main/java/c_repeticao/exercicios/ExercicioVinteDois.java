package c_repeticao.exercicios;

import java.util.Scanner;

public class ExercicioVinteDois {
    public static void main(String[] args) {
        //  implemente uma calculadora com as quatro operações básicas
        Scanner in = new Scanner(System.in);

        boolean loop = true;

        while(loop){
            System.out.println("Informe o que deseja fazer: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            int opcao = in.nextInt();

            switch (opcao){
                case 1 -> calculadora(1);
                case 2 -> calculadora(2);
                case 3 -> calculadora(3);
                case 4 -> calculadora(4);
                case 5 -> {
                    System.out.println("Fechando...");
                    loop = false;
                }
            }
        }



    }

    public static void calculadora(int operador){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        float numeroUm = in.nextFloat();
        System.out.println("Informe o segundo numero: ");
        float numeroDois = in.nextFloat();
        float resultado;

        switch (operador) {
            case 1 -> {
                resultado = numeroUm + numeroDois;
                System.out.println(numeroUm + " + " + numeroDois + " = " + resultado);
            }
            case 2 -> {
                resultado = numeroUm - numeroDois;
                System.out.println(numeroUm + " - " + numeroDois + " = " + resultado);
            }
            case 3 -> {
                resultado = numeroUm * numeroDois;
                System.out.println(numeroUm + " * " + numeroDois + " = " + resultado);
            }
            case 4 -> {
                resultado = numeroUm / numeroDois;
                System.out.println(numeroUm + " / " + numeroDois + " = " + resultado);
            }
            default -> System.out.println("Operador Invalido");
        }
    }
}

