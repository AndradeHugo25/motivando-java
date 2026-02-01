package e_metodos.exercicios;

public class Exercicio34 {
    public static void main(String[] args) {
        int quantidade = 5;
        double preco = 25.60;
        double descontoPercentual = 10;
        double valorTotal = calcularTotal(quantidade, preco);
        double valorComDesconto = calcularTotal(quantidade, preco, descontoPercentual);

        System.out.println("Valor total sem desconto: " + valorTotal);
        System.out.println("Valor total com desconto: " + valorComDesconto);
    }
    //metodos
    public static double calcularTotal(int quantidade, double preco){
        return quantidade * preco;
    }
    public  static double calcularTotal (int quantidade, double preco, double descontoPercentual){
        return (quantidade * preco) * (1 - descontoPercentual / 100);

    }
}
