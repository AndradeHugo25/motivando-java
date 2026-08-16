/*Exercicio22*/

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA");

        boolean ligada = true;

        while (ligada) {

            System.out.println("\nEscolha a opção desejada:");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - divisão");
            System.out.println("4 - multiplicação");
            System.out.println("5 - sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            if (opcao == 5) {
                System.out.println("\nFinalizado!");
                ligada = false;
                continue;
            }

            if (opcao < 1 || opcao > 5) {
                System.out.println("Opção inválida! Escolha um número de 1 a 5.\n");
                continue;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("\n-> Resultado da soma: " + num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("\n-> Resultado da subtração: " + num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3:
                    resultado = num1 / num2;
                    System.out.println("\n-> Resultado da divisão: " + num1 + " / " + num2 + " = " + resultado);
                    break;
                case 4:
                    resultado = num1 * num2;
                    System.out.println("\n-> Resultado da multiplicação: " + num1 + " * " + num2 + " = " + resultado);
                    break;
            }
        }
    }
}

