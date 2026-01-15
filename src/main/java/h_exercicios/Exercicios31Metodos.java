package h_exercicios;

public class Exercicios31Metodos {

    public static void main(String[] args) {
        int mediaTemperatura = divisao(32, 42);
        System.out.println("Média de temperatura é: " + mediaTemperatura);
    }

    public static int divisao(int a, int b) {
        return (a + b) / 2 ;
    }
}
