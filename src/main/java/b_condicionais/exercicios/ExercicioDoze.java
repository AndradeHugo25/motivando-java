package b_condicionais.exercicios;

import java.util.Scanner;

public class ExercicioDoze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite sua escolha (pedra, papel ou tesoura): "); // ajuste futura: quando é escrito com letra maiuscula funciona com a primeira letra minuscula o resultado do PC é sempre igual.
        String escolhaUsuario = sc.nextLine().toLowerCase(); // força minúsculo


        String escolhaPC = gerarEscolhaAleatoria();

        System.out.println("Você escolheu: " + escolhaUsuario);
        System.out.println("Computador escolheu: " + escolhaPC);

        if (escolhaUsuario.equals(escolhaPC)) {
            System.out.println("Empate!");
        } else if ((escolhaUsuario.equals("pedra") && escolhaPC.equals("tesoura")) ||
                (escolhaUsuario.equals("papel") && escolhaPC.equals("pedra")) ||
                (escolhaUsuario.equals("tesoura") && escolhaPC.equals("papel"))) {
            System.out.println("Vitória!");
        } else {
            System.out.println("Derrota!");
        }

        sc.close();
    }

    public static String gerarEscolhaAleatoria() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int indiceAleatorio = (int) (Math.random() * opcoes.length);
        return opcoes[indiceAleatorio];
    }
}





