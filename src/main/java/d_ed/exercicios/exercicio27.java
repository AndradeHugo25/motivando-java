package d_ed.exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> usuario = new HashMap<>();
        String nome;
        String matricula;

        for (int i = 1; i<5; i++){
            System.out.println("Usuário " + i + " informe o seu nome :");
            nome = in.nextLine().trim();
            System.out.println("Usuário " + i + " informe a sua matricula :");
            matricula = in.nextLine().trim();
            usuario.put(matricula, nome);
        }

        System.out.println(usuario.entrySet());

        for (Map.Entry<String, String> mapAux : usuario.entrySet()){

            String nomeComA = mapAux.getValue();
            String matriculaNomeComA = mapAux.getKey();

            if (nomeComA.startsWith("A") || nomeComA.startsWith("a")){
                System.out.println(matriculaNomeComA);
            }
        }
    }
}
