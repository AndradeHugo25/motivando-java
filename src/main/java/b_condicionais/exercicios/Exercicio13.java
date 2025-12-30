package b_condicionais.exercicios;

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
        boolean dinheiro = temDinheiro.trim().toLowerCase().equals("sim");
        boolean quebrado = carroQuebrado.trim().toLowerCase().equals("sim");


        switch (tempo) {
            case "chovendo":
                // Regra: se estiver chovendo, ficará em casa
                System.out.println("Ficará em casa, pois está chovendo.");
                break;

            case "nevando":
                // Regra: se estiver nevando, viajará acompanhado
                System.out.println("Vai viajar acompanhado, pois está nevando.");
                break;

            case "sol":
                // Regra: se estiver sol, viajará sozinho; mas considerar carro/dinheiro
                if (quebrado) {
                    // carro quebrado e não está chovendo/nevando -> cinema de ônibus
                    System.out.println("Vai ao cinema de ônibus, pois o carro está quebrado.");
                } else {
                    // carro não está quebrado
                    if (dinheiro) {
                        // só pode sair de carro se tiver dinheiro para gasolina
                        System.out.println("Vai viajar sozinho de carro, pois está sol e tem dinheiro para gasolina.");
                    } else {
                        // sem dinheiro para gasolina, mas está sol -> viajar sozinho (sem usar carro)
                        System.out.println("Vai viajar sozinho, pois está sol, mas sem dinheiro para a gasolina não vai usar o carro.");
                    }
                }
                break;

            default:
                System.out.println("Tempo não reconhecido. Use 'Sol', 'Chovendo' ou 'Nevando'.");
                break;
        }
    }
}