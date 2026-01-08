
package c_repeticao.correcoes;

import java.util.Scanner;

public class Exercicios22Repeticao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Calculadora - Escolha uma operação:");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("0 - sair");
            System.out.print("Opção: ");

            opcao = in.nextInt();

            if (opcao != 0) {
                System.out.println("Digite o primeiro número:");
                int primeiro = in.nextInt();

                System.out.println("Digite o segundo número:");
                int segundo = in.nextInt();

                switch (opcao) {
                    case 1 -> System.out.println("Resultado: " + (primeiro + segundo));
                    case 2 -> System.out.println("Resultado: " + (primeiro - segundo));
                    case 3 -> System.out.println("Resultado: " + (primeiro * segundo));
                    case 4 -> {
                        if (segundo != 0) {
                            System.out.println("Resultado: " + (primeiro / segundo));
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                    }
                }

                System.out.print("Deseja realizar outra operação? (s/n): ");
                String continuar = in.next().trim().toLowerCase();
                if (!continuar.equals("s") && !continuar.equals("sim")) {
                    System.out.println("Encerrando... Até logo!");
                    break;
                }
            }
        } while (opcao != 0);
    }
}
