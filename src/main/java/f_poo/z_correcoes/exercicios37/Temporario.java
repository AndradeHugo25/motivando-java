package f_poo.z_correcoes.exercicios37;

public class Temporario extends Funcionario {

    public Temporario(String nomeFuncionario, double salario) {
        super(nomeFuncionario, salario);
    }

    @Override
    public double calcularBonus() {
        return 0;
    }
}
