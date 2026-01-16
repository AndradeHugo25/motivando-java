package e_metodos.exercicios;

public class Exercicios31Metodos {

    public static void main(String[] args) {
        int mediaTemperatura = divisao(32, 40);
        System.out.println("Média de temperatura é: " + mediaTemperatura + "º graus");
    }

    public static int divisao(int a, int b) {
        return (a + b) / 2 ;
    }
}
