package c_repeticao.correcoes;

import java.util.Scanner;

public class Exercicios21Repeticao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer numMaior = null;
        int numero;

        do {
            System.out.println("Digite um numero ou digite -1 para finalizar: ");
            numero = in.nextInt();

            if ((numero != -1) && (numMaior == null || numero > numMaior)) {
                numMaior = numero;
            }
        } while (numero != -1);

        if (numMaior == null) {
            System.out.println("Encerrando: nenhum número foi digitado.");
        } else {
            System.out.println("Encerrando: o maior número foi " + numMaior);
        }
    }
}
