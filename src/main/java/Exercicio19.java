/*Exercicio19 */

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Exercicio19 {
    public static void main(String[] args) {
        System.out.println("JOGO DA ADIVINHAÇÃO 2.0");

        int num1 = 1;
        int num2 = 3;
        int numeroAleatorio = RandomGenerator.getDefault().nextInt(num1, num2 + 1);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número entre 1 e 3: ");
            int numero = sc.nextInt();

            if (numero == numeroAleatorio) {
                String resultado = (numeroAleatorio == numero) ? "ACERTOU" : "ERROU";
                System.out.println("Você " + resultado + ".");
                break;
            } else {
                System.out.println("Você errou! Tente novamente.\n");
            }
        }
    }
}