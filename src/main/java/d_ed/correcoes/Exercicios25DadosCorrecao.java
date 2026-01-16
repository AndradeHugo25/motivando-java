package d_ed.correcoes;

public class Exercicios25DadosCorrecao {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        dobrarValores(numeros);
    }

    public static void dobrarValores(int[] numeros) {
        System.out.println("Dobro dos números: ");
        for (int numero : numeros) {
            System.out.print(numero * 2 + " ");
        }
    }
}
