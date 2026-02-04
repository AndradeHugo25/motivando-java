package c_repeticao.exercicios;

import java.util.Scanner;

public class ExercicioVinteUm {
    public static void main(String[] args) {

        int maior = 0;

        while (true){
            System.out.println("Digite um número inteiro positivo: ");
            Scanner in = new Scanner(System.in);
            int numero = in.nextInt();

            if (numero > maior){
                maior = numero;
            }

            if (numero < -1){
                System.out.println("inteiro POSITIVO.");
            }
            else if (numero == -1){
                break;
            }
        }

        System.out.println("O maior numero foi " + maior);
    }
}
