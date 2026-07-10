package d_ed;

import java.util.Scanner;

public class Exercicio29Sobrenomes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome completo:");
        String nomeCompleto = in.nextLine();

        String[] partesNome = nomeCompleto.split(" ");

        System.out.println("Escolha uma opção:");
        System.out.println("(1) Com primeiro sobrenome");
        System.out.println("(2) Com último sobrenome");

        int opcao = in.nextInt();

        String primeiroNome = partesNome[0];

        if (opcao == 1) {
            System.out.println(primeiroNome + " " + partesNome[1]);
        } else if (opcao == 2) {
            System.out.println(primeiroNome + " " + partesNome[partesNome.length - 1]);
        } else {
            System.out.println("Opção inválida!");
        }

        in.close();
    }
}