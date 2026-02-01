package c_repeticao.execicios;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int numero = sc.nextInt();
        boolean triangular = false;
        int i = 1;

        while (i * (i + 1) * (i + 2) <= numero) {
            int produto = i * (i + 1) * (i + 2);
            if (produto == numero) {
                triangular = true;
            System.out.println("O numero " + numero + " é triangular" );
            break;
            } i++;
        }
        if (! triangular) {
            System.out.println("O numero " + numero + " NÃO é triangular");
        }
    }


}
