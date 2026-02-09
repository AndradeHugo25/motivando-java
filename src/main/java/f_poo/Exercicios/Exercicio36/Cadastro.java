package f_poo.Exercicios.Exercicio36;

public class Cadastro {

    private int numeroConta;
    private String nomeTitulo;
    private double saldo;

    public Cadastro() {
    }

    //construtor
    public Cadastro(int numeroConta, String nomeTitulo) {
        this.numeroConta = numeroConta;
        this.nomeTitulo = nomeTitulo;
        this.saldo = 0.0; // para que se o usia´rio não tiver saldo ene vai iniciar com 0
    }

    public Cadastro(int numeroConta, String nomeTitulo, double valorDepositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitulo = nomeTitulo;
        this.saldo = valorDepositoInicial;
    }

    void alterarNome(String novoNome) {
        this.nomeTitulo = novoNome;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) throws Exception {
        double taxa = 1.0;
        if (valor + taxa > saldo) {
            throw new Exception("Saldo insuficiante!");
        }
        saldo -= (valor + taxa);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public double getSaldo() {
        return saldo;
    }
    @Override
    public String toString() {
        return "Conta: " + numeroConta + ", Titular: " + nomeTitulo + ", Saldo: R$ " + saldo;
    }
}



