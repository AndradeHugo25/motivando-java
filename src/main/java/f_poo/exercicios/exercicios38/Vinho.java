package f_poo.exercicios.exercicios38;

public class Vinho implements Restaurante.Bebida {

    public String nome = "vinho";
    public double preco = 36.90;

    @Override
    public void imprimirPreco() {
        System.out.println("Preço do " + nome + " R$" + preco);
    }

    @Override
    public void servir(String mesa) {
        System.out.println("Servindo " + nome + " para a mesa" + mesa);
    }
}
