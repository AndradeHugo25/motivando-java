package f_poo.z_correcoes.exercicios37;

import lombok.Data;

@Data
public abstract class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();

    @Override
    public String toString() {
        return "Funcionário{" +
                "Nome = '" + nome + '\'' +
                ", Salário = " + salario +
                ", Bônus = " + calcularBonus() +
                '}';
    }
}
