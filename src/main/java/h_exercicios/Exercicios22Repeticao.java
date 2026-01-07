
package h_exercicios;

import java.util.Scanner;

public class Exercicios22Repeticao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Calculadora - Escolha uma operação:");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("0 - sair");
            System.out.print("Opção: ");

            String opcao = in.nextLine().trim();

            if (opcao.equals("0")) {
                System.out.println("Encerrando... Obrigado!");
                break;
            }

            in = new Scanner(System.in);
            System.out.println("Digite o primeiro número:");
            int primeiro = in.nextInt();

            in = new Scanner(System.in);
            System.out.println("Digite o segundo número:");
            int segundo = in.nextInt();

            switch (opcao) {
                case "1" -> {
                    System.out.println("Resultado: " + (primeiro + segundo));
                    break;
                }
                case "2" -> {
                    System.out.println("Resultado: " + (primeiro - segundo));
                    break;
                }
                case "3" -> {
                    System.out.println("Resultado: " + (primeiro * segundo));
                    break;
                }
                case "4" -> {
                    System.out.println("Resultado: " + (primeiro / segundo));
                    break;
                }
            }

            System.out.print("Deseja realizar outra operação? (s/n): ");
            String continuar = in.nextLine().trim().toLowerCase();
            if (!continuar.equals("s") && !continuar.equals("sim")) {
                System.out.println("Encerrando... Até logo!");
                break;
            }
        } while (true);
    }
}
