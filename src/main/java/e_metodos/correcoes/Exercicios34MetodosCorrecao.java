package e_metodos.correcoes;

public class Exercicios34MetodosCorrecao {
    public static void main(String[] args) {

        double resultadoProduto = valorTotalCompra(10, 50.0);
        System.out.println("Valor total gasto: " + resultadoProduto + "\n");

        double resultadoProduto2 = valorTotalCompra(10, 50.0, 10.0);
        System.out.println("Valor total gasto com desconto: " + resultadoProduto2 +"\n");
    }

    public static double valorTotalCompra(int qtd, double preco) {
        return (qtd * preco);
    }

    public static double valorTotalCompra(int quantidade, double preco, double descontoPercent) {
        double valorBruto = quantidade * preco;
        double desconto = valorBruto * (descontoPercent / 100);
        return valorBruto - desconto;
    }
}
