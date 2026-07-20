package d_ed.Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio26ED {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> idades = new ArrayList<>();

        System.out.println("Digite as idades dos usuários (digite -1 para encerrar):");
        while (true) {
            int idade = in.nextInt();
            if (idade == -1) {
                break;
            }
            idades.add(idade);
        }
        for (int i = 0; i < idades.size(); i++) {
            if (idades.get(i) < 18) {
                idades.remove(i);
                i--;
            }
        }
        System.out.println("Quantidade de usuários restantes: " + idades.size());
    }
}
