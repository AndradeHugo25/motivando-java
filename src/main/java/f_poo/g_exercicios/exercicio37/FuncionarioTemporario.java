package f_poo.g_exercicios.exercicio37;

class FuncionarioTemporario extends Funcionario {

    public FuncionarioTemporario(String nome, double salario) {
        super(nome, salario);
    }

    // Método específico do temporário
    public double calcularPagamento(int dias) {
        return salario * dias;
    }

    @Override
    public double calcularBonus() {
        return 0;
    }

    @Override
    public String getTipo() {
        return "Funcionário Temporário";
    }

    @Override
    public void exibirDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Bônus: R$ " + calcularBonus());
        System.out.println("------------------------");
    }

}
