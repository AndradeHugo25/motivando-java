package g_arquivos.excel;
import org.apache.poi.ss.usermodel.Sheet;

public class Exercicio41Arquivos {
    public static void main(String[] args) {

        String caminho = "src/main/java/g_arquivos/excel/Teste.xlsx";

        Sheet aba = ManipuladorExcel.obterAbaPorNome(caminho, "Dados da Partida");

        int totalGolsFeitos = 0;
        int totalGolsSofridos = 0;

        for (int linha = 1; linha <= aba.getLastRowNum(); linha++) {

            int golsFeitos = Integer.parseInt(
                    ManipuladorExcel.obterValorCelula(
                            caminho,
                            "Dados da Partida",
                            linha,
                            1
                    )
            );

            int golsSofridos = Integer.parseInt(
                    ManipuladorExcel.obterValorCelula(
                            caminho,
                            "Dados da Partida",
                            linha,
                            2
                    )
            );

            totalGolsFeitos += golsFeitos;
            totalGolsSofridos += golsSofridos;
        }

        int saldoGols = totalGolsFeitos - totalGolsSofridos;

        System.out.println("Total de gols feitos: " + totalGolsFeitos);
        System.out.println("Total de gols sofridos: " + totalGolsSofridos);
        System.out.println("Saldo de gols: " + saldoGols);
    }
}

