package a_basico.exercicios;

import java.util.Scanner;
//Deteminar quantidade de tinta para pintar a área
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a largura da parede: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura da parede: ");
        double altura = scanner.nextDouble();

        // Cálculo da área
        double area = largura * altura;

        // Cada litro de tinta pinta 2 m²
        double litrosTinta = area / 2;

        // Truncar para 2 casas decimais
        double areaTruncada = Math.floor(area * 100) / 100.0;
        double litrosTruncados = Math.floor(litrosTinta * 100) / 100.0;

        System.out.println("A área a ser pintada é " + areaTruncada + " m².");
        System.out.println("Você vai precisar de " + litrosTruncados + " litros de tinta.");

        scanner.close();
    }
}

/*        // Formato com duas casas decimais
        //DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("A área a ser pintada é " + df.format(area) + " m².");
        System.out.println("Você vai precisar de " + df.format(litrosTinta) + " litros de tinta.");

        scanner.close();
    }
}*/

