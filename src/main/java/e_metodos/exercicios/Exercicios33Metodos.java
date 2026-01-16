package e_metodos.exercicios;

import java.util.Scanner;

public class Exercicios33Metodos {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String entrada;

        do {
            System.out.print("Digite sua idade: ");
            entrada = in.nextLine();
        } while (!idadeValida(entrada));
    }

    public static boolean idadeValida(String entrada) {
        try {
            int idade = Integer.parseInt(entrada);

            if (idade < 0 || idade > 120) {
                throw new Exception("Idade inválida!");
            }

            System.out.println("Sua idade é: " + idade + " anos.\n");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
            return false;
        }
    }
}
