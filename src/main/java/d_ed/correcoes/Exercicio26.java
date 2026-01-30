package d_ed.correcoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> idades = new ArrayList<>();

        int idade;
        do {
            System.out.println("Informe a idade dos usuário\nOu digite -1 para sair: ");
            idade = sc.nextInt();
            if (idade != -1) {
                idades.add(idade);
            }
        } while (idade != -1);

        System.out.println("\nIdades menores de 18 anos:");
        for (Integer aux : idades) {
            if (aux < 18) {
                System.out.print(aux + "  ");
            }
        }
    }
}
