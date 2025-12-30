package f_poo.e_static;

public class Elefante {

    private static int populacao = 0;
    private final String nome;


    public Elefante(String nome) {
        this.nome = nome;
        populacao++;
    }

    public static void mostrarPopulacao() {
        System.out.println("População total de elefantes: " + populacao);
    }

    public void apresentar() {
        System.out.println("\nOlá, meu nome é " + nome);
    }
}
