package a_basico.conteudo;

import java.util.Scanner;

public class Basico5Observacoes1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = in.nextInt();

        System.out.println("Você tem " + idade + " anos.");
    }

}