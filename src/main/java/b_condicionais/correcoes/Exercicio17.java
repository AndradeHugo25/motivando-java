package b_condicionais.correcoes;

import java.text.DecimalFormat;
import java.util.Scanner;

//Calculadora
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite um número.");
            sc.close();
            return;
        }
        //Atribui o primero número digitado a variável "a"
        double a = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite um número.");
            sc.close();
            return;
        }
        //Atribui o segundo número digitado a variável "b"
        double b = sc.nextDouble();
        sc.nextLine(); // consome o fim da linha

        System.out.print("Escolha a operação (+, -, *, /): ");
        String op = sc.nextLine().trim();

        switch (op) {
            case "+" -> System.out.println("Resultado: " + (a + b));
            case "-" -> System.out.println("Resultado: " + (a - b));
            case "*" -> System.out.println("Resultado: " + (a * b));
            case "/" -> {
                if (b == 0) {
                    System.out.println("Divisão por zero não é permitida.");
                } else {
                    double resultado = a / b;
                    DecimalFormat df = new DecimalFormat("#.##");
                    System.out.println("Resultado: " + df.format(resultado));
                }
            }
            default -> System.out.println("Operação inválida. Use +, -, * ou /. ");
        }

        sc.close();
    }
}
