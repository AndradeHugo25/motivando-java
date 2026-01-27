package g_arquivos.Exercicios41;

import g_arquivos.excel.ManipuladorExcel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "src/main/java/g_arquivos/excel/Teste.xlsx";
        ManipuladorExcel.lerAbas(caminhoArquivo);

        String nomeAba = "Jogadores";
        Sheet aba = ManipuladorExcel.obterAbaPorNome(caminhoArquivo, nomeAba);

        int totalJogadoras = 0;
        int lastRowNum = aba.getLastRowNum();

        for (int i = 1; i <= lastRowNum; i++) {
            Row linha = aba.getRow(i);
            if (linha != null) {
                String sexo = ManipuladorExcel.obterValorCelula(caminhoArquivo, nomeAba, i, 2);
                if (sexo.equalsIgnoreCase("F")) {
                    totalJogadoras++;
                }
            }
        }
        System.out.println("Total de jogadoras no time: " + totalJogadoras);
    }
}