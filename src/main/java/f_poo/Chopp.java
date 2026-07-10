package f_poo;

public class Chopp extends Bebida {

    @Override
    public void imprimirPreco() {
        System.out.println("Preço do chopp: R$ 8,00");
    }

    @Override
    public void servir(String mesa) {
        System.out.println("Servindo chopp na mesa " + mesa);
    }
}