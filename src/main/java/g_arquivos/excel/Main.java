package g_arquivos.excel;

public class Main {

    public static void main(String[] args) {
        String caminhoArquivo = "src/main/java/g_arquivos/excel/Teste.xlsx";
        ManipuladorExcel.lerAbas(caminhoArquivo);


        System.out.println("\n");

        String valor = ManipuladorExcel.obterValorCelula(caminhoArquivo, "Pessoas", 2, 1);
        System.out.println("Nome da pessoa de ID 1 => " + valor);

        valor = ManipuladorExcel.obterValorCelula(caminhoArquivo, "Pessoas", 2, 3);
        System.out.println("Profissão da Vanessa ===> " + valor);

        valor = ManipuladorExcel.obterValorCelula(caminhoArquivo, "Dados", 1, 1);
        System.out.println("Gols da pessoa de ID 1 => " + valor);
    }
}
