package e_metodos;

public class Exercicio34DescontoNaCompra {

    public static void main(String[] args) {

        double totalSemDesconto = calcularCompra(5, 10);
        double totalComDesconto = calcularCompra(5, 10, 20);

        System.out.println("Total sem desconto: R$" + totalSemDesconto);
        System.out.println("Total com desconto: R$" + totalComDesconto);
    }

    public static double calcularCompra(int quantidade, double preco) {

        return quantidade * preco;
    }

    public static double calcularCompra(int quantidade, double preco, double desconto) {

        double total = quantidade * preco;
        return total - (total * desconto / 100);
    }
}