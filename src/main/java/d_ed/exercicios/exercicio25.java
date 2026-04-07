package d_ed.exercicios;

import java.util.Arrays;

public class exercicio25 {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5};

        int[] listaDobrada = Arrays.stream(numeros)
                .map(n -> n*2).toArray();

        System.out.println(Arrays.toString(listaDobrada));

    }
}
