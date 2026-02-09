package f_poo.Exercicios.Exercicio39;

public class PrincipalExecutavel {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.setDia(20);
        data1.setMes(12);
        data1.setAno(2025);
        data1.imprimirData();
        data1.quantoParaFimAno();

        Data data2 = new Data();
        data2.setDia(32); // inválido
        data2.setMes(11);
        data2.setAno(2025);
        data2.imprimirData();
        data2.quantoParaFimAno();

        Data data3 = new Data();
        data3.setDia(15);
        data3.setMes(5);
        data3.setAno(0); // inválido
        data3.imprimirData();
        data3.quantoParaFimAno();
    }
}

