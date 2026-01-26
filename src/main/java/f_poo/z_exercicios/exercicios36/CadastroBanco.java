package f_poo.z_exercicios.exercicios36;

public class CadastroBanco {

    private int numeroConta;
    public String nome;
    public double saldoInicial;
    public double deposito;
    public double saque;


    // Não lembro de como deixar o saldo inicial como opcional, acho que tá errado.
    public CadastroBanco(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldoInicial = saldoInicial;
        this.deposito = deposito;
        this.saque = saque;
    }

    public double getSaldoAtual() {
        return (saldoInicial + deposito - saque - 1);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public void valorInsuficiente() throws Exception {
        if (this.saque > getSaldoAtual()) {
            System.out.println("Valor insuficiente");
            throw new Exception();
        }
    }

    @Override
    public String toString() {
        return "CadastroBanco{" +
                "numeroConta='" + numeroConta + '\'' +
                ", nome =" + nome +
                ", saldo inicial =" + saldoInicial +
                '}';
    }
}
