package f_poo.g_exercicios.exercicio38;

public class Main {
    public static void main(String[] args) {
        Cerveja cerveja = new Cerveja(12);
        cerveja.imprimirPreco();
        cerveja.servir("mesa 7");

        Chopp chopp = new Chopp(9.5);
        chopp.imprimirPreco();
        chopp.servir("mesa 1");

        Refrigerante refri = new Refrigerante(6.70);
        refri.imprimirPreco();
        refri.servir("mesa do Antonio");

        Vinho vinho = new Vinho(80);
        vinho.imprimirPreco();
        vinho.servir("mesa 18");

    }
}
