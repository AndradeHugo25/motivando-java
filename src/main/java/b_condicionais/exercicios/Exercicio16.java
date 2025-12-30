package b_condicionais.exercicios;

import java.util.Scanner;
//Número pertence ao intervalo entra 1 e 100
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Digite um número inteiro: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n >= 1 && n <= 100) {
                System.out.println("O número " + n + " está no intervalo de 1 a 100.");
            } else {
                System.out.println("O número " + n + " não está no intervalo de 1 a 100.");
            }
        } else {
            System.out.println("Número inválido. Digite um número inteiro.");
        }
        sc.close();
    }
}
