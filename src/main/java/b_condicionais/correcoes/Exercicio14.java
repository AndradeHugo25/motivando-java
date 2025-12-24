package b_condicionais.correcoes;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        if (nome.isEmpty()) {// para ver se String esta vazia
            System.out.println("nome não informado");
            return;
        }
        char primeiraLetra = Character.toLowerCase(nome.charAt(0)); // aqui esta tratando a letra maiuscula

        switch (primeiraLetra) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Inicia com Vogal");
            default -> System.out.println("Não Inicia com Vogal");
        }
    }
}
