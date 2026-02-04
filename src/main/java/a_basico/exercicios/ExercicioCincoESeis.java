package a_basico.exercicios;

public class ExercicioCincoESeis {
    public static void main(String[] args) {
//        Em um bar, uma cerveja em lata custa R$6,00. Crie um programa que imprima quantas cervejas o cliente pode comprar com notas de R$10,00, R$20,00, R$50,00 e R$100,00.

        int precoCerveja = 6;
        int qtdCervejaNotaDez = 10 / precoCerveja;
        int qtdCervejaNotaVinte = 20 / precoCerveja;
        int qtdCervejaNotaCinquenta = 50 / precoCerveja;
        int qtdCervejaNotaCem = 100 / precoCerveja;

        System.out.println("A cerveja custa " + precoCerveja + " reais.");

        System.out.println("Com uma nota de RS10,00 posso comprar " + qtdCervejaNotaDez + " cerveja(s).");
        System.out.println("Com uma nota de RS20,00 posso comprar " + qtdCervejaNotaVinte + " cerveja(s).");
        System.out.println("Com uma nota de RS50,00 posso comprar " + qtdCervejaNotaCinquenta + " cerveja(s).");
        System.out.println("Com uma nota de RS100,00 posso comprar " + qtdCervejaNotaCem + " cerveja(s).");

        System.out.println("Agora com o troco...");

        int trocoNotaDez = 10 % precoCerveja;
        int trocoNotaVinte = 20 % precoCerveja;
        int trocoNotaCinquenta = 50 % precoCerveja;
        int trocoNotaCem = 100 % precoCerveja;

        System.out.println("Com uma nota de RS10,00 posso comprar " + qtdCervejaNotaDez + " cerveja(s), e sobram " + trocoNotaDez + " reais.");
        System.out.println("Com uma nota de RS20,00 posso comprar " + qtdCervejaNotaVinte + " cerveja(s), e sobram " + trocoNotaVinte + " reais.");
        System.out.println("Com uma nota de RS50,00 posso comprar " + qtdCervejaNotaCinquenta + " cerveja(s), e sobram " + trocoNotaCinquenta + " reais.");
        System.out.println("Com uma nota de RS100,00 posso comprar " + qtdCervejaNotaCem + " cerveja(s), e sobram " + trocoNotaCem + " reais.");

    }
}
