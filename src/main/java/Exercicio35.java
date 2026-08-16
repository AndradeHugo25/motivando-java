/*Exercicio35*/

public class Exercicio35 {
    private int numeroPeca;

    private String descricaoPeca;

    private int quantidadeComprada;

    private double precoUnitario;

    public Exercicio35(int numeroPeca, String descricaoPeca,

                      int quantidadeComprada, double precoUnitario) {

        this.numeroPeca = numeroPeca;

        this.descricaoPeca = descricaoPeca;

        this.quantidadeComprada = quantidadeComprada;

        this.precoUnitario = precoUnitario;
    }

    public int getNumeroPeca() {

        return numeroPeca;
    }

    public String getDescricaoPeca() {

        return descricaoPeca;
    }

    public int getQuantidadeComprada() {

        return quantidadeComprada;
    }

    public double getPrecoUnitario() {

        return precoUnitario;
    }

    public double getTotalNota() {

        return quantidadeComprada * precoUnitario;
    }
}
