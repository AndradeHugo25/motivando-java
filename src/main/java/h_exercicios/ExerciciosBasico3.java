package h_exercicios;

import java.util.Scanner;

public class ExerciciosBasico3 {

    //Média

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nota disciplina 1:");
        double disciplina1 = in.nextDouble();

        System.out.println("Nota disciplina 2:");
        double disciplina2 = in.nextDouble();

        System.out.println("Sua média nas disciplinas é: " + (disciplina1 + disciplina2)/2);
    }
}