/*Exercicio34*/

import java.util.Scanner;

public class Exercicio34 {

    public static double calcularTotal(int quantidade, double preco) {

        return quantidade * preco;
    }

    public static double calcularTotal(int quantidade, double preco, double desconto) {

        double total = quantidade * preco;

        return total - (total * desconto / 100);
    }

    public static void main(String[] args) {
        System.out.println("DESCONTO NA COMPRA");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade: ");

        int quantidade = scanner.nextInt();

        System.out.print("Preço: ");

        double preco = scanner.nextDouble();

        System.out.print("Desconto (%): ");

        double desconto = scanner.nextDouble();
        double totalSemDesconto = calcularTotal(quantidade, preco);
        double totalComDesconto = calcularTotal(quantidade, preco, desconto);
        System.out.println("Total sem desconto: R$ " + totalSemDesconto);
        System.out.println("Total com desconto: R$ " + totalComDesconto);

    }
}