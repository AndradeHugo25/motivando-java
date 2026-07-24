package f_poo.g_exercicios.exercicio37;

abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();

    public abstract String getTipo();

    public void exibirDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Bônus: R$ " + calcularBonus());
        System.out.println("------------------------");
    }
}
