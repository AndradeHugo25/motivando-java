package g_arquivos.correcoes;

import g_arquivos.excel.ManipuladorExcel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Exercicio41 {
    static void main() {
        String caminhoArquivo = "src/main/java/g_arquivos/excel/Teste.xlsx";
        ManipuladorExcel.lerAbas(caminhoArquivo);

        String nomeAba = "Dados da Partida";
        Sheet aba = ManipuladorExcel.obterAbaPorNome(caminhoArquivo, nomeAba);

        int lastRowNum = aba.getLastRowNum();
        int golsFeitos = 0, golsSofridos = 0;

        // Começar da linha 1 para ignorar cabeçalho
        for (int i = 1; i <= lastRowNum; i++) {
            Row row = aba.getRow(i);
            if (row != null) {
                golsFeitos += Integer.parseInt(ManipuladorExcel.obterValorCelula(caminhoArquivo, nomeAba, i, 1));
                golsSofridos += Integer.parseInt(ManipuladorExcel.obterValorCelula(caminhoArquivo, nomeAba, i, 2));
            }
        }

        System.out.println("\nSaldo de Gols do time: " + (golsFeitos - golsSofridos));
    }
}
