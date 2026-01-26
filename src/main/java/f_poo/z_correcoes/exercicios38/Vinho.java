package f_poo.z_correcoes.exercicios38;

public class Vinho implements Bebida {
    @Override
    public void imprimirPreco() {
        System.out.println("Preço do vinho: R$36,90");
    }

    @Override
    public void servir(String mesa) {
        System.out.println("Servindo vinho para a mesa" + mesa + "\n");
    }
}
