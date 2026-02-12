package g_arquivos.Exercicios.exercicio40;

import g_arquivos.excel.ManipuladorExcel;
import org.apache.poi.ss.usermodel.Sheet;

public class Jogadores {
    public static void main(String[] args) {
        String caminhoArquivo = "src/main/java/g_arquivos/excel/Teste.xlsx";
        //ManipuladorExcel.lerAbas(caminhoArquivo);
        Sheet abaJogadores = ManipuladorExcel.obterAbaPorNome(caminhoArquivo, "Jogadores");
       // if (abaJogadores == null) {
        //    System.out.println("Aba 'Jogadores' não encontrada ou erro ao ler o arquivo.");
        //    return;
        //}
        int totalJogadoras = 0;
        for (int i = 1; i <= abaJogadores.getLastRowNum(); i++) { // começa em 1 para ignorar cabeçalho
            if (abaJogadores.getRow(i) != null && abaJogadores.getRow(i).getCell(2) != null) {
                String valorSexo = abaJogadores.getRow(i).getCell(2).toString().trim().toUpperCase();
                if (valorSexo.equals("F")) {
                    totalJogadoras++;
                }
            }
        }
        System.out.println("Quantidade de jogadoras (sexo F) no time: " + totalJogadoras);
    }
}
