package g_arquivos.Exercicios42;

import g_arquivos.excel.ManipuladorExcel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "src/main/java/g_arquivos/excel/Teste.xlsx";
        ManipuladorExcel.lerAbas(caminhoArquivo);

        String nomeAba = "Dados da Partida";
        Sheet aba = ManipuladorExcel.obterAbaPorNome(caminhoArquivo, nomeAba);

        int lastRowNum = aba.getLastRowNum();

        // Começar da linha 1 para ignorar cabeçalho
        for (int i = 1; i <= lastRowNum; i++) {
            Row row = aba.getRow(i);
            if (row != null) {
                Cell cellGolsFeitos = row.getCell(1);   // coluna Gols Feitos
                Cell cellGolsSofridos = row.getCell(2); // coluna Gols Sofridos

                int golsFeitos = (int) cellGolsFeitos.getNumericCellValue();
                int golsSofridos = (int) cellGolsSofridos.getNumericCellValue();
                int saldo = golsFeitos - golsSofridos;

                System.out.println("Partida " + i + ":" + "  Gols Feitos: " + golsFeitos + "  Gols Sofridos: " + golsSofridos + "  Saldo de Gols: " + saldo);
            }
        }
    }
}
