package f_poo.z_correcoes.exercicios36;

public class Main {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new Conta(1, "Jeniffer", 50000);
        System.out.println(conta1 + "\n");


        Conta conta2 = new Conta(2, "Bruno");
        conta2.setNome("Bruno Carmo");

        conta2.depositar(10000);
        System.out.println(conta2 + "\n");

        conta2.sacar(4000);
        System.out.println(conta2 + "\n");

        conta2.sacar(800000);
    }
}
