package g_arquivos.excel;

public class Exercicio41SaldoGolsTime {

    public static void main(String[] args) {

        String caminhoArquivo =
                "src/main/java/g_arquivos/excel/Teste.xlsx";

        int totalGolsFeitos = 0;
        int totalGolsSofridos = 0;

        for (int i = 1; i <= 5; i++) {

            totalGolsFeitos += Integer.parseInt(
                    ManipuladorExcel.obterValorCelula(
                            caminhoArquivo,
                            "Dados da Partida",
                            i,
                            1));

            totalGolsSofridos += Integer.parseInt(
                    ManipuladorExcel.obterValorCelula(
                            caminhoArquivo,
                            "Dados da Partida",
                            i,
                            2));
        }

        int saldoGols =
                totalGolsFeitos - totalGolsSofridos;

        System.out.println(
                "Saldo de gols do time: "
                        + saldoGols);
    }
}