package b_condicionais.Exercicios;

import java.util.Scanner;

public class Exercicio11Condicionais {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nome;
        do {
            System.out.printf("Digite seu Nome: ");
            nome = in.nextLine();
            if (nome != null && !nome.trim().isEmpty()) {
                if (nome.trim().contains(" ")) {
                    System.out.println("Seu nome é Composto");
                } else {
                    System.out.println("Seu nome não é Composto");
                }
            }
        } while (nome == null || nome.trim().isEmpty());
    }
}

