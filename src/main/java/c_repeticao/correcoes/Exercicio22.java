package c_repeticao.correcoes;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Informe o que deseja fazer: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = in.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Informe o primeiro número: ");
                float numeroUm = in.nextFloat();
                System.out.print("Informe o segundo número: ");
                float numeroDois = in.nextFloat();
                switch (opcao) {
                    case 1 -> System.out.println(numeroUm + " + " + numeroDois + " = " + (numeroUm + numeroDois));
                    case 2 -> System.out.println(numeroUm + " - " + numeroDois + " = " + (numeroUm - numeroDois));
                    case 3 -> System.out.println(numeroUm + " * " + numeroDois + " = " + (numeroUm * numeroDois));
                    case 4 -> {
                        if (numeroDois == 0) {
                            System.out.println("Erro: Divisão por zero não é permitida.");
                        } else {
                            System.out.println(numeroUm + " / " + numeroDois + " = " + (numeroUm / numeroDois));
                        }
                    }
                }
            } else if (opcao == 5) {
                System.out.println("Fechando...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        } while (opcao != 5);
    }
}
