package h_exercicios;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Exercicios19Repeticao {
    public static void main(String[] args) {
        int numeroAleatorio = RandomGenerator.getDefault().nextInt(1, 3 + 1);
        boolean acertou = false;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Escolha entre 1, 2 ou 3: ");
            int numero = in.nextInt();

            if (numero == numeroAleatorio) {
                acertou = true;
                System.out.println("Parabéns, você acertou!");
            } else {
                System.out.println("Tente novamente");
            }
        } while (!acertou);

//Em forma de while:
//        while (!acertou) {
//            Scanner in = new Scanner(System.in);
//            System.out.println("Escolha entre 1, 2 ou 3: ");
//            int numero = in.nextInt();
//
//            if (numero == numeroAleatorio) {
//                acertou = true;
//                System.out.println("Acertou");
//            } else {
//                System.out.println("Tente novamente");
    }
}