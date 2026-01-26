package f_poo.z_exercicios.exercicios38;

public class Cerveja implements Restaurante.Bebida {

    public String nome = "cerveja";
    public double preco = 15.00;

    @Override
    public void imprimirPreco() {
        System.out.println("Preço da " + nome + " R$" + preco);
    }

    @Override
    public void servir(String mesa) {
        System.out.println("Servindo " + nome + " para a mesa" + mesa);

    }
}
