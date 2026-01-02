package b_condicionais.correcoes;

import java.util.Scanner;

//Lista de frutas preferidas com banana
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exibe exatamente a pergunta pedida
        System.out.print("Diga 3 frutas que você gosta de comer, separados por vírgula: ");
        String listaFrutas = sc.nextLine().toLowerCase();
        sc.close();

        if (listaFrutas.trim().isEmpty()) {
            System.out.println("Lista de frutas vazia.");
            return;
        }

        if (listaFrutas.contains("banana")) {
            System.out.println("A lista contém banana.");
        } else {
            System.out.println("A lista não contém banana.");
        }
    }
}