package c_repeticao.correcoes;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean nomeValido = false;
        int menu;
        String nome;

        do {
            System.out.println("1 - Iniciar programa ");
            System.out.println("2 - Cancelar ");
            menu = sc.nextInt();
            sc.nextLine();

           if (menu == 1) {
                System.out.println("Digite seu nome completo: ");
                nome = sc.nextLine();

                if (nome.length() < 5 || nome.length() > 50) {
                    System.out.println("Erro: O nome deve ter entre 5 e 50 caracteres.");
                    continue;
                }

                if (nome.matches(".*\\d.*")) {
                    System.out.println("Erro: O nome não pode conter números.");
                    continue;
                }

               nomeValido = true;
               System.out.println("Nome válido informado: " + nome);
           } else if (menu == 2) {
                System.out.println("Programa cancelado.");
            } else {
                System.out.println("Erro: Opção inválida.");
            }
        } while (menu != 2 && !nomeValido);

    }
}

