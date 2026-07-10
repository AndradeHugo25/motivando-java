package b_condicionais;

import java.util.Scanner;

public class Exercicio13FinalDeSemana {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Como estará o tempo no fim de semana? (Sol, Chovendo, Nevando)");
        String clima = in.nextLine();

        System.out.println("Você tem dinheiro para gasolina? (true/false)");
        boolean temDinheiro = in.nextBoolean();

        System.out.println("Seu carro está quebrado? (true/false)");
        boolean carroQuebrado = in.nextBoolean();

        if (clima.equalsIgnoreCase("Chovendo")) {
            System.out.println("Você ficará em casa.");
        } else if (carroQuebrado && !clima.equalsIgnoreCase("Nevando")) {
            System.out.println("Você irá ao cinema de ônibus.");
        } else if (!temDinheiro) {
            System.out.println("Você ficará em casa.");
        } else if (clima.equalsIgnoreCase("Nevando")) {
            System.out.println("Você viajará acompanhado.");
        } else if (clima.equalsIgnoreCase("Sol")) {
            System.out.println("Você viajará sozinho.");
        }

        in.close();
    }
}