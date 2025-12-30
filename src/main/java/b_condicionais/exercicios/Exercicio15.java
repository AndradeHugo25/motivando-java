package b_condicionais.exercicios;

import java.util.Scanner;

//Lista de frutas preferidas com banana
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        // Exibe exatamente a pergunta pedida
        System.out.print("Diga 3 frutas que você gosta de comer, separados por vírgula: ");
        String listaFrutas = sc.nextLine();
        sc.close();

        if (listaFrutas == null || listaFrutas.trim().isEmpty()) {
            System.out.println("Lista de frutas vazia.");
            return;
        }

        String[] frutas = listaFrutas.split(",");
        boolean temBanana = false;

        for (String f : frutas) {
            if (f.trim().equalsIgnoreCase("banana")) {
                temBanana = true;
                break;
            }
        }

        if (temBanana) {
            System.out.println("A lista contém banana.");
        } else {
            System.out.println("A lista não contém banana.");
        }
    }
}