package f_poo.g_exercicios.exercicio36;

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
        if  (depositoInicial >= 0) {
            depositar(depositoInicial);
        } else {
            System.out.println("O depósito inicial não pode ser negativo.");
        }

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
        if  (valor >= 0) {
            saldo += valor;
        } else {
            System.out.println("O valor do depósito não pode ser negativo.");
        }
    }

    public void sacar(double valor) {
        double valorTotal = valor + 1.0;
        if (valor >= 0) {
            if (valorTotal > saldo) {
                System.out.println("Saldo insuficiente! Saldo atual: R$ " + String.format("%.2f", saldo) + " - Taxa de Saque R$ 1,00  = R$ " + String.format("%.2f", valorTotal));
            } else {
                saldo -= valorTotal;
            }
        } else {
            System.out.println("O valor do saque não pode ser negativo.");
        }
    }

    @Override
    public String toString() {
        return "Conta "
                + numeroConta
                + ", Titular: "
                + titular
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
}
