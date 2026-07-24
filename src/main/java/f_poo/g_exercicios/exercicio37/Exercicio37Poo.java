package f_poo.g_exercicios.exercicio37;

import java.util.Scanner;

public class Exercicio37Poo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Funcionario[] funcionarios = {
                new FuncionarioIntegral(
                        "João", 5000, "123", "joao@empresa.com"),

                new FuncionarioMeioPeriodo(
                        "Maria", 3000),

                new FuncionarioPJ(
                        "Carlos", 400, "12.345.678/0001-99"),

                new FuncionarioTemporario(
                        "Ana", 200)
        };

               for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
    }
}
