package a_basico.exercicios;

import java.util.Scanner;

public class Exercicios03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nota 1:");
        float primeiraNota = Float.parseFloat(in.nextLine().replace(',', '.'));
        System.out.println("Digite a nota 2:");
        float segundaNota = Float.parseFloat(in.nextLine().replace(',', '.'));
        System.out.println("a média do aluno é: " + (segundaNota + segundaNota) / 2);
    }
}
