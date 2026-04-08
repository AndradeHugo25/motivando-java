package f_poo.exercicios.exercicio35;

public class NotaFiscal {

    private int numeroPeca;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public NotaFiscal(int numeroPeca, String descricao, int quantidade, double precoUnitario){
        this.numeroPeca = numeroPeca;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public int getNumeroPeca() {return numeroPeca;}

    public void setNumeroPeca(int numeroPeca){this.numeroPeca = numeroPeca;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao){this.descricao = descricao;}

    public int getQuantidade() {return quantidade;}

    public void setQuantidade(int quantidade){this.quantidade = quantidade;}

    public double getPrecoUnitario() {return precoUnitario;}

    public void setPrecoUnitario(double precoUnitario){this.precoUnitario = precoUnitario;}

    public double getTotalNota(){
        return this.quantidade*this.precoUnitario;
    }
}
