package f_poo.Exercicios.Exercicio38;

public class BebidaCerveja extends Bebidas  {
    @Override
    public void imprimirPreco() {
        System.out.println("Preço do Cerveja: R$10,00");
    }

    @Override
    public void servir(String mesa) {
        System.out.println("Servindo Cerveja na mesa " + mesa);
    }
}

