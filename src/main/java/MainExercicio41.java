/*Exercicio41*/

import g_arquivos.excel.ManipuladorExcel;

public class MainExercicio41 {

    public static void main(String[] args) {

        String caminho = "src/main/java/g_arquivos/excel/Teste.xlsx";
        String aba = "Dados da Partida";

        double golsFeitos = 0;
        double golsSofridos = 0;

        for (int i = 1; i <= 5; i++) {

            golsFeitos += Double.valueOf(
                    ManipuladorExcel.obterValorCelula(caminho, aba, i, 1)
            );

            golsSofridos += Double.valueOf(
                    ManipuladorExcel.obterValorCelula(caminho, aba, i, 2)
            );
        }

        double saldo = golsFeitos - golsSofridos;

        System.out.println("Saldo de gols: " + saldo);
    }
}