package b_condicionais.exercicios;

import java.util.Scanner;

public class ExercicioSeisB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Como estará o tempo no fim de semana? (Sol, Chovendo, Nevando): ");
        String tempo = in.nextLine().trim().toLowerCase();

        System.out.println("Você tem dinheiro para gasolina? (S ou N): ");
        String temDinheiroGasolina = in.nextLine().trim().toLowerCase();

        System.out.println("Seu carro está quebrado? (S ou N): ");
        String isCarroQuebrado = in.nextLine().trim().toLowerCase();

        if ((!tempo.equals("sol") && !tempo.equals("chovendo") && !tempo.equals("nevando"))
        && (!temDinheiroGasolina.equals("s") && !temDinheiroGasolina.equals("n"))
        && (!isCarroQuebrado.equals("s") && !isCarroQuebrado.equals("n"))) {
            System.out.println("Você inseriu alguma opção invalida.");
        }
        else if (tempo.equals("sol")){
            if (temDinheiroGasolina.equals("s")){
                if (isCarroQuebrado.equals("s")){
                    System.out.println("Vá ao cinema de ônibus.");
                }
                else {
                    System.out.println("Vá viajar de carro sozinho.");
                }
            }
            else {
                if (isCarroQuebrado.equals("s")){
                    System.out.println("Vá ao cinema de ônibus.");
                }
            }
        }
        else if (tempo.equals("chovendo")){
            System.out.println("Fique em casa.");
        }
        else if (tempo.equals("nevando")){
            if (temDinheiroGasolina.equals("s")) {
                if (isCarroQuebrado.equals("n")) {
                    System.out.println("Vá viajar de carro acompanhado.");
                }
            }
        }
    }
}

// Em condições não especificadas a aplicação não faz nada - por exemplo: neve, sem dinheiro para gasolina e com carro quebrado