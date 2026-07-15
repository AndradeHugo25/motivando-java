/*Exercicio19*/

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("APLICATIVO NOME VÁLIDO");
        System.out.println("(Digite 'cancelar' a qualquer momento para encerrar)\n");

        while (true) {
            System.out.print("Digite seu nome completo: ");
            String nome = scanner.nextLine().trim();

              if (nome.equalsIgnoreCase("cancelar")) {
                System.out.println("Aplicativo cancelado");
                break;
            }

             if (nome.length() < 5 || nome.length() > 50) {
                System.out.println("O nome deve conter entre 5 e 50 caracteres. Tente novamente.\n");
                continue;
            }

            boolean contemNumeros = false;
            for (int i = 0; i < nome.length(); i++) {
                if (Character.isDigit(nome.charAt(i))) {
                    contemNumeros = true;
                    break;
                }
            }

            if (contemNumeros) {
                System.out.println("O nome não pode conter números. Tente novamente.\n");
                continue;
            }

            System.out.println("Nome válido cadastrado com sucesso: " + nome);

            break;
        }
    }
}