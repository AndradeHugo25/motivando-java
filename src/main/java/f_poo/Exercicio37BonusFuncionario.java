package f_poo;

public class Exercicio37BonusFuncionario {

    public static void main(String[] args) {

        FuncionarioIntegral integral =
                new FuncionarioIntegral(
                        "Joao",
                        5000,
                        "123",
                        "joao@email.com");

        FuncionarioMeioPeriodo meioPeriodo =
                new FuncionarioMeioPeriodo(
                        "Maria",
                        3000);

        FuncionarioPJ pj =
                new FuncionarioPJ(
                        "Carlos",
                        4000,
                        "12345678000199");

        FuncionarioTemporario temporario =
                new FuncionarioTemporario(
                        "Ana",
                        2500);

        System.out.println("FUNCIONARIO INTEGRAL");
        System.out.println("Nome: " + integral.getNome());
        System.out.println("Salario: R$ " + integral.getSalario());
        System.out.println("Bonus: R$ " + integral.calcularBonus());

        System.out.println();

        System.out.println("FUNCIONARIO MEIO PERIODO");
        System.out.println("Nome: " + meioPeriodo.getNome());
        System.out.println("Salario: R$ " + meioPeriodo.getSalario());
        System.out.println("Bonus: R$ " + meioPeriodo.calcularBonus());

        System.out.println();

        System.out.println("FUNCIONARIO PJ");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Salario: R$ " + pj.getSalario());
        System.out.println("Bonus: R$ " + pj.calcularBonus());
        System.out.println("Pagamento 20 dias: R$ "
                + pj.calcularPagamento(20));

        System.out.println();

        System.out.println("FUNCIONARIO TEMPORARIO");
        System.out.println("Nome: " + temporario.getNome());
        System.out.println("Salario: R$ " + temporario.getSalario());
        System.out.println("Bonus: R$ " + temporario.calcularBonus());
    }
}