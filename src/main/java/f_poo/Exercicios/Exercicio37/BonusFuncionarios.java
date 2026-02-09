package f_poo.Exercicios.Exercicio37;

import java.util.Scanner;

public class BonusFuncionarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de Bônus");
        System.out.println("Informa o nome do Funcionário");
        String nome = sc.nextLine();
        System.out.println("Informa o Salario do Funcionário");
        double salario = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe o tipo de Funcionário:\n(I) Para Integral\n(MP) Para Meio período\n(PJ) Para Pessoa Jurídica\n(Temp) Para Temporário.");
        String resposta = sc.nextLine();

        Funcionario funcionario = null;

        switch (resposta.toUpperCase()) {
            case "I":
                System.out.println("Informe a matrícula:");
                int matricula = sc.nextInt();
                sc.nextLine();
                System.out.println("Informe o e-mail:");
                String email = sc.nextLine();
                funcionario = new FuncionarioIntegral(nome, salario, matricula, email);
                break;
            case "MP":
                funcionario = new FuncionarioMeioPeriodo(nome, salario);
                break;
            case "PJ":
                System.out.println("Informe o CNPJ:");
                String cnpj = sc.nextLine();
                System.out.println("Informe os dias trabalhados:");
                int dias = sc.nextInt();
                funcionario = new FuncionarioPJ(nome, salario, cnpj);
                System.out.println("Pagamento: " + ((FuncionarioPJ) funcionario).calcularPagamento(dias));
                break;
            case "TEMP":
                funcionario = new FuncionarioTemporario(nome, salario);
                break;
            default:
                System.out.println("Tipo inválido.");
        }

        if (funcionario != null && !(funcionario instanceof FuncionarioPJ)) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Bônus: " + funcionario.calcularBonus());
            System.out.println("Total (Salário + Bônus): " + (funcionario.getSalario() + funcionario.calcularBonus()));
        }
    }
}
