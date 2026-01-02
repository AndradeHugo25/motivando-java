package b_condicionais.correcoes;

import java.util.Scanner;

//Decisão do tempo no final de semana
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("Como estará o tempo no fim de semana? (Sol, Chovendo, Nevando): ");
        String tempo = sc.nextLine();
        System.out.print("Você tem dinheiro para gasolina? (sim/nao): ");
        String temDinheiro = sc.nextLine();
        System.out.print("Seu carro está quebrado? (sim/nao): ");
        String carroQuebrado = sc.nextLine();

        sc.close();

        if (tempo == null || temDinheiro == null || carroQuebrado == null) {
            System.out.println("Entrada inválida.");
            return;
        }

        tempo = tempo.trim().toLowerCase();
        boolean dinheiro = temDinheiro.trim().equalsIgnoreCase("sim");
        boolean quebrado = carroQuebrado.trim().equalsIgnoreCase("sim");


        switch (tempo) {
            case "chovendo" -> System.out.println("Ficará em casa, pois está chovendo.");
            case "nevando" -> System.out.println("Vai viajar acompanhado, pois está nevando.");
            case "sol" -> {
                if (quebrado) {
                    System.out.println("Vai ao cinema de ônibus, pois o carro está quebrado.");
                } else {
                    if (dinheiro) {
                        System.out.println("Vai viajar sozinho de carro, pois está sol e tem dinheiro para gasolina.");
                    } else {
                        System.out.println("Vai viajar sozinho, pois está sol, mas sem dinheiro para a gasolina não vai usar o carro.");
                    }
                }
            }
            default ->
                System.out.println("Tempo não reconhecido. Use 'Sol', 'Chovendo' ou 'Nevando'.");
        }
    }
}