package f_poo.z_exercicios.exercicios37;

public class Funcionario {

    public String nomeFuncionario;
    public double salario;
    private Categoria categoria;

    public enum Categoria {
        INTEGRAL, MEIOPERIODO, PJ, TEMPORARIO
    }

    public Funcionario(String nomeFuncionario, double salario, Categoria categoria) {
        this.nomeFuncionario = nomeFuncionario;
        this.salario = salario;
        this.categoria = categoria;
    }

    public String getNome() {
        return nomeFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double calculoBonus() {
        if (categoria == Categoria.INTEGRAL) {
            return salario * 0.10;
        } else if (categoria == Categoria.MEIOPERIODO) {
            return salario * 0.05;
        } else if (categoria == Categoria.PJ) {
            return salario * 0.02;
        } else if (categoria == Categoria.TEMPORARIO) {
            return 0.0;
        } else {
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Nome Funcionario='" + nomeFuncionario + '\'' +
                ", Salário=" + salario +
                ", Categoria=" + categoria +
                ", Salário + Bônus =" + calculoBonus() +
                '}';
    }
}
