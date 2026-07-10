package e_metodos;

public class Exercicio31TemperaturaMedia {

    public static void main(String[] args) {

        double media = calcularMedia(20, 30);

        System.out.println("A média das temperaturas é " + media + "°C");
    }

    public static double calcularMedia(double temperatura1, double temperatura2) {

        return (temperatura1 + temperatura2) / 2;
    }
}