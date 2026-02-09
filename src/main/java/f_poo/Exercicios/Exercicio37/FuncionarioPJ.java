package f_poo.Exercicios.Exercicio37;

public class FuncionarioPJ extends Funcionario {
    public String cnpj;

    public FuncionarioPJ(String nome, double salario, String cnpj) {
        super(nome, salario);
        this.cnpj = cnpj;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.02;
    }
    public double calcularPagamento(int dias){
        return getSalario() * dias;
    }

}
