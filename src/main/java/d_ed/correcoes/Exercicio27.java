package d_ed.correcoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> usuarios = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe a matrícula do Usuário: ");
            int matricula = sc.nextInt();
            sc.nextLine();

            System.out.println("Informe o nome do Usuário: ");
            String nome = sc.nextLine();

            usuarios.put(matricula, nome);
        }

        System.out.println("Matrículas de usuários com nomes que iniciam com 'A':");
        for (Map.Entry<Integer, String> entry : usuarios.entrySet()) {
            if (entry.getValue().toUpperCase().startsWith("A")) {
                System.out.println(entry.getKey());
            }
        }
    }
}
