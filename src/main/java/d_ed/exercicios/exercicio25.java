package d_ed.exercicios;

import java.util.Arrays;

public class exercicio25 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int[] listaDobrada = dobrarLista(numeros);
        System.out.println(Arrays.toString(listaDobrada));

    }

    public static int[] dobrarLista (int[] lista){
        int[] listaDobro = new int[lista.length];
        for (int i = 0; i < lista.length; i++) {
            listaDobro[i] = lista[i] * 2;
        }
        return listaDobro;
    }

}
