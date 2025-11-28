package e_metodos;

public class Metodos3Excecoes {

    public static void main(String[] args) throws Exception {

        divisaoFixa();

        conversaoIdade("25");

        conversaoIdade("vinte");

        String texto = pegarLetra("abc", 5);

    }

    public static void divisaoFixa() {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!\n\n");
        }
    }

    public static void conversaoIdade(String entrada) {
        try {
            int idade = Integer.parseInt(entrada);
            System.out.println("Sua idade é: " + idade + " anos.\n");
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido para a idade.\n");
        } finally {
            System.out.println("Processo de leitura de idade finalizado.\n");
        }
    }

    public static String pegarLetra(String texto, int indice) throws Exception {
        return String.valueOf(texto.charAt(indice));
    }
}
