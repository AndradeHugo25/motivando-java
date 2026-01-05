package c_repeticao.execicios;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;

        while (menu != 2) { // repete até o usuário escolher sair
            System.out.println("1 - Iniciar programa ");
            System.out.println("2 - Cancelar ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 2) {
                System.out.println("Cancelando programa...");
                break;
            }
            else if (menu == 1) {
                while (true) {
                    System.out.println("Digite seu nome completo: ");
                    String nome = sc.nextLine();

                    if (nome.length() < 5 || nome.length() > 50) {
                        System.out.println("Erro: O nome deve ter entre 5 e 50 caracteres.");
                        continue;
                    }

                    if (nome.matches(".*\\d.*")) {
                        System.out.println("Erro: O nome não pode conter números.");
                        continue;
                    }

                    System.out.println("Nome válido informado: " + nome);
                    break;
                }
                break; // sai do laço principal após execução
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}

