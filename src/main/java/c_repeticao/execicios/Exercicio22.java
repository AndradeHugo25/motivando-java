package c_repeticao.execicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;

        while (menu != 6) { // repete até o usuário escolher sair
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - nova operação");
            System.out.println("2 - soma");
            System.out.println("3 - subtração");
            System.out.println("4 - divisão");
            System.out.println("5 - multiplicação");
            System.out.println("6 - sair");

            menu = sc.nextInt();

            if (menu == 6) {
                System.out.println("Encerrando a calculadora...");
                break;
            }

            // se a opção for 1, apenas continua o loop para nova operação
            if (menu == 1) {
                continue;
            }

            System.out.print("Digite o primeiro número: ");
            double numero1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = sc.nextDouble();

            double resultado = 0;

            switch (menu) {
                case 2: // soma
                    resultado = numero1 + numero2;
                    break;
                case 3: // subtração
                    resultado = numero1 - numero2;
                    break;
                case 4: // divisão
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Erro: divisão por zero.");
                        continue; // volta ao menu
                    }
                    break;
                case 5: // multiplicação
                    resultado = numero1 * numero2;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue; // volta ao menu
            }

            System.out.println("Resultado: " + resultado);
        }

        sc.close();
    }
}

