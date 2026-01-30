package d_ed.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> matriculasComA = new ArrayList<>();


        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o nome do Usuário: ");
            String nome = sc.nextLine();

            System.out.println("Informe a matrícula do Usuário: ");
            int matricula = sc.nextInt();
            sc.nextLine();

            if (nome.toUpperCase().startsWith("A")) {
                matriculasComA.add(matricula);
            }
        }

        System.out.println("Matriculas de usuário de tem nomes que iniciam com A: ");
        for (int m : matriculasComA) {
            System.out.println(m);
        }

    }

}
