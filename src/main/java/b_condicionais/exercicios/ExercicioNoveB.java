package b_condicionais.exercicios;

import java.util.Scanner;

public class ExercicioNoveB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = in.nextInt();

        String resultado = numero >= 1 && numero <= 100 ? "O número " + numero + " está dentro do intervalo [1, 100]" : "O número " + numero + " está fora do intervalo [1, 100]";
        System.out.println(resultado);

    }
}
