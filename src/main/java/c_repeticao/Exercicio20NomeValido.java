package c_repeticao;

import java.util.Scanner;

public class Exercicio20NomeValido {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean nomeValido = false;

        while (!nomeValido) {

            System.out.println("Digite seu nome completo ou 'cancelar':");
            String nome = in.nextLine();

            if (nome.equalsIgnoreCase("cancelar")) {
                System.out.println("Aplicativo encerrado.");
                break;
            }

            boolean possuiNumero = false;

            for (int i = 0; i < nome.length(); i++) {

                if (Character.isDigit(nome.charAt(i))) {
                    possuiNumero = true;
                    break;
                }
            }

            if (nome.length() < 5 || nome.length() > 50 || possuiNumero) {
                System.out.println("Nome inválido. Tente novamente.");
            } else {
                System.out.println("Nome válido: " + nome);
                nomeValido = true;
            }
        }

        in.close();
    }
}