package b_condicionais;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercicio8Test {

    @ParameterizedTest
    @ValueSource(strings = {"b_condicionais.Teste"})
    void testParOuImpar(String className) throws Exception {
        int numeroPar = 8;
        int numeroImpar = 7;
        assertMensagemParOuImpar(className, numeroPar, "par");
        assertMensagemParOuImpar(className, numeroImpar, "ímpar");
    }

    private void assertMensagemParOuImpar(String className, int numero, String esperado) throws Exception {
        Class<?> clazz = Class.forName(className);
        Method main = clazz.getMethod("main", String[].class);
        System.setIn(new ByteArrayInputStream((numero + "\n").getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        try {
            main.invoke(null, (Object) new String[]{});
        } finally {
            System.setOut(originalOut);
        }
        String output = out.toString().toLowerCase();
        assertTrue(output.contains(esperado), "A mensagem final não contém a palavra esperada ('" + esperado + "') para o número " + numero + " na classe: " + className);
    }
}
