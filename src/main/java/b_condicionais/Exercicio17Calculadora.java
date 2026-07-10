package b_condicionais;

import java.util.Scanner;

public class Exercicio17Calculadora {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = in.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = in.nextDouble();

        System.out.println("Digite a operação (+, -, *, /):");
        String operacao = in.next();

        if (operacao.equals("+")) {
            System.out.println("Resultado: " + (numero1 + numero2));
        } else if (operacao.equals("-")) {
            System.out.println("Resultado: " + (numero1 - numero2));
        } else if (operacao.equals("*")) {
            System.out.println("Resultado: " + (numero1 * numero2));
        } else if (operacao.equals("/")) {
            System.out.println("Resultado: " + (numero1 / numero2));
        } else {
            System.out.println("Operação inválida!");
        }

        in.close();
    }
}