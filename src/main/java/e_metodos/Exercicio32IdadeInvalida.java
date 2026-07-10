package e_metodos;

public class Exercicio32IdadeInvalida {

    public static void main(String[] args) {

        validarIdade(25);
    }

    public static void validarIdade(int idade) {

        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida.");
        }

        System.out.println("Idade válida.");
    }
}