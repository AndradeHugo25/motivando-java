/*Exercicio23*/

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("NÚMERO DE DÍGITOS");

        System.out.print("Digite um número inteiro: ");
        int numeroDigitado = scanner.nextInt();

        int numeroTemp = numeroDigitado;
        int contador = 0;

        do {
            contador++;
            numeroTemp /= 10;
        } while (numeroTemp != 0);

        if (contador == 1)
        {
            System.out.println("O número digitado possui " + contador + " dígito");
        }
        else{
            System.out.println("O número digitado possui " + contador + " dígitos");
        }
    }
}
