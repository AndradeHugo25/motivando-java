/*Exercicio38*/

public class Vinho extends Bebida {

    @Override
    public void imprimirPreco() {
        System.out.println("Preço do vinho: R$ 25,00");
    }

    @Override
    public void servir(String mesa) {
        System.out.println("Servindo vinho na mesa " + mesa);
    }
}