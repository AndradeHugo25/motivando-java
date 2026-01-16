package d_ed.exercicios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicios27Dados {

    public static List<String> listaNomes(Map<Integer, String> nomes) {
        return nomes.values().stream()
                .filter(nome -> nome.startsWith("A"))
                .toList();
    }

    public static void main(String[] args) {

        Map<Integer, String> nomes = new HashMap<>();
        nomes.put(1234, "Alice");
        nomes.put(2345, "Hugo");
        nomes.put(3456, "Jeniffer");
        nomes.put(4567, "Amanda");

        System.out.println();

        for (Map.Entry<Integer, String> lista : nomes.entrySet()) {
            System.out.println("\nMatricula | Nome: " + lista);
        }

        System.out.println("\nNomes com A: " + listaNomes(nomes));
    }
}
