package f_poo.z_correcoes.exercicios38;

public class Chopp implements Bebida {
    @Override
    public void imprimirPreco() {
        System.out.println("Preço do chopp: R$9,80");
    }

    @Override
    public void servir(String mesa) {
        System.out.println("Servindo chopp para a mesa" + mesa + "\n");
    }
}

