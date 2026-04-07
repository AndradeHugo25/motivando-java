package d_ed.exercicios;

import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String nome = in.nextLine().trim();

        String[] listaNome = nome.split(" ");

        int opcao = 0;
        System.out.println("Escolha uma opcao: ");
        System.out.println("1-Com o primeiro sobrenome");
        System.out.println("2-Com o segundo sobrenome");
        opcao = in.nextInt();

        if (opcao == 1){
            if (listaNome[1].startsWith("d")){
                System.out.println(listaNome[0]+" "+listaNome[2]);
            } else {
                System.out.println(listaNome[0]+" "+listaNome[1]);
            }
        } else if (opcao == 2){
            System.out.println(listaNome[0]+" "+listaNome[listaNome.length-1]);
        } else {
            System.out.println("opcao invalida");
        }
        // Sei que caso o usuario insira "Hugo da Silva Andrade", o output será "Hugo da"
        // Pretendo melhorar e pensar numa forma de fazer essa filtragem
        // O melhor que consegui foi isso - linha 21

    }
}
