package c_repeticao.exercicios;

import java.util.Scanner;

public class ExercicioVinte {
    public static void main(String[] args) {

        boolean validador = isValido();

        while (!validador) {
                validador = isValido();
        }
    }
    /* Não sei o código ficou performático pelas funções estarem aninhadas (uma chama a outra), porém gostei como ficou a main.
     */

    public static boolean isAlfabeto (String nome){
        return nome.matches("^[\\p{L}]+(\\s[\\p{L}]+)*$"); // ajuda de Stackoverflow + ChatGPT para chegar nessa verificação, e evitar caractéres inválidos
    }

    public static boolean isValido (){
        Scanner in = new Scanner(System.in);
        String nome = inserirNome(in);
        nome = nome.toLowerCase();
        if ((nome.isEmpty()) || (!isAlfabeto(nome)) || (nome.length()<5) || nome.length()>50){
            System.out.println("ERRO - Nome inválido");
            return false;
        }
        else if (nome.equals("cancelar")){
            System.out.println("Cancelando...");
            return true;
        }
        else {
            nome = nome.toUpperCase();
            System.out.println("SUCESSO - " + nome + ", seu nome é válido!");
            return true;
        }
    }

    public static String inserirNome(Scanner in){
        System.out.println("Insira seu nome ou digite 'cancelar' para parar: ");
        return in.nextLine().trim();
    }
}
