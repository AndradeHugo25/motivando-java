package b_condicionais.correcoes;

import java.util.Scanner;
import java.util.random.RandomGenerator;
//import java.util.Random;

//Sorteio de um número inteiro aleatório de 1 a 5
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Random random = new Random();


        // Definindo intervalo do sorteio (1 a 5)
        int A = 1;
        int B = 5;

        // Sorteia número entre 1 e 5 usando RandomGenerator
        int numeroSorteado = RandomGenerator.getDefault().nextInt(A, B + 1);

        System.out.print("Digite um número de 1 a 5: ");
        int numeroDigitado = scanner.nextInt();

        // Verifica se acertou
        if (numeroDigitado == numeroSorteado) {
            System.out.println("Parabéns! Você acertou. O número sorteado foi " + numeroSorteado + ".");
        } else {
            System.out.println("Que pena! Você errou. O número sorteado foi " + numeroSorteado + ".");
        }

        scanner.close();
    }
}

