package e_metodos;

public class Metodos2Sobrecarga {

    public static void main(String[] args) {

        printar("C:/imagens/print1.png");

        printar(3);

        printar("C:/imagens/print2.png", true);

    }


    public static void printar(String caminhoArquivo) {
        System.out.println("Print salvo em: " + caminhoArquivo);
    }

    public static void printar(int qtdPrints) {
        for (int i = 1; i <= qtdPrints; i++) {
            System.out.println("Print " + i + " salvo.");
        }
    }

    public static void printar(String caminhoArquivo, boolean duplicarBkp) {
        System.out.println("Print salvo em: " + caminhoArquivo);
        if (duplicarBkp) {
            System.out.println("Backup do print salvo em: " + caminhoArquivo + ".bak");
        }
    }

}
