/*Exercicio37*/

public class FuncionarioMeioPeriodo extends Funcionario {

    public FuncionarioMeioPeriodo(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularBonus() {
        return salario * 0.05;
    }
}