/*Exercicio9 */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        String resultado = (numero % 2 == 0) ? "PAR" : "ÍMPAR";

        System.out.println("O número " + numero + " é " + resultado + ".");
    }
}