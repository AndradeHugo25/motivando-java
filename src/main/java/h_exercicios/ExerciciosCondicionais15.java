package h_exercicios;

import java.util.Scanner;

public class ExerciciosCondicionais15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 3 frutas, separados por vírgula:");
        String fruta = in.next();

        if (fruta == "banana") {
            System.out.println("A lista possui banana");
        } else {
            System.out.println("A lista não possui banana");
        }
    }
}
