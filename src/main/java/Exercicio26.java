/*Exercicio26*/

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio26 {
    public static void main(String[] args) {

        System.out.println("MAIORES DE IDADE");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();

        int idade;

        while (true) {
            System.out.print("Digite a idade (para sair digite -1): ");
            idade = scanner.nextInt();

            if (idade == -1) {
                break;
            }

            idades.add(idade);
        }

        idades.removeIf(i -> i < 18);

        System.out.println("Restaram na lista " + idades.size() + " usuários maiores de idade!");

    }
}
