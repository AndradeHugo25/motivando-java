package a_basico.correcoes;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Leia a cédula: ");
        double cedula = sc.nextDouble();
        double cerveja = 6.00;
        double troco = cedula % cerveja;
        System.out.println("Seu troco é R$ " + String.format("%.2f", troco));
        System.out.println("Volte sempre!!! E lembre-se: Se beber não dirija!");
    }

}