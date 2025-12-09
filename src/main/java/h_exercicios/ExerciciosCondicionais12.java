package h_exercicios;

import java.util.Scanner;

public class ExerciciosCondicionais12 {

    public static void main(String[] args) {
        String escolha = gerarEscolhaAleatoria();
        System.out.println(escolha);
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha entre pedra, papel, tesoura:");
//        int = in.nextInt();
    }

    public static String gerarEscolhaAleatoria() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int indiceAleatorio = (int) (Math.random() * opcoes.length);
        return opcoes[indiceAleatorio];
    }
}