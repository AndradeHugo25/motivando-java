package d_ed.exercicios;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Ler o nome completo
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();

        //Dividir o nome em partes usando split()
        String[] partes = nomeCompleto.split(" ");

        //Exibir o menu de opções
        System.out.println("Escolha uma opção:");
        System.out.println("    (1) Com primeiro sobrenome");
        System.out.println("    (2) Com último sobrenome");

        int opcao = sc.nextInt();

        //Pegar o primeiro nome (sempre índice 0)
        String primeiroNome = partes[0];

        //Condicional para escolher o sobrenome
        if (opcao == 1) {
            System.out.println(primeiroNome + " " + partes[1]);
        } else if (opcao == 2) {
            System.out.println(primeiroNome + " " + partes[partes.length - 1]);
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}

