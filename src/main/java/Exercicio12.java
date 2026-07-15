/*Exercicio12*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        String escolhaPrograma = gerarEscolhaAleatoria();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha entre pedra, papel ou tesoura: ");
        String escolhaUsuario = scanner.nextLine().trim().toLowerCase();

        if (!escolhaUsuario.equals("pedra") && !escolhaUsuario.equals("papel") && !escolhaUsuario.equals("tesoura")) {
            System.out.println("Opção inválida! Por favor, escolha entre pedra, papel ou tesoura.");
            scanner.close();
            return;
        }

        System.out.println("O programa escolheu: " + escolhaPrograma);

        if (escolhaUsuario.equals(escolhaPrograma)) {
            System.out.println("empate");
        } else if ((escolhaUsuario.equals("pedra") && escolhaPrograma.equals("tesoura")) ||
                (escolhaUsuario.equals("papel") && escolhaPrograma.equals("pedra")) ||
                (escolhaUsuario.equals("tesoura") && escolhaPrograma.equals("papel"))) {
            System.out.println("vitória");
        } else {
            System.out.println("derrota");
        }
    }
    public static String gerarEscolhaAleatoria() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int indiceAleatorio = (int) (Math.random() * opcoes.length);
        return opcoes[indiceAleatorio];
    }
}
