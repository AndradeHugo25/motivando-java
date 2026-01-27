package g_arquivos.Exercicios;

import g_arquivos.excel.ManipuladorExcel;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "src/main/java/g_arquivos/excel/Teste.xlsx";
        ManipuladorExcel.lerAbas(caminhoArquivo);

        String valor = ManipuladorExcel.obterValorCelula(caminhoArquivo, "Jogadores", 2, 2);
        System.out.println("jogadora => " + valor);
    }
}
