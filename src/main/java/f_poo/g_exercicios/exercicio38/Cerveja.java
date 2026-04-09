package f_poo.g_exercicios.exercicio38;

public class Cerveja extends Bebida {
    public Cerveja (double preco){
        super(preco);
        super.setTipoBebida(TipoBebida.CERVEJA);
    }
}
