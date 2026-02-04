package c_repeticao.exercicios;

import java.util.Scanner;

public class ExercicioVinteQuatro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o numero desejado: ");
        int numeroDesejado = in.nextInt();

        int numeroUm = 1;
        int numeroDois = 2;
        int numeroTres = 3;
        int resultado = numeroUm*numeroDois*numeroTres;
        boolean loop = true;

        while (loop){
            if (numeroDesejado < resultado) {
                System.out.println("Número desejado não é um número triangular.");
                loop = false;
            }
            else if (numeroDesejado == resultado) {
                System.out.println(numeroUm + "*" + numeroDois + "*" + numeroTres + "=" + resultado);
                loop = false;
            }
            else {
                numeroUm++;
                numeroDois++;
                numeroTres++;
                resultado = numeroUm*numeroDois*numeroTres;
            }
        }

    }
}
