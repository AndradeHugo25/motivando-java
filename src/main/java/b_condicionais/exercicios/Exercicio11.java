package b_condicionais.exercicios;

import java.util.Scanner;
//Nome simples ou composto
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        sc.close();

        if (nome == null) {
            System.out.println("Nome inválido: valor nulo.");
            return;
        }

        nome = nome.trim();
        if (nome.isEmpty()) {
            System.out.println("Nome inválido: string vazia.");
            return;
        }

        // permite apenas letras (inclui acentos) e espaços
        if (!nome.matches("^[\\p{L} ]+$")) {
            System.out.println("Nome inválido: contém números ou caracteres especiais.");
            return;
        }

        String[] partes = nome.split("\\s+");
        if (partes.length == 1) {
            System.out.println("Nome simples: apenas um nome.");
        } else if (partes.length == 2) {
            System.out.println("Nome composto: dois nomes.");
        } else {
            System.out.println("Nome composto: mais de dois nomes.");
        }
    }
}
