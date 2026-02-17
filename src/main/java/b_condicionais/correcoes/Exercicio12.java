package b_condicionais.correcoes;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        String escolhaPC = gerarEscolhaAleatoria();

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a opção desejada: pedra, papel ou tesoura");
        String escolhaUsuario = in.nextLine().trim().toLowerCase();

        if (!escolhaUsuario.equals("pedra") && !escolhaUsuario.equals("papel") && !escolhaUsuario.equals("tesoura")) {
            System.out.println("Você inseriu uma opção inválida.");
        } else if (escolhaUsuario.equals(escolhaPC)) {
            System.out.println("Empate.");
        } else {
            String chave = escolhaUsuario + "-" + escolhaPC;
            switch (chave) {
                case "pedra-tesoura", "papel-pedra", "tesoura-papel" -> System.out.println("Você venceu!");
                case "pedra-papel", "papel-tesoura", "tesoura-pedra" -> System.out.println("Você perdeu...");
                default -> System.out.println("Erro inesperado.");
            }
        }
    }

    public static String gerarEscolhaAleatoria() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int indiceAleatorio = (int) (Math.random() * opcoes.length);
        return opcoes[indiceAleatorio];
    }
}
