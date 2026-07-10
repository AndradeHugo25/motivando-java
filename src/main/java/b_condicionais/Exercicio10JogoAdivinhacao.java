package b_condicionais;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Exercicio10JogoAdivinhacao {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numeroAleatorio = RandomGenerator.getDefault().nextInt(1, 6);

        System.out.println("Digite um número de 1 a 5:");
        int numeroUsuario = in.nextInt();

        if (numeroUsuario == numeroAleatorio) {
            System.out.println("Parabéns! Você acertou.");
        } else {
            System.out.println("Você errou.");
            System.out.println("Número sorteado: " + numeroAleatorio);
        }

        in.close();
    }
}