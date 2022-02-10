package d_ed;

import java.util.HashMap;
import java.util.Map;

public class MapED {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Goleiro");
        map.put(2, "Ponta esquerda");
        map.put(3, "Meia esquerda");
        map.put(4, "Central");
        map.put(5, "Meia direita");
        map.put(6, "Ponta direita");
        map.put(7, "Pivô");

        System.out.println("TIME: " + map);

//        System.out.println();
//
//        for (Map.Entry<Integer, String> atual : map.entrySet()) {
//            System.out.println(atual);
//        }
//
//        for (Integer indice : map.keySet()) {
//            System.out.println(indice);
//        }
//
//        for (String posicao : map.values()) {
//            System.out.println(posicao);
//        }

        //contém chave ---------------------------------------------------
//        String resposta = map.containsKey(1) ? "Camisa 1? Sim, já tem gente usando!" : "Camisa 1? Ninguém usando!";
//        System.out.println(resposta);
//
//        map.remove(1);
//
//        System.out.println("\nTIME: " + map);
//
//        resposta = map.containsKey(1) ? "Camisa 1? Sim, já tem gente usando!" : "Camisa 1? Ninguém usando!";
//        System.out.println(resposta);

        //contém valor -------------------------------------------------------------------
//        String resposta2 = map.containsValue("Goleiro") ? "Goleiro? Sim, tá no time!" : "Goleiro? Vixi, tem não!";
//        System.out.println(resposta2);
//
//        map.remove(1);
//
//        System.out.println("\nTIME: " + map);
//
//        resposta2 = map.containsValue("Goleiro") ? "Camisa 1? Sim, tá no time!" : "Goleiro? Vixi, tem não!";
//        System.out.println(resposta2);
    }

}









/*
 * ArrayList<String> lista = new ArrayList<>();
 *
 * Map<Integer, String> map = new HashMap<>();
 *
 * */