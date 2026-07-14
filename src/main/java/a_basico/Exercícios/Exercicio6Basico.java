package a_basico.Exercícios;

public class Exercicio6Basico {

    public static void main(String[] args) {

        double precoCerveja = 6.00;
        double nota10 = 10.00;
        double nota20 = 20.00;
        double nota50 = 50.00;
        double nota100 = 100.00;

        System.out.println("Com uma Nota de R$ 10,00 você consegue comprar " + (int)(nota10 / precoCerveja) + " cervejas e receberá um troco de R$ " + String.format("%.2f", (nota10 % precoCerveja)) + ".");
        System.out.println("Com uma Nota de R$ 20,00 você consegue comprar " + (int)(nota20 / precoCerveja) + " cervejas e receberá um troco de R$ " + String.format("%.2f", (nota20 % precoCerveja)) + ".");
        System.out.println("Com uma Nota de R$ 50,00 você consegue comprar " + (int)(nota50 / precoCerveja) + " cervejas e receberá um troco de R$ " + String.format("%.2f", (nota50 % precoCerveja)) + ".");
        System.out.println("Com uma Nota de R$ 100,00 você consegue comprar " + (int)(nota100 / precoCerveja) + " cervejas e receberá um troco de R$ " + String.format("%.2f", (nota100 % precoCerveja)) + ".");
    }
}
