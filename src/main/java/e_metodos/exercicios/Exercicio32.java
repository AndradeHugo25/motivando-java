package e_metodos.exercicios;

public class Exercicio32 {
    public static void main(String[] args) {
        //fiquei embananado com o nome dos mátodoa e variáveis tudo muito igual, como fazer para isso não me atrapalha?
        int idadeUsuario = 125;
        String validacaoIdade = idadeInvalida(idadeUsuario);
        System.out.println("Status da Conta: " + validacaoIdade);
    }

    public static String idadeInvalida(int idade) {
        if (idade >= 0 && idade < 120) {
            return "Idade Válida";
        } else {
            return "Idade Inválida";
        }
    }

}
