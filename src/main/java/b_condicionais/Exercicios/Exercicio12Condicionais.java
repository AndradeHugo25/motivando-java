package b_condicionais.Exercicios;

import java.util.Scanner;

public class Exercicio12Condicionais {

    public static void main(String[] args) {
        String escolhaPC = gerarEscolhaAleatoria();

        Scanner in =  new Scanner(System.in);
        System.out.println("Escolha pedra, papel ou tesoura: ");
        String escolhaJogador = in.next();

        if (escolhaPC.equalsIgnoreCase(escolhaJogador)) {
            System.out.println("Empate! Ambos escolheram " + escolhaPC);
        } else if (
                escolhaJogador.equalsIgnoreCase("pedra") && escolhaPC.equalsIgnoreCase("tesoura")) {
            System.out.println("Você venceu! Pedra quebra tesoura.");
        } else if (
                escolhaJogador.equalsIgnoreCase("papel") && escolhaPC.equalsIgnoreCase("pedra")
        ) {
            System.out.println("Você venceu! Papel cobre pedra.");
        } else if (
                escolhaJogador.equalsIgnoreCase("tesoura") && escolhaPC.equalsIgnoreCase("papel")
        ) {
            System.out.println("Você venceu! Tesoura corta papel.");
        } else {
            System.out.println("Você perdeu! " + escolhaPC + " vence " + escolhaJogador);
        }
    }

    public static String gerarEscolhaAleatoria() {
        String[] opcoes = new String[]{"pedra", "papel", "tesoura"};
        int indiceAleatorio = (int) (Math.random() * opcoes.length);
        return opcoes[indiceAleatorio];
    }
}
