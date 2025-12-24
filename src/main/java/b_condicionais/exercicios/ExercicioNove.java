package b_condicionais.exercicios;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println ("Informe um numero intero: ");
        int numero = sc.nextInt();

        String resultado = (numero % 2 == 0)
                ? "o numero " + numero + " é par"
                : "o numero " + numero + " é impar";
        System.out.println(resultado);
        sc.close();
    }
}
