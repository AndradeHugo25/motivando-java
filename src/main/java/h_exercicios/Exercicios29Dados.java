package h_exercicios;

import java.util.Scanner;

public class Exercicios29Dados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome completo: ");
        String nomeCompleto = sc.nextLine();
        String[] validarNome = nomeCompleto.split(" ");

        System.out.println(validarNome.length);

        for (int i = 0; i < validarNome.length; i++) {
            System.out.println(validarNome[i]);
        }

        System.out.println("Escolha uma opção:");
        System.out.println("\t(1) Nome do meio");
        System.out.println("\t(2) Último nome");

        String entradaOpcao = sc.nextLine().trim();
        String resultado = null;

        if (entradaOpcao.equals("1")) {
            resultado = validarNome[0] + " " + validarNome[1];
        } else if (entradaOpcao.equals("2")) {
            resultado = validarNome[0] + " " + validarNome[validarNome.length - 1];
        }
        System.out.println(resultado);
    }
}


