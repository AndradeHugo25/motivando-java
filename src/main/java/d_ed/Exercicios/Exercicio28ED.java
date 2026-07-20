package d_ed.Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio28ED {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.print("Quantos nomes deseja informar? ");
        int quantidade = in.nextInt();
        in.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes.add(in.nextLine());
        }
        String resposta;
        do {
            System.out.print("\nDeseja adicionar um nome no final? (s/n): ");
            resposta = in.nextLine().toLowerCase();

            if (resposta.equals("s")) {
                System.out.print("Digite o nome a adicionar: ");
                nomes.add(in.nextLine());
            } else if (!resposta.equals("n")) {
                System.out.println("Resposta inválida! Digite 's' ou 'n'.");
            }
        } while (!resposta.equals("s") && !resposta.equals("n"));

        System.out.println("\nVetor final de nomes:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println((i + 1) + ". " + nomes.get(i));
        }
    }
}
