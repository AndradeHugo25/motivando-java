package e_metodos.exercicios;

public class Exercicio34 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println(calculadoraPreco(-10,12.5));
        System.out.println("------------------------------------------");
        System.out.println(calculadoraPreco(10,12.5));
        System.out.println("------------------------------------------");
        System.out.println(calculadoraPreco(10,-12.5));
        System.out.println("------------------------------------------");
        System.out.println(calculadoraPreco(10, 40, 50));
        System.out.println("------------------------------------------");
        System.out.println(calculadoraPreco(-10, 40, 50));
        System.out.println("------------------------------------------");
        System.out.println(calculadoraPreco(10, -40, 50));
        System.out.println("------------------------------------------");
        System.out.println(calculadoraPreco(10, 40, -50));
    }

    public static double calculadoraPreco (int quantidade, double preco){
        try {
            if (quantidade < 0 || preco < 0){
                throw new Exception("Quantidade e/ou preço negativo.");
            }
            return quantidade * preco;
        } catch (Exception erroNegativo) {
            System.out.println(erroNegativo.getMessage());
        }
        return Double.NaN;
    }

    public static double calculadoraPreco (int quantidade, double preco, double desconto){
        desconto = 1 - (desconto / 100);

        try {
            if (quantidade < 0 || preco < 0){ //Considerei neste caso que o desconto pode ser negativo, o que faz o preço ser maior.
                throw new Exception("Quantidade e/ou preço negativo.");
            }
            return quantidade * preco * desconto;
        } catch (Exception erroNegativo) {
            System.out.println(erroNegativo.getMessage());
        }
        return Double.NaN;
    }
}
