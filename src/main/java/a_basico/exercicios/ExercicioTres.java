package a_basico.exercicios;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
//        Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela sua média na disciplina.
//
//
//        Exemplo:
//        Nota 1:
//        4.5
//        Nota 2:
//        8.5
//        A média do aluno é 6.5!

        System.out.println("O programa irá ler as suas duas notas e irá calcular a sua média simples.");
        Scanner in = new Scanner(System.in);
        System.out.println("Nota 1: ");
        float notaUm = in.nextFloat();
        System.out.println("Nota 2: ");
        float notaDois = in.nextFloat();
        float media = (notaUm + notaDois) / 2;

        System.out.println("A média do aluno é " + media + ".");

    }
}
