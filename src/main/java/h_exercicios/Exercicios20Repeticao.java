package h_exercicios;

import java.util.Scanner;

public class Exercicios20Repeticao {
    public static void main(String[] args) {
        boolean valid = false;
 //ainda falta a opção de cancelar

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite seu nome:");
            String nome = in.nextLine().trim();
            boolean semNumero = nome.matches("[\\p{L} '\\-]+");

            if (!nome.isEmpty() && nome.length() <= 50 && semNumero) {
                valid = true;
                System.out.println("O Nome " + nome + " é valido");
            } else {
                System.out.println("Nome errado, tente novamente");
            }
        } while (!valid);
    }
}