package f_poo.z_exercicios.exercicios36;

public class Main {
    public static void main(String[] args) throws Exception {
        CadastroBanco cadastramento1 = new CadastroBanco(9999912, "Bruno");
        cadastramento1.setNome("Bruno Carmo");
        cadastramento1.setSaldoInicial(58000.80);
        System.out.println(cadastramento1);
        System.out.println("Valor inicial: U$" + cadastramento1.saldoInicial);

//        Inclusão deposito e saque
        cadastramento1.setDeposito(5000.20);
        cadastramento1.setSaque(1000.00);
        double saldoAtual = cadastramento1.getSaldoAtual();
        System.out.println("Saldo atual: U$" + saldoAtual);

//        Saque de saldo insuficiente
        cadastramento1.setSaque(60000.90);
        cadastramento1.valorInsuficiente();
        System.out.println("Saldo atual: U$" + saldoAtual);
    }
}
