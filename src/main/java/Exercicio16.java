/*Exercicio16*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 100) {
            System.out.println("O número " + numero + " está dentro do intervalo [1, 100]");
        } else {
            System.out.println("O número " + numero + " está fora do intervalo [1, 100]");
        }
    }
}
