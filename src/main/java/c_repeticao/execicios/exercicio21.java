package c_repeticao.execicios;


import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE; // inicializa com o menor valor possível*

        while (true) {
            System.out.print("Digite um número inteiro: ");
            numero = sc.nextInt();
            // Gerar números entre -150 e 150
           // numero = random.nextInt(301) - 150;
           // System.out.println("Número gerado: " + numero);

            if (numero == -1) { // quando deve parar
                break;
            }

            if (numero > 0 && numero > maior) {
                maior = numero;
            }
        }

        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum número positivo foi digitado.");
        } else {
            System.out.println("O maior número foi o " + maior);
        }

        sc.close();
    }
}

