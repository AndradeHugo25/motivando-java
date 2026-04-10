package f_poo.g_exercicios.exercicio38;

public enum BebidaEnum {

    CERVEJA(12.0),
    REFRIGERANTE(8.50),
    VINHO(45),
    CHOPP(9.99);

    private final double preco;

    BebidaEnum(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void imprimirPreco(){
        System.out.println("Preço do(a) " + this.toString().toLowerCase() + ": R$ " + this.preco);
    }

    public void servir(String mesa){
        System.out.println("Servindo " + this.toString().toLowerCase() + " na " + mesa);
    }
}
