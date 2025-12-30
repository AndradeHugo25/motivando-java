package a_basico.exercicios;

//Quantidade de cervejas que podem ser compradas com cada nota de real.
public class Exercicio5 {
    public static void main(String[] args) {
        // Preço da cerveja
        int precoCerveja = 6;

        // Valores das notas
        int[] notas = {10, 20, 50, 100};

        // Calcula e imprime quantas cervejas podem ser compradas com cada nota
        for (int nota : notas) {
            int quantidade = nota / precoCerveja;
            System.out.println("Com a nota de R$" + nota + ",00 o cliente pode comprar " + quantidade + " cervejas.");
            //int troco = nota % precoCerveja;
            //System.out.println("Com a nota de R$" + nota + ",00 o cliente pode comprar " + quantidade + " cervejas e sobra R$" + troco + ",00 de troco.");
        }
    }
}
