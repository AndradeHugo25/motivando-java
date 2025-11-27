package c_repeticao;

import static c_repeticao.RepeticaoApoio.estaChovendo;

public class Repeticao2WhileContador {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 3 && estaChovendo()) {
            System.out.println("Ficarei em casa");
            i++;
        }


        if (i >= 3) {
            System.out.println("Vou nada, vou sair mesmo assim!");
        } else {
            System.out.println("Vou sair, pois parou a chuva!");
        }

    }

}