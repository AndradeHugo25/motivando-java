package c_repeticao.correcoes;


import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE; // inicializa com o menor valor possível

        do {
            System.out.print("Digite um número inteiro: ");
            numero = sc.nextInt();

            if (numero > 0 && numero > maior) {
                maior = numero;
            }
        } while (numero != -1);

        System.out.println("O maior número foi o " + maior);
        sc.close();
    }
}
