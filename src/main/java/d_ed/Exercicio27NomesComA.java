package d_ed;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio27NomesComA {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Map<Integer, String> usuarios = new HashMap<>();

        for (int i = 1; i <= 4; i++) {

            System.out.println("Digite a matrícula:");
            int matricula = in.nextInt();
            in.nextLine();

            System.out.println("Digite o nome:");
            String nome = in.nextLine();

            usuarios.put(matricula, nome);
        }

        System.out.println("Matrículas dos nomes que começam com A:");

        usuarios.entrySet()
                .stream()
                .filter(usuario ->
                        usuario.getValue().toUpperCase().startsWith("A"))
                .forEach(usuario ->
                        System.out.println(usuario.getKey()));

        in.close();
    }
}