package f_poo.g_exercicios.exercicio35;

public class NotaFiscal {
    private int idProduto;
    private String nomeProduto;
    private int quantidadeComprada;
    private double precoUnitario;

    // Construtor
    public NotaFiscal(int idProduto, String nomeProduto,
                      int quantidadeComprada, double precoUnitario) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitario = precoUnitario;
    }

    // Método que retorna o total da nota fiscal
    public double getTotalNota() {
        return quantidadeComprada * precoUnitario;
    }

    public int getIdProduto() {
        return idProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    @Override
    public String toString() {
        return "NotaFiscal "+idProduto +" {" +
                "idProduto=" + idProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", quantidadeComprada=" + quantidadeComprada +
                ", precoUnitario=" + precoUnitario +
                '}';
    }
}
