package f_poo.Exercicios.Exercicio37;

public abstract class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double calcularBonus();

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Bonus do Funcionario: " + calcularBonus());
    }


}
