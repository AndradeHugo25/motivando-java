package b_condicionais.correcoes;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numeroAleatorio = RandomGenerator.getDefault().nextInt(1, 5 + 1);

        System.out.println("Informe o número desejado: ");
        String resultado = in.nextInt() == numeroAleatorio ? "Acertou!" : "Errou...";

        System.out.println(resultado + "\n" + "O numéro sorteado foi " + numeroAleatorio);

    }
}