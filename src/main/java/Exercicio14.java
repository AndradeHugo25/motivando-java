/*Exercicio14*/

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga seu nome: ");
        String nome = scanner.nextLine().trim();

        char primeiraLetra = Character.toLowerCase(nome.charAt(0));

        if (primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i' || primeiraLetra == 'o' || primeiraLetra == 'u') {
            System.out.println("Inicia com uma vogal");
        } else {
            System.out.println("Não inicia com uma vogal");
        }
    }
}
