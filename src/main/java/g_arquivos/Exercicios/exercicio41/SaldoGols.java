package g_arquivos.Exercicios.exercicio41;

import g_arquivos.excel.ManipuladorExcel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class SaldoGols {
    public static void main(String[] args){
        String caminhoArquivo = "src/main/java/g_arquivos/excel/Teste.xlsx";
        Sheet abaJogadores = ManipuladorExcel.obterAbaPorNome(caminhoArquivo, "Dados da Partida");

        int totalGolsFeitos = 0;
        int totalGolsSofridos = 0;

        if (abaJogadores != null) {
            int primeiraLinha = abaJogadores.getFirstRowNum() + 1; // pula cabeçalho
            int ultimaLinha = abaJogadores.getLastRowNum();
            for (int i = primeiraLinha; i <= ultimaLinha; i++) {
                Row linha = abaJogadores.getRow(i);
                if (linha != null) {
                    // Coluna B = índice 1, Coluna C = índice 2
                    if (linha.getCell(1) != null) {
                        totalGolsFeitos += (int)linha.getCell(1).getNumericCellValue();
                    }
                    if (linha.getCell(2) != null) {
                        totalGolsSofridos += (int)linha.getCell(2).getNumericCellValue();
                    }
                }
            }
        } else {
            System.out.println("Erro ao abrir a aba do Excel.");
            return;
        }

        SaldoGolsTime saldo = new SaldoGolsTime(totalGolsFeitos, totalGolsSofridos);
        System.out.println("Saldo de Gols do Time na Partida: " + saldo.getSaldoGols());
    }
}
