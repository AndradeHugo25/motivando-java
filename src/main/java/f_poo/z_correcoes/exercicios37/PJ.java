package f_poo.z_correcoes.exercicios37;

public class PJ extends Funcionario {

    public PJ(String nomeFuncionario, double salario) {
        super(nomeFuncionario, salario);
    }

    @Override
    public double calcularBonus() {
        return super.getSalario() * 0.02;
    }
}
