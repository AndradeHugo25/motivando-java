package e_metodos.exercicios;

public class exercicio32 {
    public static void main(String[] args) throws Exception {
        idadeValida(130);
    }

    public static void idadeValida (int idade) throws Exception {
        if (idade < 0 || idade > 120){
            throw new Exception("Idade inválida!");
        }
    }
}
