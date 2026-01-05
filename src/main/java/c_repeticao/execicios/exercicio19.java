package c_repeticao.execicios;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = RandomGenerator.getDefault().nextInt(1,3);
        System.out.println("Informe um numero intero de 1 a 3: ");
        int sorteio = sc.nextInt();

        while (sorteio != numeroAleatorio) {
            System.out.println("Numero Incorreto. Informe um numero intero de 1 a 3: ");
            sorteio = sc.nextInt();

        }
        System.out.println("Parabens acertou");

    }

}
