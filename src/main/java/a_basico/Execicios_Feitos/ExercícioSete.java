package a_basico.Execicios_Feitos;

import java.util.Scanner;

public class ExercícioSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //double litrotinta = 2.00;

        System.out.println("Bom dia Consagrado, Digite a Largura da Parede (em metros): ");
        double largura = Double.parseDouble(sc.next().replace(",", "."));

        System.out.println("Agora a Altura da Parede (em metros): ");
        double altura = Double.parseDouble(sc.next().replace(",", "."));

        double area = largura * altura;
        area = Math.round(area * 100.0) / 100.0;
        System.out.println("A área da parede é: " + area + " m²");

        double quantidadeTinta = area / 2;
        //quantidadeTinta = Math.round(area * 100.0) / 100.0;
        System.out.println("Você vai precisar de " + quantidadeTinta + " litros de tinta");

    }
}
