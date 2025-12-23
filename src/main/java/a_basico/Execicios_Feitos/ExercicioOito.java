package a_basico.Execicios_Feitos;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println ("Informe um numero intero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero " + numero + " é par.");
        } else {
            System.out.println("O numero " + numero + " é impar.");

        }
    }
}
