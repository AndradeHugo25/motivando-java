package g_arquivos.txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ManipuladorTxt {

    public String lerTextoCompleto(String filePath) {
        try {
            return Files.readString(Paths.get(filePath));
        } catch (IOException e) {
            System.err.println("Erro ao ler o texto completo do arquivo: " + e.getMessage());
            return "";
        }
    }

    public List<String> lerTiposDeTeste(String filePath) {
        try {
            return Files.lines(Paths.get(filePath))
                        .dropWhile(line -> !line.startsWith("Principais tipos de teste em QA:"))
                        .skip(1)
                        .takeWhile(line -> line.startsWith("- "))
                        .map(line -> line.substring(2).trim())
                        .collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println("Erro ao ler os tipos de teste do arquivo: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}
