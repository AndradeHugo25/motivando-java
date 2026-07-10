package f_poo;

public class Exercicio38BarQA {

    public static void main(String[] args) {

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