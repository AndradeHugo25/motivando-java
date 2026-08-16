/*Exercicio27*/

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {

        System.out.println("NOMES COM 'A'");

        Scanner scanner = new Scanner(System.in);

        int[] matriculas = new int[4];
        String[] nomes = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Matrícula: ");
            matriculas[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("Matrículas dos usuários com nome iniciado por 'A':");

        for (int i = 0; i < 4; i++) {
            if (nomes[i].toUpperCase().startsWith("A")) {
                System.out.println("Matricula:" + matriculas[i]);
            }

        }
    }
}
