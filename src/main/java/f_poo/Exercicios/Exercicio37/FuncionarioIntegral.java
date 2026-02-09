package f_poo.Exercicios.Exercicio37;

public class FuncionarioIntegral extends Funcionario {
    private int matricula;
    private String email;

    public FuncionarioIntegral(String nome, double salario, int matricula, String email) {
        super(nome, salario);
        this.matricula = matricula;
        this.email = email;
    }
    @Override
    public double calcularBonus(){
        return getSalario() * 0.10;
    }

}
