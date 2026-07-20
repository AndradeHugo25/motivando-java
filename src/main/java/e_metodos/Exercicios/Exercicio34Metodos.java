package e_metodos.Exercicios;

public class Exercicio34Metodos {
    public static void main(String[] args) {

        precoCompra(5, 10.0);

        precoCompra(5, 10.0, 10.0);
    }

    public static void precoCompra(double quantidade, double preco) {
        double total = quantidade * preco;
        System.out.println("Total: " + total);
    }

    public static void precoCompra(double quantidade, double preco, double desconto) {
        double totalComDesconto = (quantidade * preco) * (1 - desconto/100);
        System.out.println("Total com desconto: " + totalComDesconto);
    }
}
