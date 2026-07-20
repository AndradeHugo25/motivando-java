package b_condicionais.Exercicios;

import java.util.Scanner;

public class Exercicio17Condicionais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Digite o primeiro número: ");
        int numero1 = Integer.parseInt(in.nextLine());
        System.out.println("Digite o segundo número: ");
        int numero2 = Integer.parseInt(in.nextLine());
        Double resultado;

        while (opcao < 1 || opcao > 4) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            opcao = in.nextInt();
        }

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a opção 1 - Soma:\n");
                resultado = (double) (numero1 + numero2);
                System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + resultado);
                break;
            case 2:
                System.out.println("Você escolheu a opção 2 - Subtração:\n");
                resultado = (double) (numero1 - numero2);
                System.out.println("A subtração de " + numero1 + " - " + numero2 + " é: " + resultado);
                break;
            case 3:
                System.out.println("Você escolheu a opção 3 - Multiplicação: \n");
                resultado = (double) (numero1 * numero2);
                System.out.println("A multiplicação de " + numero1 + " * " + numero2 + " é: " + resultado);
                break;
            case 4:
                System.out.println("Você escolheu a opção 4 - Divisão:\n");
                if (numero2 != 0) {
                    resultado = (double) (numero1 / (double) numero2);
                    System.out.println("A divisão de " + numero1 + " / " + numero2 + " é: " + String.format("%.2f", resultado));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
        }
    }
}
