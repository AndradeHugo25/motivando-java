package b_condicionais.exercicios;

import java.util.Scanner;
//Nome iniciado com Vogal ou Consoante
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        sc.close();

        nome = nome.trim();
        if (nome.isEmpty()) {
            System.out.println("Nome vazio.");
            return;
        }

        char primeiro = Character.toLowerCase(nome.charAt(0));
        String vogais = "aeiouáéíóúâêîôûãõàèìòù";

        if (vogais.indexOf(primeiro) >= 0) {
            System.out.println("O nome começa com vogal.");
        } else {
            System.out.println("O nome começa com consoante.");
        }
    }
}
