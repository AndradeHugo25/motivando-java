package c_repeticao;

import static c_repeticao.RepeticaoApoio.estaChovendo;

public class Repeticao2While {

    public static void main(String[] args) {

        while (estaChovendo()) {
            System.out.println("Fico em casa");
        }

        System.out.println("Vou sair!");
    }

}