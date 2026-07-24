package f_poo.g_exercicios.exercicio38;


public class Exercicio38Poo {
    public static void main(String[] args) {

        Bebida chopp = new Chopp();
        chopp.imprimirPreco();
        chopp.servir("5");

        System.out.println();

        Bebida cerveja = new Cerveja();
        cerveja.imprimirPreco();
        cerveja.servir("7");

        System.out.println();

        Bebida vinho = new Vinho();
        vinho.imprimirPreco();
        vinho.servir("2");
    }
}
