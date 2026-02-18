package c_repeticao.correcoes;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        isValido();
    }

    public static void isValido() {
        Scanner in = new Scanner(System.in);
        boolean nomeValido = false, saiu = false;

        do {
            String nome = inserirNome(in);

            if (nome.isEmpty() || !isAlfabeto(nome) || nome.length() < 5 || nome.length() > 50) {
                System.out.println("ERRO - Nome inválido");
            } else if (nome.equalsIgnoreCase("cancelar")) {
                System.out.println("Cancelando...");
                saiu = true;
            } else {
                System.out.println("SUCESSO - " + nome + ", seu nome é válido!");
                nomeValido = true;
            }
        } while (!nomeValido && !saiu);
    }

    public static boolean isAlfabeto(String nome) {
        return nome.matches("^[\\p{L}]+(\\s[\\p{L}]+)*$");
    }

    public static String inserirNome(Scanner in) {
        System.out.println("Insira seu nome ou digite 'cancelar' para parar: ");
        return in.nextLine().trim();
    }
}
