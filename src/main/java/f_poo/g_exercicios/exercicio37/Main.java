package f_poo.g_exercicios.exercicio37;

public class Main {
    public static void main(String[] args) {
        FuncionarioMeioPeriodo func1 = new FuncionarioMeioPeriodo("Eduardo", 1000);
        func1.printarInfo();
        FuncionarioIntegral func2 = new FuncionarioIntegral("Luiz", 1000, "123123", "teste@gmail.com");
        func2.printarInfo();
        FuncionarioTemporario func3 = new FuncionarioTemporario("Marcos", 1000, 15);
        func3.printarInfo();
        FuncionarioPJ func4 = new FuncionarioPJ("Pedro", 1000, "3123131HG-31");
        func4.printarInfo();

    }
}
