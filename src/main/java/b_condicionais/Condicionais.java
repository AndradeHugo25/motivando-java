package b_condicionais;

import java.util.Random;

public class Condicionais {

    public static void main(String[] args) {
        final String[] PALAVRAS = {"Automação", "Lab", "Novo", "Teste"};
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(PALAVRAS.length);
            System.out.println(numero);
        }
    }
}
