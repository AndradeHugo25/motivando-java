package f_poo.Exercicios.Exercicio35;

public class NotaFiscal {

    //atributos
    private int numeroPeca;
    private String descricao;
    private int qtdComprada;
    private double precoUnit;

    public  NotaFiscal(){

    }
    //construtor
    public NotaFiscal(int numeroPeca, String descricao, int qtdComprada, double precoUnit) {
        this.numeroPeca = numeroPeca;
        this.descricao = descricao;
        this.qtdComprada = qtdComprada;
        this.precoUnit = precoUnit;
    }

    //métodos

    public double getTotalNota() {
        return qtdComprada * precoUnit;

    }





}
