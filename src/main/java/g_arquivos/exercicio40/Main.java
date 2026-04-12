package g_arquivos.exercicio40;

import g_arquivos.excel.ManipuladorExcel;
import org.apache.poi.ss.usermodel.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String caminhoArquivo = "src/main/java/g_arquivos/excel/Teste.xlsx";
        ManipuladorExcel.lerAbas(caminhoArquivo);
        Sheet planilha = ManipuladorExcel.obterAbaPorNome(caminhoArquivo, "Jogadores");
        Map<String, String> jogadoras = new HashMap<>();
        int cont = 0;
        String sexo = " ";
        for (int i = 0; i <= planilha.getLastRowNum(); i++) {
            sexo = ManipuladorExcel.obterValorCelula(caminhoArquivo, "Jogadores", i, 2).trim();
            if (sexo.equals("F")) {
                cont++;
                jogadoras.put(ManipuladorExcel.obterValorCelula(caminhoArquivo, "Jogadores", i, 0).trim(), ManipuladorExcel.obterValorCelula(caminhoArquivo, "Jogadores", i, 1).trim());
            }
        }

        System.out.println("O time tem " + cont + " jogadoras.");
        System.out.println("São elas: ");
        jogadoras.entrySet().stream()
                .forEach(n -> System.out.println(n.getValue()));
    }
}
