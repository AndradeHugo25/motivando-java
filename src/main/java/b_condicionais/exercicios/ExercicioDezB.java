package b_condicionais.exercicios;

import java.util.Scanner;

public class ExercicioDezB {
    public static void main(String[] args) {
        //  implemente uma calculadora com as quatro operações básicas

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        Float numeroUm = in.nextFloat();
        in.nextLine();
        System.out.println("Informe a operação desejada: ");
        String operador = in.nextLine();
        System.out.println("Informe o segundo numero: ");
        Float numeroDois = in.nextFloat();
        Float resultado = calculadora(numeroUm, numeroDois, operador);
        if (resultado == null){ //para caso o operador tenha sido inválido
            System.out.println("Fechando programa.");
        }
        else {
            System.out.println("O resultado de " + numeroUm + " " + operador + " " + numeroDois + " é " + resultado);
            System.out.println("Fechando programa.");
        }
    }

    public static Float calculadora(Float numeroUm, Float numeroDois, String operador){
        operador = operador.trim();
        switch (operador) { // utilizei switch case pois a ide recomendou e achei interessante pela didática
            case "+" -> {
                return numeroUm + numeroDois;
            }
            case "-" -> {
                return numeroUm - numeroDois;
            }
            case "*" -> {
                return numeroUm * numeroDois;
            }
            case "/" -> {
                return numeroUm / numeroDois;
            }
            default -> {
                System.out.println("Operador inválido.");
                return null;
            }
        }
    }
}