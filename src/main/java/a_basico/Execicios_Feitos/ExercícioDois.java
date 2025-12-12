package a_basico.Execicios_Feitos;

import java.util.Scanner;

public class ExercícioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a Nota da Primeira Prova");
        String entrada1 = scanner.next();
        double Nota1 = Double.parseDouble(entrada1.replace(",", "."));
        System.out.println("Insira a Nota da Segunda Prova");
        String entrada2 = scanner.next();
        double Nota2 = Double.parseDouble(entrada2.replace(",", "."));
        System.out.println("Insira a Nota da Terceira Prova");
        String entrada3 = scanner.next();
        double Nota3 = Double.parseDouble(entrada3.replace(",", "."));

        //Média
        double media = (Nota1 + Nota2 + Nota3) / 3;
        System.out.println("media do aluno: " + media);

    }
}
