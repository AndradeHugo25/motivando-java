package d_ed.Exercicios;

import java.util.Scanner;

public class Exercicio29ED {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome Completo:");
        String nomeCompleto = in.nextLine();
        System.out.println("Nome completo: " + nomeCompleto);

        System.out.println("Digite 1 para ver o primeiro nome ou 2 para ver o último nome:");
        int opcao = in.nextInt();
        if (opcao == 1) {
            System.out.println("Primeiro nome: " + nomeCompleto.split(" ")[0] + " " + nomeCompleto.split(" ")[1]);
        } else if (opcao == 2) {
            String[] nomes = nomeCompleto.split(" ");
            System.out.println("Último nome: " +nomeCompleto.split(" ")[0] +" " + nomes[nomes.length - 1]);
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
