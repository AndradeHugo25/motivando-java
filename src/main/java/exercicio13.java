/*Exercicio13*/

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Como estará o tempo no fim de semana? (Sol, Chovendo, Nevando): ");
        String tempo = scanner.nextLine().trim().toLowerCase();

        System.out.print("Você tem dinheiro para gasolina? (Sim/Não): ");
        String respGasolina = scanner.nextLine().trim().toLowerCase();
        boolean temDinheiroGasolina = respGasolina.equals("sim");

        System.out.print("Seu carro está quebrado? (Sim/Não): ");
        String respCarro = scanner.nextLine().trim().toLowerCase();
        boolean carroQuebrado = respCarro.equals("sim");

        System.out.print("Sua atividade no fim de semana será: ");

        if (tempo.equals("chovendo")) {
            System.out.println("Ficar em casa.");
        } else if (tempo.equals("sol") && carroQuebrado) {
            System.out.println("Ir ao cinema de ônibus.");
        } else if (tempo.equals("sol") && !temDinheiroGasolina) {
            System.out.println("Ficar em casa (sem dinheiro para gasolina).");
        } else if (tempo.equals("sol")) {
            System.out.println("Viajar sozinho.");
        } else if (tempo.equals("nevando")) {
            System.out.println("Viajar acompanhado.");
        } else {
            System.out.println("Não foi possível determinar (clima inválido digitado).");
        }

    }
}
