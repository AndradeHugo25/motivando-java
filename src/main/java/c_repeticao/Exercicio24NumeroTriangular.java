package c_repeticao;

import java.util.Scanner;

public class Exercicio24NumeroTriangular {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = in.nextInt();

        int contador = 1;
        boolean triangular = false;

        while (contador * (contador + 1) * (contador + 2) <= numero) {

            int produto = contador * (contador + 1) * (contador + 2);

            if (produto == numero) {
                triangular = true;
                break;
            }

            contador++;
        }

        if (triangular) {
            System.out.println(numero + " é um número triangular.");
        } else {
            System.out.println(numero + " não é um número triangular.");
        }

        in.close();
    }
}