package e_metodos.correcoes;

public class Exercicio32 {

    public static void main(String[] args) throws Exception {
        verificarIdade(2);
    }

    public static void verificarIdade(int idade) throws Exception {
        if (idade >= 0 && idade <= 120) {
            System.out.println("A idade de " + idade + " anos é válida.");
        } else {
            throw new Exception("Idade inválida!");
        }
    }
}
