package h_exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicios25Dados {
    public static List<Integer> dobrarValores(List<Integer> numeros) {
        return numeros.stream()
                .map(numero -> numero * 2)
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Dobro dos números: " + dobrarValores(numeros));
    }
}
