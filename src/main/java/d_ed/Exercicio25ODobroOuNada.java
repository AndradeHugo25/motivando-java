package d_ed;

import java.util.Arrays;
import java.util.List;

public class Exercicio25ODobroOuNada {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        List<Integer> resultado = Arrays.stream(numeros)
                .map(numero -> numero * 2)
                .boxed()
                .toList();

        System.out.println(resultado);
    }
}