package f_poo.g_exercicios.exercicio39;

public class Exercicio39Poo {

    public static void main(String[] args) {

        System.out.println("Cenário 1: Data válida");
        Data data1 = new Data(20, 12, 2025);

        System.out.println("Dia: " + data1.getDia());
        System.out.println("Mês: " + data1.getMes());
        System.out.println("Ano: " + data1.getAno());

        data1.imprimirData();
        data1.quantoParaFimAno();

        System.out.println("\nCenário 2: Mês diferente de dezembro");
        Data data2 = new Data(15, 8, 2025);

        data2.imprimirData();
        data2.quantoParaFimAno();

        System.out.println("\nCenário 3: Testando setters válidos");
        data2.setDia(25);
        data2.setMes(10);
        data2.setAno(2026);

        data2.imprimirData();

        System.out.println("\nCenário 4: Testando dia inválido");
        data2.setDia(35);

        System.out.println("\nCenário 5: Testando mês inválido");
        data2.setMes(15);

        System.out.println("\nCenário 6: Testando ano inválido");
        data2.setAno(-2025);
    }
}