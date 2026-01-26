package f_poo.z_exercicios.exercicios38;

public class Main {
    public static void main(String[] args) {
        Restaurante.Bebida chopp = new Chopp();
        Restaurante.Bebida cerveja = new Cerveja();
        Restaurante.Bebida vinho = new Vinho();

        chopp.imprimirPreco();
        chopp.servir(" 5");
        System.out.println();

        cerveja.imprimirPreco();
        cerveja.servir(" 7");
        System.out.println();

        vinho.imprimirPreco();
        vinho.servir(" 2");
        System.out.println();
    }

}
