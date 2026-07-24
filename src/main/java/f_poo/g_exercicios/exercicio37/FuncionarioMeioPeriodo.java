package f_poo.g_exercicios.exercicio37;

class FuncionarioMeioPeriodo extends Funcionario {

    public FuncionarioMeioPeriodo(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05;
    }

    @Override
    public String getTipo() {
        return "Funcionário Meio Período";
    }
}
