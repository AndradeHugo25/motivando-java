package f_poo.Exercicios.Exercicio37;

public class FuncionarioMeioPeriodo extends Funcionario {
    public FuncionarioMeioPeriodo (String nome, double salario){
        super (nome, salario);
    }

    @Override
    public double calcularBonus(){
        return getSalario() * 0.05;
    }
}
