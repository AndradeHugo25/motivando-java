package b_condicionais.exercicios;

import java.util.Scanner;
// escolha de pedra, papel ou tesoura
public class Exercicio12 {

    public static void main(String[] args) {
        String escolhaPC = gerarEscolhaAleatoria();
        System.out.println("Escolha PC: " + escolhaPC);

        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Escolha (pedra/papel/tesoura): ");
        String escolhaUsuario = sc.nextLine();
        sc.close();

        if (escolhaUsuario == null) {
            System.out.println("Opção inválida.");
            return;
        }

        // Valida entrada
        if (!escolhaUsuario.equals("pedra") &&
                !escolhaUsuario.equals("papel") &&
                !escolhaUsuario.equals("tesoura")) {
            System.out.println("Opção inválida. Use 'pedra', 'papel' ou 'tesoura'.");
            return;
        }

        System.out.println("Você escolheu: " + escolhaUsuario);
        System.out.println("Computador escolheu: " + escolhaPC);

        // Verifica resultado
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
    }

    public static String gerarEscolhaAleatoria() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int indiceAleatorio = (int) (Math.random() * opcoes.length);
        return opcoes[indiceAleatorio];
    }
}