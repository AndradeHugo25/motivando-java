package f_poo.z_correcoes.exercicios38;

public class Cerveja implements Bebida {
    @Override
    public void imprimirPreco() {
        System.out.println("Preço da cerveja: R$15,00");
    }

    @Override
    public void servir(String mesa) {
        System.out.println("Servindo cerveja para a mesa" + mesa + "\n");
    }
}
