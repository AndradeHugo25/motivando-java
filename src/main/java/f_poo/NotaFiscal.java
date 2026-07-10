package f_poo;

public class NotaFiscal {

    int numeroPeca;
    String descricaoPeca;
    int quantidadeComprada;
    double precoUnitario;

    public NotaFiscal(int numeroPeca, String descricaoPeca, int quantidadeComprada, double precoUnitario) {
        this.numeroPeca = numeroPeca;
        this.descricaoPeca = descricaoPeca;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitario = precoUnitario;
    }

    public double getTotalNota() {
        return quantidadeComprada * precoUnitario;
    }
}