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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TipoBebida getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(TipoBebida tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    public void imprimirPreco(){
        System.out.println("Preço do(a) " + this.tipoBebida.toString().toLowerCase() + ": R$ " + this.preco);
    }

    protected void servir(String mesa){
        System.out.println("Servindo " + this.tipoBebida.toString().toLowerCase() + " na " + mesa);
    }
}
