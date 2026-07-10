package f_poo;

import java.util.Scanner;

public class Exercicio36BancoQA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Deseja informar deposito inicial? (s/n): ");
        char resposta = scanner.next().charAt(0);

        ContaBancoQA conta;

        if (resposta == 's' || resposta == 'S') {

            System.out.print("Valor do deposito inicial: ");
            double depositoInicial = scanner.nextDouble();

            conta = new ContaBancoQA(
                    numeroConta,
                    titular,
                    depositoInicial);

        } else {

            conta = new ContaBancoQA(
                    numeroConta,
                    titular);
        }

        System.out.println("\nDados da conta:");
        System.out.println("Conta: " + conta.getNumeroConta()
                + ", Titular: " + conta.getTitular()
                + ", Saldo: R$ " + conta.getSaldo());

        System.out.print("\nValor para deposito: ");
        double deposito = scanner.nextDouble();

        conta.depositar(deposito);

        System.out.println("\nDados da conta apos deposito:");
        System.out.println("Conta: " + conta.getNumeroConta()
                + ", Titular: " + conta.getTitular()
                + ", Saldo: R$ " + conta.getSaldo());

        System.out.print("\nValor para saque: ");
        double saque = scanner.nextDouble();

        try {

            conta.sacar(saque);

            System.out.println("\nDados da conta apos saque:");
            System.out.println("Conta: " + conta.getNumeroConta()
                    + ", Titular: " + conta.getTitular()
                    + ", Saldo: R$ " + conta.getSaldo());

        } catch (RuntimeException e) {

            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}