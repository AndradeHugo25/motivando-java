package a_basico.exercicios;

public class Exercicios06 {
    public static void main(String[] args) {
        int cervejaLata = (int) 6.00;
        int cerveja10 = (int) (10 % cervejaLata) ;
        int cerveja20 = (int) (20 % cervejaLata) ;
        int cerveja50 = (int) (50 % cervejaLata) ;
        int cerveja100 = (int) (100 % cervejaLata) ;
        System.out.println("Você pode comprar uma lata de cerveja por: " + cervejaLata);
        System.out.println("com R$10,00 você tem troco: " + cerveja10 + " | com R$20,00 você tem troco: " + cerveja20 + " | com R$50,00 você tem troco: " + cerveja50 + " | com R$100,00 você tem troco: " + cerveja100);
    }
}
