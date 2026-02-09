package f_poo.Exercicios.Exercicio38;

public class BebidaVinho extends Bebidas {
    @Override
    public void imprimirPreco() {
        System.out.println("Preço do Vinho: R$25,00");
    }

    @Override
    public void servir(String mesa) {
        System.out.println("Servindo Vinho na mesa " + mesa);
    }
}

