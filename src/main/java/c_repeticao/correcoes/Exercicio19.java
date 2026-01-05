package c_repeticao.correcoes;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = RandomGenerator.getDefault().nextInt(1,3 + 1);
        System.out.println("Informe um número intero de 1 a 3: ");
        int sorteio = sc.nextInt();

        while (sorteio != numeroAleatorio) {
            System.out.println("Número incorreto. Informe um número intero de 1 a 3: ");
            sorteio = sc.nextInt();
        }
        System.out.println("Parabéns acertou!!");
    }
}
