package g_arquivos.Exercicios.exercicio41;

import g_arquivos.excel.ManipuladorExcel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class SaldoGolsPorLinha {
    public static void main(String[] args){
        String caminhoArquivo = "src/main/java/g_arquivos/excel/Teste.xlsx";
        Sheet abaDadosPartida = ManipuladorExcel.obterAbaPorNome(caminhoArquivo, "Dados da Partida");

        if (abaDadosPartida != null) {
            int primeiraLinha = abaDadosPartida.getFirstRowNum() + 1; // pula cabeçalho
            int ultimaLinha = abaDadosPartida.getLastRowNum();
            for (int i = primeiraLinha; i <= ultimaLinha; i++) {
                Row linha = abaDadosPartida.getRow(i);
                if (linha != null) {
                    int golsFeitos = 0;
                    int golsSofridos = 0;
                    if (linha.getCell(1) != null) {
                        golsFeitos = (int)linha.getCell(1).getNumericCellValue();
                    }
                    if (linha.getCell(2) != null) {
                        golsSofridos = (int)linha.getCell(2).getNumericCellValue();
                    }
                    SaldoGolsTime saldo = new SaldoGolsTime(golsFeitos, golsSofridos);
                    System.out.println("Partida " + (i - primeiraLinha + 1) + ": Gols Feitos = " + golsFeitos + ", Gols Sofridos = " + golsSofridos + ", Saldo = " + saldo.getSaldoGols());
                }
            }
        } else {
            System.out.println("Erro ao abrir a aba do Excel.");
        }
    }
}

