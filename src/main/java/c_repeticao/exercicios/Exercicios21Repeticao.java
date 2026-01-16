package c_repeticao.exercicios;

import java.util.Scanner;

public class Exercicios21Repeticao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer numMaior = null;
        boolean finaliza = false;

        do {
            System.out.print("Digite um numero ou digite -1 para finalizar: ");
            int numero = in.nextInt();

            if (numero == -1) {
                finaliza = true;
            } else {
                if (numMaior == null || numero > numMaior) {
                    numMaior = numero;
                }
                System.out.println("Continua");
            }
        } while (!finaliza);
        System.out.println("Encerrando: o maior número foi " + numMaior);
    }
}
