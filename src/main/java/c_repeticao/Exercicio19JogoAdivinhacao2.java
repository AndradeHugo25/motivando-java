package c_repeticao;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Exercicio19JogoAdivinhacao2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numeroAleatorio = RandomGenerator.getDefault().nextInt(1, 4);

        int numeroUsuario = 0;

        while (numeroUsuario != numeroAleatorio) {

            System.out.println("Digite um número de 1 a 3:");
            numeroUsuario = in.nextInt();

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou.");
            } else {
                System.out.println("Você errou. Tente novamente.");
            }
        }

        in.close();
    }
}