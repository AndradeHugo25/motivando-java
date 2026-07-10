package g_arquivos.excel;

import org.apache.poi.ss.usermodel.Sheet;

public class Exercicio40TotalMeninas {

    public static void main(String[] args) {

        String caminhoArquivo =
                "src/main/java/g_arquivos/excel/Teste.xlsx";

        Sheet sheet =
                ManipuladorExcel.obterAbaPorNome(
                        caminhoArquivo,
                        "Jogadores");

        System.out.println(
                "Total de jogadoras: "
                        + sheet.getLastRowNum());
    }
}