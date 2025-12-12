package a_basico.Execicios_Feitos;

import java.util.Scanner;

public class ExercicioZero {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome1 = nome.nextLine();
        System.out.println("Bom dia " + nome1 + " Informe sua Idade: ");
        Integer idade = nome.nextInt();
        System.out.println("Bom dia " + nome1 + " Você tem : " + idade + " anos!");

    }
}
