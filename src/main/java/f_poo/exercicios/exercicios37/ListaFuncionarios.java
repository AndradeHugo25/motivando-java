package f_poo.exercicios.exercicios37;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaFuncionarios {

    public String nomeFuncionario;
    public double salario;
    public int bonus;

    public static List<String> listaNomes(Map<Integer, String> nomes) {
        return nomes.values().stream()
                .toList();
    }
}
