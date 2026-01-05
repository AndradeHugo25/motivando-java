package c_repeticao.correcoes;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Escolha a opção desejada:\n" +
                "1 - nova operação\n" +
                "2 - soma\n" +
                "3 - subtração\n" +
                "4 - divisão\n" +
                "5 - multiplicação\n" +
                "6 - sair");

            menu = sc.nextInt();

            if (menu != 6 && menu != 1) {
                System.out.print("Digite o primeiro número: ");
                double numero1 = sc.nextDouble();

                System.out.print("Digite o segundo número: ");
                double numero2 = sc.nextDouble();

                double resultado = 0;
                switch (menu) {
                    case 2 -> resultado = numero1 + numero2;
                    case 3 -> resultado = numero1 - numero2;
                    case 4 -> {
                        if (numero2 == 0) {
                            System.out.println("Erro: divisão por zero.");
                            continue;
                        } else {
                            resultado = numero1 / numero2;
                        }
                    }
                    case 5 -> resultado = numero1 * numero2;
                    default -> System.out.println("Opção inválida.");
                }
                System.out.println("O resultado é: " + resultado);
            }
        } while (menu != 6);

        System.out.println("Calculadora encerrada.");
        sc.close();
    }
}
