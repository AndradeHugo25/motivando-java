package g_arquivos.txt;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ManipuladorTxt manipulador = new ManipuladorTxt();
        String filePath = "src/main/java/g_arquivos/txt/Teste2.txt";

        String textoCompleto = manipulador.lerTextoCompleto(filePath);
        System.out.println("Texto completo:\n");
        System.out.println(textoCompleto);

        List<String> tiposDeTeste = manipulador.lerTiposDeTeste(filePath);
        System.out.println("\nAgora vamos imprimir a lista de tipos de teste:\n");
        tiposDeTeste.forEach(System.out::println);
    }
}
