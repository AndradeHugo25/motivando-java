package a_basico.Execicios_Feitos;

import java.util.Scanner;

public class ExercícioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Um Nùmero: ");
        while (!sc.hasNextInt()) {
            System.out.println("Valor inválido! Digite um número inteiro:");
            sc.next(); // descarta a entrada inválida
        }
        int Numero1 = sc.nextInt();
        int anterior = Numero1 - 1;
        int posterior = Numero1 + 1;
        System.out.println("Número Anterior: " + anterior);
        System.out.println("Número Posterior: " + posterior);

    }
}

