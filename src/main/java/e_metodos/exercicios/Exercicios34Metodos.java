package e_metodos.exercicios;

public class Exercicios34Metodos {
    public static void main(String[] args) {

        int resultadoProduto = produto(10, 50.00);
        System.out.println("Valor total gasto: " + resultadoProduto + "\n");

        int resultadoProduto2 = produto(10, 50.0, 10.0);
        System.out.println("Valor total gasto com desconto: " + resultadoProduto2 +"\n");
    }

    public static int produto(int a, double b) {
        return (int) (a * b);
    }

    public static int produto(int quantidade, double preco, double descontoPercent) {
        double valorBruto = quantidade * preco;
        double desconto = valorBruto * (descontoPercent / 100);
        double valorFinal = valorBruto - desconto;
        return (int) valorFinal;
    }
}
