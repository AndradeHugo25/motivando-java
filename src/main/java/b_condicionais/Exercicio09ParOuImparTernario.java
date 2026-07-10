package b_condicionais;

import java.util.Scanner;

public class Exercicio09ParOuImparTernario {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = in.nextInt();

        String resultado = (numero % 2 == 0) ? "par" : "ímpar";

        System.out.println("O número é " + resultado + ".");

        in.close();
    }
}