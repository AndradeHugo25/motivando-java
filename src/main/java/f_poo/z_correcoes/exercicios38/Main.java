package f_poo.z_correcoes.exercicios38;

public class Main {
    public static void main(String[] args) {
        Chopp chopp = new Chopp();
        Cerveja cerveja = new Cerveja();
        Vinho vinho = new Vinho();

        chopp.imprimirPreco();
        chopp.servir(" 5");

        cerveja.imprimirPreco();
        cerveja.servir(" 7");

        vinho.imprimirPreco();
        vinho.servir(" 2");
    }
}
