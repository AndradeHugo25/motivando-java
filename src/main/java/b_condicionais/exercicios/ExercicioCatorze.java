package b_condicionais.exercicios;

import java.util.Scanner;

public class ExercicioCatorze {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = in.nextLine().trim().toLowerCase();

        if ((nome.isEmpty()) || (!isAlfabeto(nome))){
            System.out.println("Você não inseriu um nome.");
        } else if (nome.startsWith("a") || (nome.startsWith("e")) || (nome.startsWith("i")) || (nome.startsWith("o")) || (nome.startsWith("u"))){
            System.out.println("Seu nome é iniciado por uma vogal.");
        } else {
            System.out.println("Seu nome é iniciado por uma consoante.");
        }
    }

    public static boolean isAlfabeto (String nome){
        return nome.matches("^[\\p{L}]+(\\s[\\p{L}]+)*$"); // ajuda de Stackoverflow + ChatGPT para chegar nessa verificação, e evitar caractéres inválidos
    }
}
