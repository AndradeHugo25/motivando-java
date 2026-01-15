package h_exercicios;


public class Exercicios32Metodos {
    public static void main(String[] args) throws Exception {
        idadeValida("110");
    }

    public static void idadeValida(String entrada) throws Exception {

        try {
            int idade = Integer.parseInt(entrada);

            if (idade < 0 || idade > 120) {
                throw new Exception("Idade inválida!");
            }

            System.out.println("Sua idade é: " + idade + " anos.\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}