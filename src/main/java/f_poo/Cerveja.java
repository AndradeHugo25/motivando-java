package f_poo;

public class Cerveja extends Bebida {

    @Override
    public void imprimirPreco() {
        System.out.println("Preço da cerveja: R$ 10,00");
    }

    @Override
    public void servir(String mesa) {
        System.out.println("Servindo cerveja na mesa " + mesa);
    }
}