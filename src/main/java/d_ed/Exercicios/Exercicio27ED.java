package d_ed.Exercicios;
import java.util.Scanner;

public class Exercicio27ED {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);

                int[] matriculas = new int[4];
                String[] nomes = new String[4];

                for (int i = 0; i < 4; i++) {

                    System.out.print("Matrícula: ");
                    matriculas[i] = in.nextInt();
                    in.nextLine();

                    System.out.print("Nome: ");
                    nomes[i] = in.nextLine();
                }

                System.out.println("\nMatrículas dos usuários cujos nomes começam com 'A':");

                for (int i = 0; i < 4; i++) {
                    if (nomes[i].toUpperCase().startsWith("A")) {
                        System.out.println(matriculas[i]);
                    }
                }
    }
}
