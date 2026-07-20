package b_condicionais.Exercicios;

import java.util.Scanner;

public class Exercicio15Condicionais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frutaProcurada = "Banana";
        System.out.println("Diga 3 frutas que você gosta de comer, separados por vírgula: ");

        String[] frutas = in.nextLine().split(",");
        for (String fruta : frutas) {
            if (fruta.trim().equalsIgnoreCase(frutaProcurada)) {
                System.out.println("A lista possui:  " + frutaProcurada + "!");
                System.exit(0);
            }
        }
        System.out.println("A lista não possui a fruta: " + frutaProcurada);
        }
    }

