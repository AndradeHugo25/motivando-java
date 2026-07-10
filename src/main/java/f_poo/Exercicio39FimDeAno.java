package f_poo;

public class Exercicio39FimDeAno {

    public static void main(String[] args) {

        Data data1 = new Data(20, 12, 2025);

        System.out.println("Data 1:");
        data1.imprimirData();
        System.out.println(data1.quantoParaFimAno());

        System.out.println();

        Data data2 = new Data(10, 7, 2025);

        System.out.println("Data 2:");
        data2.imprimirData();
        System.out.println(data2.quantoParaFimAno());

        System.out.println();

        Data data3 = new Data(35, 15, -1);

        System.out.println("Data 3:");
        data3.imprimirData();
    }
}