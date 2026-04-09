package f_poo.g_exercicios.exercicio38;

public abstract class Bebida {

    private double preco;
    private TipoBebida tipoBebida;

    protected enum TipoBebida {
        CERVEJA, CHOPP, VINHO, REFRIGERANTE
    }

    protected Bebida(double preco) {
        this.preco = preco;
    }

    protected double getPreco() {
        return preco;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
    }

    protected TipoBebida getTipoBebida() {
        return tipoBebida;
    }

    protected void setTipoBebida(TipoBebida tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    protected void imprimirPreco(){
        System.out.println("Preço do(a) " + tipoBebida.toString().toLowerCase() + ": R$ " + this.preco);
    }

    protected void servir(String mesa){
        System.out.println("Servindo " + tipoBebida.toString().toLowerCase() + " na " + mesa);
    }
}
