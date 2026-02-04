package b_condicionais.exercicios;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class ExercicioDez {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numeroAleatorio = RandomGenerator.getDefault().nextInt(1, 5);

        System.out.println("Informe o número desejado: ");
        String resultado = in.nextInt() == numeroAleatorio ? "Acertou!" : "Errou...";

        System.out.println(resultado + "\n" + "O numéro sorteado era " + numeroAleatorio);

    }
}

/* Regras:
- computador sorteia um número de 1 a 5
- usuário entra com um número
- computador exibe se usuário acertou ou não o número sorteado

Obs.: Código para gerar um número inteiro aleatório no intervalo de A até B: */