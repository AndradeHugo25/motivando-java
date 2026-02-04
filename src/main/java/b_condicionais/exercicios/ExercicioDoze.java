package b_condicionais.exercicios;

import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        String escolhaPC = gerarEscolhaAleatoria();

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a opção desejada: pedra, papel ou tesoura");
        String escolhaUsuario = in.nextLine().trim().toLowerCase();

        if (!escolhaUsuario.equals("pedra") && !escolhaUsuario.equals("papel") && !escolhaUsuario.equals("tesoura")){ // inserções invalidas
            System.out.println("Você inseriu uma opção inválida.");
        } else if (escolhaUsuario.equals(escolhaPC)){ // empate
            System.out.println("Empate.");
        } else {
            if (escolhaPC.equals("pedra")){
                if (escolhaUsuario.equals("papel")) {
                    System.out.println("Você venceu!");
                } else {
                    System.out.println("Você perdeu...");
                }
            } // ficaram muitas condições, mas não soube um jeito mais otimizado e correto para fazer.
            if (escolhaPC.equals("papel")){
                if (escolhaUsuario.equals("tesoura")) {
                    System.out.println("Você venceu!");
                } else {
                    System.out.println("Você perdeu...");
                }
            }
            if (escolhaPC.equals("tesoura")){
                if (escolhaUsuario.equals("pedra")) {
                    System.out.println("Você venceu!");
                } else {
                    System.out.println("Você perdeu...");
                }
            }
        }
    }

    public static String gerarEscolhaAleatoria() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int indiceAleatorio = (int) (Math.random() * opcoes.length);
        return opcoes[indiceAleatorio];
    }
}
