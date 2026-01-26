package f_poo.z_correcoes.exercicios37;

public class Integral extends Funcionario {

    public Integral(String nomeFuncionario, double salario) {
        super(nomeFuncionario, salario);
    }

    @Override
    public double calcularBonus() {
        return super.getSalario() * 0.10;
    }
}
