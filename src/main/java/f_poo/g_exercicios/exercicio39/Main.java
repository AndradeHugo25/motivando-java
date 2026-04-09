package f_poo.g_exercicios.exercicio39;

public class Main {
    public static void main(String[] args) {
        Data d1 = new Data(1, 12, 2003);
        d1.imprimirData();
        System.out.println(d1.quantoParaFimAno());
        Data d2 = new Data(31, 1, 2026);
        d2.imprimirData();
        System.out.println(d2.quantoParaFimAno());

//        Data diaInvalidoMenos = new Data(0, 12, 2003);
//        Data diaInvalidoMais = new Data(32, 12, 2003);
//        Data mesInvalidoMenos = new Data(30, 0, 2003);
//        Data mesInvalidoMais = new Data(30, 13, 2003);
//        Data anoInvalido = new Data(30, 10, 0);
    }
}
