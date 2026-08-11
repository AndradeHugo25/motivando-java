/*Exercicio38*/

public class MainExercicio38 {

    public static void main(String[] args) {
        System.out.println("BAR QA");

        Chopp chopp = new Chopp();
        Cerveja cerveja = new Cerveja();
        Vinho vinho = new Vinho();

        chopp.imprimirPreco();
        chopp.servir("5");

        System.out.println();

        cerveja.imprimirPreco();
        cerveja.servir("7");

        System.out.println();

        vinho.imprimirPreco();
        vinho.servir("2");
    }
}
