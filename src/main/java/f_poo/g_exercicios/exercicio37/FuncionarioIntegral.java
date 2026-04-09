package f_poo.g_exercicios.exercicio37;

public class FuncionarioIntegral extends FuncionarioMeioPeriodo {

    private String matricula;
    private String email;

    @Override
    public void printarInfo(){
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Nome do funcionario: " + super.getNome());
        System.out.println("Matricula do funcionario: " + this.getMatricula());
        System.out.println("Email do funcionario: " + this.getEmail());
        System.out.println("Salario do funcionario: " + super.getSalario());
        System.out.println("Bonus do funcionario: " + this.calcularBonus());
        System.out.println("----------------------------------------------");
    }


    public FuncionarioIntegral(String nome, double salario, String matricula, String email) {
        super(nome, salario);
        this.matricula = matricula;
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public double calcularBonus() {
        double salario = super.getSalario();
        return salario * 0.1;
    }
}
