package f_poo.g_exercicios.exercicio38;

public class Refrigerante extends Bebida{
    public Refrigerante (double preco){
        super(preco);
        super.setTipoBebida(TipoBebida.REFRIGERANTE);
    }
}
