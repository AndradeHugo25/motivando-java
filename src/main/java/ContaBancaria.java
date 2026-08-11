/*Exercicio36*/

public class ContaBancaria {

    private final int numeroConta;

    private String titular;

    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public ContaBancaria(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws Exception {
        double valorTotal = valor + 1.00;
        if (valorTotal > saldo) {
            throw new Exception("Saldo insuficiente!");
        }

        saldo -= valorTotal;
    }

    public String toString() {
        return "Conta: "
                + numeroConta
                + ", Titular: "
                + titular
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
}
