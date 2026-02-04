package c_repeticao.exercicios;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class ExercicioDezenove {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numeroAleatorio = RandomGenerator.getDefault().nextInt(1, 3);
        int numeroDesejado;
        do {
            System.out.println("Informe o número desejado: ");
            numeroDesejado = in.nextInt();
        } while (numeroDesejado != numeroAleatorio);

        System.out.println("Você acertou!");
    }
}
