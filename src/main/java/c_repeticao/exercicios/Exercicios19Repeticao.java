package c_repeticao.exercicios;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Exercicios19Repeticao {
    public static void main(String[] args) {
        int numeroAleatorio = RandomGenerator.getDefault().nextInt(1, 3 + 1);
        boolean acertou = false;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Escolha entre 1, 2 ou 3 ou digite 0 para cancelar");
            int numero = in.nextInt();

            if (numero == numeroAleatorio) {
                acertou = true;
                System.out.println("Parabéns, você acertou!");
            } else if (numero == 0) {
                System.out.println("Encerrando");
                break;
            } else {
                System.out.println("Tente novamente");
            }
        } while (!acertou);
    }
}