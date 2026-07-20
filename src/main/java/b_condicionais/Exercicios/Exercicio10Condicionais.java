package b_condicionais.Exercicios;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Exercicio10Condicionais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = 1;
        int B = 5;
        int numeroAleatorio = RandomGenerator.getDefault().nextInt(A, B + 1);
        System.out.println("Advinhe o número aletório entre " + A + " e " + B + ": ");
        System.out.println("Digite seu palpite: ");
        int palpite = in.nextInt();
        while (palpite < A || palpite > B) {
            System.out.println("Digite seu palpite Novamente entre " + A + " e " + B + ": ");
            palpite = in.nextInt();
        }
        String resposta = (palpite == numeroAleatorio) ? "Parabéns! Você acertou." : "Que pena! Você errou. O número correto era: " + numeroAleatorio;
        System.out.println(resposta);
    }
}
