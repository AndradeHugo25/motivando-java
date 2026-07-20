package c_repeticao.Exercicios;


import java.util.Scanner;

public class Exercicio24Repeticao {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Informe um número inteiro para verificar se é triangular: ");
                int numero = in.nextInt();

                boolean triangular = false;
                int n = 1;

                while (n * (n + 1) * (n + 2) <= numero) {

                    if (n * (n + 1) * (n + 2) == numero) {
                        triangular = true;
                        System.out.println(numero + " é um número triangular.");
                        System.out.println(numero + " = " + n + " x " + (n + 1) + " x " + (n + 2));
                        break;
                    }

                    n++;
                }

                if (!triangular) {
                    System.out.println(numero + " não é um número triangular.");
                }
    }
}
