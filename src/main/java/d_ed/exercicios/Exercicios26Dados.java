package d_ed.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios26Dados {

    public static List<Integer> numerosMaioresQue18(List<Integer> numeros) {
        return numeros.stream()
                .filter(numero -> numero > 18)
                .toList();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numerosDigitados = new ArrayList<>();
        int numero;


        System.out.println("Digite as idades. Digite -1 para finalizar.");

        do {
            System.out.print("Número: ");
            numero = in.nextInt();

            if (numero != -1) {
                numerosDigitados.add(numero);
            }

        } while (numero != -1);

        List<Integer> maioresDeIdade = numerosMaioresQue18(numerosDigitados);

        System.out.println("\nNúmeros digitados: " + numerosDigitados);
        System.out.println("Maiores de idade (> 18): " + maioresDeIdade);


    }
}