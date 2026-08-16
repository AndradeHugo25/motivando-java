/*Exercicio11 */

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome:");
        String nome = scanner.nextLine();
        if (nome != null && !nome.trim().
                isEmpty())
        {
            if (nome.trim().contains(" ")) {
                System.out.println("Seu nome é composto");
            } else {
                System.out.println("Seu nome não é composto");
            }
        } else
        {
            System.out.println("Entrada inválida: O nome não pode ser nulo ou vazio.");
        }
    }
}