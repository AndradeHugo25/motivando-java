package a_basico.Execicios_Feitos;

import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Seu nome completo: ");
        String nome = sc.nextLine(); // captura a linha inteira

        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome inválido.");
        } else {
            if (nome.contains(" ")) {
                System.out.println("Seu nome é composto.");
            } else {
                System.out.println("Seu nome não é composto.");
            }
        }
        sc.close();


    }
}
