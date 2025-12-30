package g_arquivos.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ManipuladorExcel {

    public static Sheet obterAbaPorNome(String caminhoArquivo, String nomeAba) {
        String caminhoAbsoluto = new File(caminhoArquivo).getAbsolutePath();
        try {
            FileInputStream fis = new FileInputStream(caminhoAbsoluto);
            Workbook workbook = new XSSFWorkbook(fis);
            return workbook.getSheet(nomeAba);
        } catch (Exception e) {
            return null;
        }
    }

    public static String obterValorCelula(String caminhoArquivo, String nomeAba, int linha, int coluna) {
        Sheet sheet = obterAbaPorNome(caminhoArquivo, nomeAba);
        Row row = sheet.getRow(linha);
        Cell cell = row.getCell(coluna);
        return cell.toString();
    }

    public static void lerAbas(String caminhoArquivo) {
        String caminhoAbsoluto = new File(caminhoArquivo).getAbsolutePath();
        try (FileInputStream fis = new FileInputStream(caminhoAbsoluto);
             Workbook workbook = new XSSFWorkbook(fis)) {
            int numAbas = workbook.getNumberOfSheets();
            System.out.println("Total de abas: " + numAbas);
            for (int i = 0; i < numAbas; i++) {
                Sheet sheet = workbook.getSheetAt(i);
                System.out.println("\nAba: " + sheet.getSheetName());
                int lastRowNum = sheet.getLastRowNum();
                int maxCellNum = 0;
                for (int r = 0; r <= lastRowNum; r++) {
                    Row row = sheet.getRow(r);
                    if (row != null) {
                        maxCellNum = row.getLastCellNum();
                        break;
                    }
                }
                for (int r = 0; r <= lastRowNum; r++) {
                    Row row = sheet.getRow(r);
                    if (row != null) {
                        System.out.print("Linha " + r + ": ");
                        for (int c = 0; c < maxCellNum; c++) {
                            Cell cell = row.getCell(c);
                            String valor = formatarValorCelula(cell);
                            System.out.print(valor + " | ");
                        }
                        System.out.println();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private static String formatarValorCelula(Cell cell) {
        if (cell == null) return "(vazio)";
        switch (cell.getCellType()) {
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    java.util.Date date = cell.getDateCellValue();
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM");
                    return sdf.format(date);
                }
                double d = cell.getNumericCellValue();
                if (d == (int) d) {
                    return String.valueOf((int) d);
                } else {
                    return String.valueOf(d);
                }
            case STRING:
                return cell.getStringCellValue();
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                try {
                    if (DateUtil.isCellDateFormatted(cell)) {
                        java.util.Date date = cell.getDateCellValue();
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM");
                        return sdf.format(date);
                    }
                    double fd = cell.getNumericCellValue();
                    if (fd == (int) fd) {
                        return String.valueOf((int) fd);
                    } else {
                        return String.valueOf(fd);
                    }
                } catch (Exception e) {
                    return cell.getCellFormula();
                }
            case BLANK:
                return "(vazio)";
            default:
                return cell.toString();
        }
    }
}
