package f_poo;

public class FuncionarioTemporario extends Funcionario {

    public FuncionarioTemporario(String nome,
                                 double salario) {

        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return 0;
    }
}