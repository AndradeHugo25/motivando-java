package e_metodos.correcoes;

import java.util.Scanner;

public class Exercicios33MetodosCorrecao {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int idade;

        do {
            System.out.print("Digite sua idade: ");
            idade = in.nextInt();
        } while (!idadeValida(idade));
    }

    public static boolean idadeValida(int idade) {
        try {
            if (idade < 0 || idade > 120) {
                throw new Exception("Idade inválida!");
            }

            System.out.println("Sua idade é: " + idade + " anos.\n");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Tente uma nova idade.\n");
            return false;
        }
    }
}
