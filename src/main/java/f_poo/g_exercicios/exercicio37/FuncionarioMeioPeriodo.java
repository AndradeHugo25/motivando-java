package f_poo.g_exercicios.exercicio37;

public class FuncionarioMeioPeriodo {
    private String nome;
    private double salario;

    public FuncionarioMeioPeriodo(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularBonus(){
        return this.salario * 0.05;
    }

    public void printarInfo(){
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Nome do funcionario: "+this.getNome());
        System.out.println("Salario do funcionario: "+this.getSalario());
        System.out.println("Bonus do funcionario: " + this.calcularBonus());
        System.out.println("----------------------------------------------");
    }

}
