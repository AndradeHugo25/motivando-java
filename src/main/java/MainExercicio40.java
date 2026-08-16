/*Exercicio40*/

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import g_arquivos.excel.ManipuladorExcel;

public class MainExercicio40 {

    public static void main(String[] args) {

        ManipuladorExcel manipulador = new ManipuladorExcel();

        Sheet sheet = ManipuladorExcel.obterAbaPorNome(
                "src/main/java/g_arquivos/excel/Teste.xlsx",
                "Jogadores");

        int totalMeninas = 0;

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

            Row linha = sheet.getRow(i);


            String sexo = linha.getCell(2).getStringCellValue();

            if ("F".equalsIgnoreCase(sexo)) {
                totalMeninas++;
            }
        }

        System.out.println("Total de meninas: " + totalMeninas);
    }
}
