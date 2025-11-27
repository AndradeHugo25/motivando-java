package a_basico;

import java.util.Scanner;

public class Basico5Observacoes1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua cor preferida:");
        String cor = in.next();

        System.out.println("Você gosta da cor " + cor);
    }

}