package b_condicionais.correcoes;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Como estará o tempo no fim de semana? (sol, chovendo, nevando)");
        String clima = sc.nextLine().toLowerCase();

        System.out.println("Você tem dinheiro para gasolina? (sim/não)");
        String dinheiro = sc.nextLine().toLowerCase();

        System.out.println("Seu carro está quebrado? (sim/não)");
        String carroQuebrado = sc.nextLine().toLowerCase();

        switch (clima) {
            case "chovendo" -> System.out.println("Você ficará em casa.");
            case "nevando" -> {
                if (dinheiro.equals("sim") && carroQuebrado.equals("não")) {
                    System.out.println("Você viajará acompanhado.");
                } else if (carroQuebrado.equals("sim")) {
                    System.out.println("Seu carro está quebrado, irá ao cinema de ônibus.");
                } else {
                    System.out.println("Você não poderá viajar, pois não tem dinheiro para gasolina.");
                }
            }
            case "sol" -> {
                if (dinheiro.equals("sim") && carroQuebrado.equals("não")) {
                    System.out.println("Você viajará sozinho.");
                } else if (carroQuebrado.equals("sim")) {
                    System.out.println("Seu carro está quebrado, irá ao cinema de ônibus.");
                } else {
                    System.out.println("Você não poderá viajar, pois não tem dinheiro para gasolina.");
                }
            }
            default -> System.out.println("Clima não reconhecido.");
        }
    }
}

