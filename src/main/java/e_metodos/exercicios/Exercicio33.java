package e_metodos.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

// usei o gemini nesta tarefa pois estava com dificuldade de entender a lógica do try-catch e de visualizar como seria um try-catch em loop
// mas consegui entender e desenvolver

public class Exercicio33 {
    public static void main(String[] args) throws Exception{
        idadeValida();
    }

    public static void idadeValida () {
        Scanner in = new Scanner(System.in);
        int idade = -1;
        System.out.println("Informe uma idade válida (de 0 a 120)");

        while (idade < 0 || idade > 120) {
            try {
                System.out.println("Me informe a idade: ");

                idade = in.nextInt();

                if (idade < 0 || idade > 120){
                    throw new Exception("Foi inserida uma idade inválida!");
                }

                System.out.println("Idade válida! Você tem "+idade+" anos.");

            } catch (InputMismatchException erroDeDigitacao) { // vi no copilot a dica para este bloco
                System.out.println("Você digitou outro tipo de dado, e não foi um inteiro!");
                in.nextLine();

            } catch (Exception erroIdadeInvalida){
                System.out.println(erroIdadeInvalida.getMessage());
                System.out.println("Digite uma idade válida, por favor...");

            }
        }
    }
}
