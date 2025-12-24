package b_condicionais.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioQuinze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga 3 frutas que você gosta de comer, separados por vírgula: ");
        String frutas = sc.nextLine();

        String[] listaFrutas = frutas.split(",");
        boolean temBananaLaele = false;

        for (String fruta : listaFrutas) {
            if (fruta.trim().equalsIgnoreCase("Banana")) {
                temBananaLaele = true;
                break;

            }
        }
        if (temBananaLaele) {
            System.out.println("Usuário digitou: " + Arrays.toString(listaFrutas));// para poder mostrar a lista
            System.out.println("A lista tem Banana ");
        } else {
            System.out.println("Usuário digitou: " + Arrays.toString(listaFrutas));
            System.out.println("Não tem Banana na lista ");
        }

    }

}
