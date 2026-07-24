package g_arquivos.excel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Exercicio40Arquivos {
    public static void main(String[] args) {
        String caminhoArquivo = "src/main/java/g_arquivos/excel/Teste.xlsx";
        Sheet abaJogadores =  ManipuladorExcel.obterAbaPorNome(caminhoArquivo, "Jogadores");


                int totalMeninas = 0;

                for (int linha = 1; linha <= abaJogadores.getLastRowNum(); linha++) {

                    String sexo = ManipuladorExcel.obterValorCelula(
                            caminhoArquivo,
                            "Jogadores",
                            linha,
                            2
                    );

                    if ("F".equalsIgnoreCase(sexo)) {
                        totalMeninas++;
                    }
                }

                System.out.println("Total de meninas: " + totalMeninas);
    }
}
