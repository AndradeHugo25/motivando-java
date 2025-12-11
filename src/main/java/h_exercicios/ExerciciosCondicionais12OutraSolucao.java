package h_exercicios;

import java.util.Scanner;

public class ExerciciosCondicionais12OutraSolucao {

    public static void main(String[] args) {
        String sistema = gerarEscolhaAleatoria();

        Scanner in = new Scanner(System.in);
        System.out.println("Escolha entre pedra, papel, tesoura:");
        String jogo = in.nextLine();

        System.out.println("Você escolheu " + jogo);
        System.out.println("O sistema escolheu " + sistema);

        // --- Solução enxuta baseada nos 3 resultados ---
        System.out.println("\nSolução enxuta:");
        if (sistema.equals(jogo)) {
            System.out.println("Empate");
        } else if (
            (sistema.equals("pedra") && jogo.equals("papel")) ||
            (sistema.equals("papel") && jogo.equals("tesoura")) ||
            (sistema.equals("tesoura") && jogo.equals("pedra"))
        ) {
            System.out.println("Você ganhou");
        } else {
            System.out.println("O sistema ganhou");
        }
    }

    public static String gerarEscolhaAleatoria() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int indiceAleatorio = (int) (Math.random() * opcoes.length);
        return opcoes[indiceAleatorio];
    }
}