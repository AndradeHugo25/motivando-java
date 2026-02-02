package e_metodos.correcoes;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int idadeUsuario;

        do {
            System.out.print("Digite sua idade: ");
            idadeUsuario = sc.nextInt();
        } while (!verificarIdade(idadeUsuario));
    }

    public static boolean verificarIdade(int idade) {
        try {
            if (idade < 0 || idade > 120) {
                throw new Exception("Idade inválida!");
            }

            System.out.println("A idade de " + idade + " anos é válida.");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Tente uma nova idade.\n");
            return false;
        }
    }
}
