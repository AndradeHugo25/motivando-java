package b_condicionais.correcoes;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        sc.close();

        if (nome == null) {
            System.out.println("Nome inválido: valor nulo.");
            return;
        }

        if (nome.isEmpty()) {
            System.out.println("Nome inválido: string vazia.");
            return;
        }

        if (nome.contains(" ")) {
            System.out.println("Nome composto");
        } else {
            System.out.println("Nome simples");
        }
    }
}
