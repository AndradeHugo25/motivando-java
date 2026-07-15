/*Exercicio10 */

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Exercicio10 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 5;
        int numeroAleatorio = RandomGenerator.getDefault().nextInt(num1, num2 + 1);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 5: ");
        int numero = sc.nextInt();

        String resultado = (numeroAleatorio == numero) ? "ACERTOU" : "ERROU";
        System.out.println("Você " + resultado + ".");
    }
}
