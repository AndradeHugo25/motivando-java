/*Exercicio25*/

public class Exercicio25 {
    public static void main(String[] args) {

        System.out.println("O DOBRO OU NADA");

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.print("{");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] * 2);

             if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}