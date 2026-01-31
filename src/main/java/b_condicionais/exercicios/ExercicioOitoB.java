package b_condicionais.exercicios;

import java.util.Scanner;

public class ExercicioOitoB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Diga 3 frutas que você gosta de comer, separados por vírgula: ");
        String listaFrutas = in.nextLine().trim().toLowerCase();

        if (listaFrutas.contains("banana")){
            System.out.println("A lista possui banana");
        }
        else {
            System.out.println("A lista nao possui banana");
        }
    }
}
