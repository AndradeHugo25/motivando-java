package f_poo.g_exercicios.exercicio36;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = Conta.criarConta();
        assert conta1 != null;
        conta1.depositar();
        conta1.sacar();

    }
}
