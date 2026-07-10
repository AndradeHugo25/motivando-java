package c_repeticao;

import java.util.Scanner;

public class Exercicio22Calculadora20 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("Escolha uma opção:");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - divisão");
            System.out.println("4 - multiplicação");
            System.out.println("5 - sair");

            int opcao = in.nextInt();

            if (opcao == 5) {
                System.out.println("Calculadora encerrada.");
                break;
            }

            System.out.println("Digite o primeiro número:");
            double numero1 = in.nextDouble();

            System.out.println("Digite o segundo número:");
            double numero2 = in.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + (numero1 + numero2));
                    break;

                case 2:
                    System.out.println("Resultado: " + (numero1 - numero2));
                    break;

                case 3:
                    System.out.println("Resultado: " + (numero1 / numero2));
                    break;

                case 4:
                    System.out.println("Resultado: " + (numero1 * numero2));
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        }

        in.close();
    }
}