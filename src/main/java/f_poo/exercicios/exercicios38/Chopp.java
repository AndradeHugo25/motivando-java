package f_poo.exercicios.exercicios38;

public class Chopp implements Restaurante.Bebida {

    public String nome = "chopp";
    public double preco = 9.80;

    @Override
    public void imprimirPreco() {
        System.out.println("Preço da " + nome + " R$" + preco);
    }

    @Override
    public void servir(String mesa) {
        System.out.println("Servindo " + nome + " para a mesa" + mesa);
    }
}

