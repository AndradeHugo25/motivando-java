package e_metodos.correcoes;

public class Exercicios32MetodosCorrecao {
    public static void main(String[] args) throws Exception {
        idadeValida(121);
    }

    public static void idadeValida(int idade) throws Exception {
        if (idade < 0 || idade > 120) {
            throw new Exception("Idade inválida!");
        }
        System.out.println("Sua idade é: " + idade + " anos.\n");
    }
}