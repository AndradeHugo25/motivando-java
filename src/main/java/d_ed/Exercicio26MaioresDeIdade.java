package d_ed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio26MaioresDeIdade {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Integer> idades = new ArrayList<>();

        while (true) {

            System.out.println("Digite uma idade (-1 para encerrar):");
            int idade = in.nextInt();

            if (idade == -1) {
                break;
            }

            idades.add(idade);
        }

        long quantidadeMaiores = idades.stream()
                .filter(idade -> idade >= 18)
                .count();

        System.out.println("Restaram " + quantidadeMaiores + " usuários na lista.");

        in.close();
    }
}