package f_poo.Exercicios.Exercicio36;

import java.util.Scanner;

public class Executavel36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        Cadastro conta = new Cadastro(123, "João Silva", 100.0);
        System.out.println(conta);

        conta.deposito(50.0);
        System.out.println("Após depósito: " + conta);

        try {
            conta.sacar(30.0);
            System.out.println("Após saque: " + conta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
