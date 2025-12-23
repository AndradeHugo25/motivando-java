package a_basico;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio1Test {
    @ParameterizedTest
    @ValueSource(strings = {
            "a_basico.Teste"
    })
    void testExercicio1(String className) throws Exception {
        String nome = "João da Silva";
        String input = nome + "\n";
        Class<?> clazz = Class.forName(className);
        Method main = clazz.getMethod("main", String[].class);
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        try {
            main.invoke(null, (Object) new String[]{});
        } finally {
            System.setOut(originalOut);
        }
        String output = out.toString();
        assertTrue(output.contains(nome), "A mensagem final não contém o nome digitado pelo usuário na classe: " + className);
    }
}
