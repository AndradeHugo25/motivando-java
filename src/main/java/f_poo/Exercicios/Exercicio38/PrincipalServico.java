package f_poo.Exercicios.Exercicio38;

public class PrincipalServico {
    public static void main(String[] args){
        Bebidas Chopp = new BebidaChopp();
        Bebidas Cerveja = new BebidaCerveja();
        Bebidas Vinho = new BebidaVinho();

        Chopp.imprimirPreco();
        Chopp.servir("5");

        System.out.println();

        Cerveja.imprimirPreco();
        Cerveja.servir("7");

        System.out.println();

        Vinho.imprimirPreco();
        Vinho.servir("2");

        System.out.println();

    }
}
