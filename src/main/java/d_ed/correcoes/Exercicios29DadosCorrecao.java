package d_ed.correcoes;

import java.util.Scanner;

public class Exercicios29DadosCorrecao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome completo: ");
        String nomeCompleto = sc.nextLine();
        String[] partesNome = nomeCompleto.split(" ");

        System.out.println("Escolha uma opção:");
        System.out.println("\t(1) Nome do meio");
        System.out.println("\t(2) Último nome");

        int entradaOpcao = sc.nextInt();
        String resultado = null;

        if (entradaOpcao == 1) {
            resultado = partesNome[0] + " " + partesNome[1];
        } else if (entradaOpcao == 2) {
            resultado = partesNome[0] + " " + partesNome[partesNome.length - 1];
        }
        System.out.println(resultado);
    }
}


