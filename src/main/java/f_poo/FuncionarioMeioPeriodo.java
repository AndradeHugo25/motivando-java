package f_poo;

public class FuncionarioMeioPeriodo extends Funcionario {

    public FuncionarioMeioPeriodo(String nome,
                                  double salario) {

        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05;
    }
}