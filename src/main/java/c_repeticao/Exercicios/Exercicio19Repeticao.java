package c_repeticao.Exercicios;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Exercicio19Repeticao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = 1;
        int B = 3;
        int numeroComputador = RandomGenerator.getDefault().nextInt(A, B+1);
        int numeroUsuario = 0;

        while (numeroUsuario != numeroComputador) {
            System.out.println("Digite um número de 1 a 3: ");
            numeroUsuario = in.nextInt();
        }
        System.out.println("Parabéns! Você acertou o número.");
    }
}
