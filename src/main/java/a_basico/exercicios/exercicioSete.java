package a_basico.exercicios;

import java.util.Scanner;

public class exercicioSete {
    public static void main(String[] args) {
//        Faça um programa que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma área de 2m².
//
//        Exemplo:
//        Digite a largura da parede: 4
//        Digite a altura da parede: 3
//        A área a ser pintada é 12 m².
//        Você vai precisar de 6 litros de tinta.

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a largura da parede: ");
        float larguraParede = in.nextFloat();
        System.out.println("Digite a altura da parede: ");
        float alturaParede = in.nextFloat();

        float areaPintada = (larguraParede*alturaParede);
        int qtdTinta = (int) Math.ceil(areaPintada / 2); //utilizei esse 'math.ceil' para arredondar "para cima" caso a divisão seja inexata, para não faltar tinta.

        System.out.println("A área a ser pintada é de " + areaPintada + "m quadrados\n");
        System.out.println("Você vai precisar de " + qtdTinta + "L de tinta.");

    }
}
