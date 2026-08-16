/*Exercicio29*/

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {

        System.out.println("SOBRENOMES");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String[] partes = nomeCompleto.split(" ");

        System.out.println("Escolha uma opção:");
        System.out.println("(1) Com primeiro sobrenome");
        System.out.println("(2) Com último sobrenome");

        int opcao = scanner.nextInt();

        String nome = partes[0];

        if (opcao == 1) {
            System.out.println(nome + " " + partes[1]);
        } else if (opcao == 2) {
            System.out.println(nome + " " + partes[partes.length - 1]);
        } else {
            System.out.println("Opção inválida!");
        }

    }
}
