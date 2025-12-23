package a_basico.Execicios_Feitos;

import io.cucumber.java.bs.A;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class ExercicioDez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = RandomGenerator.getDefault().nextInt(1,10);

        System.out.println("Informe um numero intero de 1 a 10: ");
        int sorteio = sc.nextInt();

        if (sorteio == numeroAleatorio) {
            System.out.println("Acertou seu danado ");
        } else {
            System.out.println("Errou seu danado ");
            System.out.println("o numero sortiado foi: " + numeroAleatorio );
        }

    }
}
