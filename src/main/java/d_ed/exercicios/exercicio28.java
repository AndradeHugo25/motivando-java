package d_ed.exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome = "";
        String bebeu = "";
        Map<String, Boolean> pessoas = new HashMap<>();

        do {
            System.out.println("Informe o nome do amigo (informe 'final' para parar): ");
            nome = in.nextLine().toLowerCase().trim();

            if (!nome.equals("final")){

                System.out.println("Informe se bebeu (S) ou não (N): ");
                bebeu = in.nextLine().toLowerCase().trim();

                if (bebeu.equals("s")){
                    pessoas.put(nome, true);
                } else if (bebeu.equals("n")){
                    pessoas.put(nome, false);
                } else {
                    System.out.println("Alguma informação errada foi inserida...");
                    System.out.println(nome + " não foi inserido.");
                }
            } else {
                System.out.println("Fechando a lista...");
            }
        } while (!nome.equals("final"));

        vaiPagar(pessoas);
        bebeu = "";

        do{
            System.out.println("Aline bebeu? (S) ou (N): ");
            bebeu = in.nextLine().toLowerCase().trim();
            if (bebeu.equals("s")){
                pessoas.put("aline", true);
            } else if (bebeu.equals("n")){
                pessoas.put("aline", false);
            } else {
                System.out.println("Insira opção válida.");
            }
        } while ((!bebeu.equals("s")) && (!bebeu.equals("n")));

        vaiPagar(pessoas);

    }

    public static void vaiPagar (Map<String, Boolean> amigos){
        ArrayList<String> nomes = new ArrayList<>();

        for (Map.Entry<String, Boolean> mapAux : amigos.entrySet()){
            String nomeBebeu = mapAux.getKey();
            Boolean bebeuOuNao = mapAux.getValue();
            if (bebeuOuNao){
                nomes.add(nomeBebeu);
            }
        }
        System.out.println(nomes);
    }
}
