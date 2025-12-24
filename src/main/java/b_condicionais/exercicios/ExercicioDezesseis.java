package b_condicionais.exercicios;

import java.util.Scanner;

public class ExercicioDezesseis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Número Entre 1 e 100: ");
        Integer numero = sc.nextInt();
        if (numero >= 1 && numero <= 100) {
            System.out.println("O numero Digitado foi: " + numero);
            System.out.println("O número " + numero + " está dentro do intervalo [1,100}.");
        } else {
            System.out.println("O numero Digitado foi: " + numero);
            System.out.println("O número " + numero + " está fora do intervalo [1,100}.");
        }
    }
}
