package f_poo.z_exercicios.exercicios39;

public class Main {

    public static void main(String[] args) throws Exception {
        Data novaData1 = new Data(20, 3, 2030);
        System.out.println(novaData1.imprimirData());
        System.out.println(novaData1.quantoParaFimAno());

        Data novaData2 = new Data(6, 4, 2020);
        System.out.println(novaData2.imprimirData());
        System.out.println(novaData2.quantoParaFimAno());

        Data novaData3 = new Data(15, 12, 2060);
        System.out.println(novaData3.imprimirData());
        System.out.println(novaData3.quantoParaFimAno());
    }
}
