package b_condicionais;

import java.util.Scanner;

public class Exercicio12PedraPapelTesoura {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String escolhaPC = gerarEscolhaAleatoria();

        System.out.println("Digite pedra, papel ou tesoura:");
        String escolhaUsuario = in.nextLine();

        if (escolhaUsuario.equals(escolhaPC)) {
            System.out.println("Empate!");
        } else if (
                (escolhaUsuario.equals("pedra") && escolhaPC.equals("tesoura")) ||
                        (escolhaUsuario.equals("papel") && escolhaPC.equals("pedra")) ||
                        (escolhaUsuario.equals("tesoura") && escolhaPC.equals("papel"))
        ) {
            System.out.println("Vitória!");
        } else {
            System.out.println("Derrota!");
        }

        System.out.println("Computador escolheu: " + escolhaPC);

        in.close();
    }

    public static String gerarEscolhaAleatoria() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int indiceAleatorio = (int) (Math.random() * opcoes.length);
        return opcoes[indiceAleatorio];
    }
}