package c_repeticao.exercicios;

import java.util.Scanner;

public class Exercicios20Repeticao {
    public static void main(String[] args) {
        boolean valid = false;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite seu nome ou digite cancelar");
            String nome = in.nextLine().trim();
            boolean semNumero = nome.matches("[\\p{L} '\\-]+");

            if (!nome.isEmpty() && nome.length() <= 50 && semNumero && !nome.equals("cancelar")) {
                valid = true;
                System.out.println("O Nome " + nome + " é valido");
            } else if (nome.equals("cancelar")){
                System.out.println("Encerrando");
                break;
            } else {
                System.out.println("Nome errado, tente novamente");
            }
        } while (!valid);
    }
}