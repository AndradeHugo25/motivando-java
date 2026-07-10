package f_poo;

public class ContaBancoQA {

    // Atributos
    private int numeroConta;
    private String titular;
    private double saldo;

    // PASSO 2
    public ContaBancoQA(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    // PASSO 3
    public ContaBancoQA(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = depositoInicial;
    }

    // PASSO 4
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // PASSO 5
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // PASSO 6
    public void depositar(double valor) {
        saldo += valor;
    }

    // PASSO 7
    public void sacar(double valor) {

        double valorTotal = valor + 1;

        if (valorTotal > saldo) {
            throw new RuntimeException("Saldo insuficiente!");
        }

        saldo -= valorTotal;
    }
}