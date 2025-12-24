package b_condicionais;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercicio10Test {

    @ParameterizedTest
    @CsvSource({
        "b_condicionais.Teste2,1",
        "b_condicionais.Teste2,2",
        "b_condicionais.Teste2,3",
        "b_condicionais.Teste2,4",
        "b_condicionais.Teste2,5"
    })
    void testMensagemAcertoOuErro(String className, int palpite) throws Exception {
        Class<?> clazz = Class.forName(className);
        Method main = clazz.getMethod("main", String[].class);
        System.setIn(new ByteArrayInputStream((palpite + "\n").getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        try {
            main.invoke(null, (Object) new String[]{});
        } finally {
            System.setOut(originalOut);
        }
        String output = out.toString();
        boolean contemAcerto = output.contains("Parabéns! Você acertou o número aleatório:");
        boolean contemErro = output.contains("Que pena! O número aleatório era:");
        assertTrue(contemAcerto || contemErro, "A saída deve conter uma mensagem de acerto ou erro. Saída: " + output);

        int numRevelado = extraiNumeroRevelado(output);
        assertTrue(numRevelado >= 1 && numRevelado <= 5, "O número revelado deve estar entre 1 e 5. Saída: " + output);
    }

    private int extraiNumeroRevelado(String output) {
        String[] tokens = output.trim().split(" ");
        for (int i = tokens.length - 1; i >= 0; i--) {
            try {
                return Integer.parseInt(tokens[i].replaceAll("\\D", ""));
            } catch (NumberFormatException ignored) {}
        }
        return -1;
    }
}
