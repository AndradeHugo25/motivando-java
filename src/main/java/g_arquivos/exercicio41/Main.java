package g_arquivos.exercicio41;

import g_arquivos.excel.ManipuladorExcel;
import org.apache.poi.ss.usermodel.*;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "src/main/java/g_arquivos/excel/Teste.xlsx";
        String aba = "Dados da Partida";
        ManipuladorExcel.lerAbas(caminhoArquivo);
        Sheet planilha = ManipuladorExcel.obterAbaPorNome(caminhoArquivo, aba);
        ArrayList<Integer> golsFeitos = new ArrayList<>();
        ArrayList<Integer> golsSofridos = new ArrayList<>();

        for (int i = 1; i <= planilha.getLastRowNum(); i++) {
            golsFeitos.add(Integer.parseInt(ManipuladorExcel.obterValorCelula(caminhoArquivo,aba, i, 1)));
            golsSofridos.add(Integer.parseInt(ManipuladorExcel.obterValorCelula(caminhoArquivo,aba, i, 2)));
        }

        int totalGolsFeitos = golsFeitos.stream().reduce(0, Integer::sum);
        int totalGolsSofridos = golsSofridos.stream().reduce(0, Integer::sum);

        int saldoGols = totalGolsFeitos - totalGolsSofridos;

        System.out.println("O saldo de gols do time na partida foi de " + saldoGols);
    }
}
