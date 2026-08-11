/*Exercicio37*/

public class FuncionarioPJ extends Funcionario {

    private String cnpj;

    public FuncionarioPJ(String nome, double salario, String cnpj) {
        super(nome, salario);
        this.cnpj = cnpj;
    }

    public double calcularPagamento(int dias) {
        return salario * dias;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.02;
    }
}
