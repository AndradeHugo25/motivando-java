package f_poo.g_exercicios.exercicio36;

import java.util.Scanner;

public class Exercicio36Poo {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            ContaBancaria conta1;
            System.out.println("Digite o número da conta:");
            int numero = in.nextInt();
            in.nextLine();
            System.out.println("Digite o nome do titular:");
            String titular = in.nextLine();
            System.out.println("Deseja Depositar algum valor? (s/n)");
            String resposta = in.nextLine();
            double depositoInicial = 0;
            if (resposta.equalsIgnoreCase("s")) {
                System.out.println("Digite o valor do depósito inicial (opcional):");
                depositoInicial = in.nextDouble();
                conta1 = new ContaBancaria(numero, titular, depositoInicial);
            } else {
                conta1 = new ContaBancaria(numero, titular);
            }



            System.out.println(conta1);

            int op;
            do {
                System.out.println("Oque deseja fazer? \n1- Depositar\n2- Sacar\n3- Sair");
                op = in.nextInt();
                if (op == 1) {
                    System.out.println("Digite o Valor que deseja depositar:");
                    conta1.depositar(in.nextDouble());
                    System.out.println("Conta Atualizada: " + conta1);
                } else if (op == 2) {
                    System.out.println("Digite o Valor que deseja sacar:");
                    conta1.sacar(in.nextDouble());
                    System.out.println("Conta Atualizada: " + conta1);
                } else if (op == 3) {
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } while (op != 3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
