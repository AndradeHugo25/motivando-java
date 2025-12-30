package a_basico.correcoes;/*Exercicio 7
Patricia Ellen Silva Specht
Faça um programa que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma área de 2m².
Exemplo:
Digite a largura da parede: 4
Digite a altura da parede: 3
A área a ser pintada é 12 m².
Você vai precisar de 6 litros de tinta.
*/
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a largura da parede: ");
        double largura = sc.nextDouble();
        System.out.println("Digite a altura da parede: ");
        double altura = sc.nextDouble();
        double area = largura * altura;
        double tinta = area / 2;
        System.out.println("A área a ser pintada é  " + area + " m2.");
        System.out.println("Você vai precisar de " + (int)tinta + " litros de tinta.");
    }
}