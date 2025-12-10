package h_exercicios;

import java.util.Scanner;

public class ExerciciosCondicionais17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a operação que deseja fazer:");
        String calculadora = in.nextLine();

        in = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int primeiro = in.nextInt();

        in = new Scanner(System.in);
        System.out.println("Digite o segundo número:");
        int segundo = in.nextInt();

        switch (calculadora) {
            case "soma" -> System.out.println(primeiro + segundo);
            case "subtração" -> System.out.println(primeiro - segundo);
            case "multiplicação" -> System.out.println(primeiro * segundo);
            case "divisão" -> System.out.println(primeiro / segundo);
        }
    }
}

