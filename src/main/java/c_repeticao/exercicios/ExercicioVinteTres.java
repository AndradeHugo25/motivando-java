package c_repeticao.exercicios;

import java.util.Scanner;

public class ExercicioVinteTres {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número: ");
        float numero = in.nextFloat();
        int contador = 1;

        while (numero > 10){
            contador = contador + 1;
            numero = numero / 10;
        }

        System.out.println("O número digitado possui " + contador + " dígitos.");
    }
}
