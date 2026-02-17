package b_condicionais.correcoes;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Como estará o tempo no fim de semana? (Sol, Chovendo, Nevando): ");
        String tempo = in.nextLine().trim().toLowerCase();

        System.out.println("Você tem dinheiro para gasolina? (S ou N): ");
        boolean temDinheiroGasolina = in.nextLine().trim().equalsIgnoreCase("s");

        System.out.println("Seu carro está quebrado? (S ou N): ");
        boolean carroQuebrado = in.nextLine().trim().equalsIgnoreCase("s");

        switch (tempo) {
            case "chovendo" -> System.out.println("Fique em casa.");
            case "nevando" -> {
                if (temDinheiroGasolina && !carroQuebrado) {
                    System.out.println("Vá viajar de carro acompanhado.");
                }
            }
            case "sol" -> {
                if (temDinheiroGasolina && !carroQuebrado) {
                    System.out.println("Vá viajar de carro sozinho.");
                } else if (carroQuebrado) {
                    System.out.println("Vá ao cinema de ônibus.");
                }
            }
        }
    }
}
