package f_poo.z_correcoes.exercicios36;

public class Conta {

    private final int numeroConta;
    private double saldo;
    public String nome;

    public Conta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = 0;
    }

    public Conta(int numeroConta, String nome, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = depositoInicial;
    }

    public void sacar(double valor) throws Exception {
        double saqueTotal = valor + 1;
        if (saqueTotal > this.saldo) {
            throw new Exception("Saldo insuficiente!");
        }
        this.saldo -= saqueTotal;
        System.out.println("Saque realizado: R$" + valor + "\n");
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Conta {" +
                "numeroConta= '" + numeroConta + '\'' +
                ", nome = " + nome +
                ", saldo = " + saldo +
                '}';
    }
}
