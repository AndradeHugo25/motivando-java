package c_repeticao.correcoes;

import java.util.Scanner;

public class Exercicios20Repeticao {
    public static void main(String[] args) {
        boolean valid = false;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite seu nome ou digite cancelar");
            String nome = in.nextLine().trim();
            boolean semNumero = nome.matches("[\\p{L} '\\-]+");

            if (nome.equals("cancelar")) {
                System.out.println("Encerrando");
                break;
            } else if (nome.length() >= 5 && nome.length() <= 50 && semNumero) {
                valid = true;
                System.out.println("O Nome " + nome + " é válido");
            } else {
                System.out.println("Nome errado, tente novamente");
            }
        } while (!valid);
    }
}