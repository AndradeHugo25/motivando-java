/*Exercicio36*/

public class MainExercicio36 {

    public static void main(String[] args) {

        System.out.println("BANCO QA");
        ContaBancaria conta =

                new ContaBancaria(1234, "Patricia", 500.00);

        System.out.println("DADOS INICIAIS");

        System.out.println(conta);

        conta.depositar(200.00);

        System.out.println("\nAPÓS DEPÓSITO");

        System.out.println(conta);

        try {

            conta.sacar(100.00);
            System.out.println("\nAPÓS SAQUE");
            System.out.println(conta);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
