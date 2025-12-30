package b_condicionais.exercicios;

import java.util.Scanner;
//Determinar se o número digitado é par ou ímpar usando operador ternário
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Usando operador ternário
        String resultado = (numero % 2 == 0) ? "PAR" : "ÍMPAR";

        System.out.println("O número " + numero + " é " + resultado + ".");

        scanner.close();
    }
}

