package a_basico.Execicios_Feitos;

import java.util.Scanner;

public class ExercicioZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome1 = in.nextLine();
        System.out.println("Bom dia " + nome1 + " Informe sua Idade: ");
        Integer idade = in.nextInt();
        System.out.println("Bom dia " + nome1 + " Você tem : " + idade + " anos!");

    }
}
