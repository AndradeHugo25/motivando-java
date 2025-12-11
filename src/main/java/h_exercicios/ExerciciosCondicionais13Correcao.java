package h_exercicios;

import java.util.Scanner;

public class ExerciciosCondicionais13Correcao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a previsão do tempo (sol, chuva, neve):");
        String previsao = in.nextLine().trim().toLowerCase();

        System.out.println("Digite true ou false se tem dinheiro para gasolina:");
        boolean temGasolina = in.nextBoolean();

        System.out.println("Digite true ou false se o carro está quebrado:");
        boolean carroQuebrado = in.nextBoolean();

        switch (previsao) {
            case "chuva" -> System.out.println("Ficará em casa");
            case "neve" -> {
                if (temGasolina && !carroQuebrado) {
                    System.out.println("Viajará acompanhado");
                } else {
                    System.out.println("Ficará em casa");
                }
            }
            case "sol" -> {
                if (temGasolina) {
                    if (!carroQuebrado) {
                        System.out.println("Viajará sozinho");
                    } else {
                        System.out.println("Vai ao cinema de ônibus");
                    }
                } else {
                    System.out.println("Ficará em casa");
                }
            }
        }
    }
}
