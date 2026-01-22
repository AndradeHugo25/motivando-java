package f_poo.exercicios.exercicios35;

public class NotaFiscal {

    public String produto;
    private int idProduto;
    private int qtdpeca;
    private double precoUnitario;

    public NotaFiscal(String produto, int idProduto, int qtdpeca, double precoUnitario) {
        this.produto = produto;
        this.idProduto = idProduto;
        this.qtdpeca = qtdpeca;
        this.precoUnitario = precoUnitario;
    }

    public double getTotalNota() {
        return (qtdpeca * precoUnitario);
    }

    public int getQtdpeca() {
        return qtdpeca;
    }

    public void setQtdpeca(int qtdpeca) {
        this.qtdpeca = qtdpeca;
    }

    public double getPrecoUnitario(double v) {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "produto='" + produto + '\'' +
                ", idProduto=" + idProduto +
                ", qtdpeca=" + qtdpeca +
                ", precoUnitario=" + precoUnitario +
                '}';
    }
}