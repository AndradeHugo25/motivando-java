package f_poo;

public class FuncionarioIntegral extends Funcionario {

    private String matricula;
    private String email;

    public FuncionarioIntegral(String nome,
                               double salario,
                               String matricula,
                               String email) {

        super(nome, salario);

        this.matricula = matricula;
        this.email = email;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }
}