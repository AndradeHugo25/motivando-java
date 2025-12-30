package a_basico.exercicios;

import java.util.Scanner;

//Antecessor / Sucessor
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("O antecessor de " + num + " é " + antecessor + " e o sucessor é " + sucessor);
    }
}
//public class AntecessorSucessor {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Entrada do usuário
//        System.out.print("Digite um número: ");
//        int numero = scanner.nextInt();
//
//        // Cálculo do antecessor e sucessor
//        int antecessor = numero - 1;
//        int sucessor = numero + 1;
//
//        // Saída
//        System.out.println("O antecessor de " + numero + " é " + antecessor +
//                " e o sucessor é " + sucessor);



