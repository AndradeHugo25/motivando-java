package c_repeticao.Exercicios;

public class Exercicio18Repeticao {
    public static void main(String[] args) {
        int quantidadeImpar = 0;
        for(int contador = 100; contador <= 200; contador++){
            if (!(contador % 2 == 0)){
                System.out.print(contador + " - ");
                quantidadeImpar++;
                }
            }
        System.out.println("\n\n");
        System.out.println("Quantidade de números ímpares: " + quantidadeImpar);
    }
}
