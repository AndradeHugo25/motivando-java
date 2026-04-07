package d_ed.exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int id = 1;
        int idade;
        Map<Integer, Integer> mapIdade = new HashMap<>();
        // sei que o ideal seria usar Lista, mas pensei em usar Map para guardar o "id" de cada idade inserida.

        do {
            System.out.println("Informe a sua idade: \n");
            System.out.println("Digite -1 para finalizar e imprimir a lista \n");
            idade = in.nextInt();
            if (idade >= 0){
                mapIdade.put(id,idade);
                id++;
            } else if (idade < -1 ) {
                System.out.println("Idade inválida");
            }
        } while (idade != -1);

//        System.out.println(mapIdade.values());

        mapIdade.values().removeIf(i -> i < 18);
        System.out.println("Sobraram " + mapIdade.size() + " após remover os menores de 18 anos.");

//        System.out.println(mapIdade.values());

    }
}
