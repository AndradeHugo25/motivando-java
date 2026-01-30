package d_ed.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> idades = new ArrayList<>();

        while (true) {
            System.out.println("Informe a idade dos usuários ");
            System.out.println("para sair digite -1 ");
            int idade = sc.nextInt();
            if (idade == -1) {
                break;
            }
            idades.add(idade);
        }
        System.out.println("idades menores de 18 anos");
        for (int i = 0; i < idades.size(); i++) {
            if (idades.get(i) < 18) {
                System.out.println(idades.get(i));
            }
        }

    }

}


