package h_exercicios;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class ExerciciosCondicionais10 {

    public static void main(String[] args) {
        int numeroAleatorio = RandomGenerator.getDefault().nextInt(1, 5 + 1);

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = in.nextInt();

        if (numero == numeroAleatorio) {
            System.out.println("Você acertou! o número certo é " + numeroAleatorio );
        } else {
            System.out.println("Você errou, o número certo é " + numeroAleatorio);
        }
    }
}