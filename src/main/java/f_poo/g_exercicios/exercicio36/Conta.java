package f_poo.g_exercicios.exercicio36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conta {
    private int numeroConta;
    private String nomeTitularConta;
    private double saldo;

    static Scanner in = new Scanner(System.in);

    private Conta (int numeroConta, String nomeTitularConta){
        this.numeroConta = numeroConta;
        this.nomeTitularConta = nomeTitularConta;
    }

    private Conta (int numeroConta, String nomeTitularConta, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitularConta = nomeTitularConta;
        this.saldo = saldo;
    }

     public void setNomeTitularConta(String novoNome){
        this.nomeTitularConta = novoNome;
     }

     public void depositar(){
        double deposito;
        System.out.println("Deseja depositar quanto? ");
        deposito = in.nextDouble();
        if (deposito<0){
            System.out.println("Deposito negativo? Voce quer sacar!");
            sacar();
            return;
        } else {
            System.out.println("Depositando $" + deposito);
            this.saldo = this.saldo + deposito;
            System.out.println(this.saldo);
        }
     }

     public void sacar(){
        double saque;
        System.out.println("Quanto deseja sacar? ");
        saque = in.nextDouble();
        if (saque<0){
            System.out.println("Saque negativo? Voce quer depositar!");
            depositar();
            return;
        } else {
            try {
                if ((saque + 1) > this.saldo){
                    throw new Exception("Saldo insuficiente!");
                } else {
                    System.out.println("Aplicando taxa de $1");
                    System.out.println("Sacando $" + saque);
                    this.saldo = this.saldo - (saque + 1);
                    System.out.println(this.saldo);
                }
            } catch (Exception erroSaldoInsuficiente) {
                System.out.println(erroSaldoInsuficiente.getMessage());
                System.out.println("O saldo não foi alterado, refaça o saque com um valor menor.");
            }
        }
     }

     public static Conta criarConta(){

        String insereSaldo = " ";
        int numeroConta = 0;
        String nomeTitularConta = " ";
        double saldo = 0;

        try{

            System.out.println("Você deseja inserir saldo ou não? [S] ou [N]");
            insereSaldo = in.nextLine().trim().toLowerCase();

            if(!insereSaldo.equals("s") && !insereSaldo.equals("n")) {
                throw new Exception ("Informe apenas [S] ou [N] !!!!");

            } else{

                System.out.println("Informe o numero da conta: ");
                numeroConta = in.nextInt();
                in.nextLine();

                System.out.println("Insira o nome do titular da conta: ");
                nomeTitularConta = in.nextLine().trim().toUpperCase();

                if (insereSaldo.equals("s")){

                    System.out.println("Insira o saldo da conta: ");
                    saldo = in.nextDouble();

                    if (saldo<0){
                        System.out.println("Não é possível criar conta com saldo negativo.");
                        System.out.println("O saldo será ZERO.");
                        saldo = 0;
                    }
                    return new Conta(numeroConta, nomeTitularConta, saldo);
                } else {
                    return new Conta(numeroConta, nomeTitularConta);
                }
            }
        } catch (InputMismatchException erroInputInesperado) {
            System.out.println("Você inseriu o tipo de dado errado.");
        }
        catch (Exception erroDigitacao) {
            System.out.println(erroDigitacao.getMessage());
        }
         return null;
     }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitularConta() {
        return nomeTitularConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
