/*Exercicio37*/

public class MainExercicio37 {

    public static void main(String[] args) {

        System.out.println("BÔNUS FUNCIONÁRIO");

        FuncionarioIntegral integral = new FuncionarioIntegral("Shakira", 5000, "123", "shakira@empresa.com");

        FuncionarioMeioPeriodo meioPeriodo = new FuncionarioMeioPeriodo("Pelé", 3000);

        FuncionarioPJ pj = new FuncionarioPJ("Xuxa", 400, "12.345.678/0001-99");

        FuncionarioTemporario temporario = new FuncionarioTemporario("Trump", 2500);

        integral.exibirDados();
        meioPeriodo.exibirDados();
        pj.exibirDados();
        temporario.exibirDados();

        System.out.println("Pagamento PJ por 20 dias: R$ " + pj.calcularPagamento(20));
    }
}