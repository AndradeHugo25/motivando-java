package d_ed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ED5Stream {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 1, 2);

        System.out.println("Iterando com forEach: ");
        imprimirNumeros(numeros);

        System.out.println("\n\nNúmeros pares: " + numerosPares(numeros));
        System.out.println("Dobro dos números: " + dobrarValores(numeros));
        System.out.println("Números sem duplicatas: " + numerosUnicos(numeros));
        System.out.println("Limitando números: " + limitarElementos(numeros, 2));
        System.out.println("Ignorando números: " + ignorarElementos(numeros, 3));

        System.out.println("\nOrdem decrescente: " + ordenarDecrescente(numeros));
        System.out.println("Quantidade de números: " + contarElementos(numeros));
        System.out.println("Soma de todos os números: " + somar(numeros));

        System.out.println("\nPrimeiro número: " + encontrarPrimeiro(numeros));
        System.out.println("Maior número: " + encontrarMaior(numeros));
        System.out.println("Menor número: " + encontrarMenor(numeros));
        System.out.println("Qualquer número maior que 2: " + encontrarQualquer(numeros, 2));

        System.out.println("\nTodos são pares? " + todosSaoPares(numeros));
        System.out.println("Algum é par? " + algumEhPar(numeros));
        System.out.println("Nenhum é maior que 10? " + nenhumMaiorQueDez(numeros));

        System.out.println("\nColetando números em uma string: " + coletarComoString(numeros));
    }

    public static void imprimirNumeros(List<Integer> numeros) {
        numeros.forEach(numero -> System.out.print(numero + " "));
    }

    public static List<Integer> numerosPares(List<Integer> numeros) {
        return numeros.stream()
                      .filter(numero -> numero % 2 == 0)
                      .toList();
    }

    public static List<Integer> dobrarValores(List<Integer> numeros) {
        return numeros.stream()
                      .map(numero -> numero * 2)
                      .toList();
    }

    public static List<Integer> numerosUnicos(List<Integer> numeros) {
        return numeros.stream()
                      .distinct()
                      .toList();
    }

    public static List<Integer> limitarElementos(List<Integer> numeros, int limite) {
        return numeros.stream()
                      .limit(limite)
                      .toList();
    }

    public static List<Integer> ignorarElementos(List<Integer> numeros, int quantidadeIgnorada) {
        return numeros.stream()
                      .skip(quantidadeIgnorada)
                      .toList();
    }

    public static List<Integer> ordenarDecrescente(List<Integer> numeros) {
        return numeros.stream()
                      .sorted((a, b) -> b - a)
                      .toList();
    }

    public static long contarElementos(List<Integer> numeros) {
        return numeros.stream()
                      .count();
    }

    public static int somar(List<Integer> numeros) {
        return numeros.stream()
                      .reduce(0, Integer::sum);
    }

    public static int encontrarPrimeiro(List<Integer> numeros) {
        return numeros.stream()
                      .findFirst()
                      .orElse(0);
    }

    public static int encontrarQualquer(List<Integer> numeros, int valor) {
        return numeros.stream()
                      .filter(numero -> numero > valor)
                      .findAny()
                      .orElse(0);
    }

    public static int encontrarMaior(List<Integer> numeros) {
        return numeros.stream()
                      .max(Integer::compareTo)
                      .orElse(0);
    }

    public static int encontrarMenor(List<Integer> numeros) {
        return numeros.stream()
                      .min(Integer::compareTo)
                      .orElse(0);
    }

    public static boolean todosSaoPares(List<Integer> numeros) {
        return numeros.stream()
                      .allMatch(numero -> numero % 2 == 0);
    }

    public static boolean algumEhPar(List<Integer> numeros) {
        return numeros.stream()
                      .anyMatch(numero -> numero % 2 == 0);
    }

    public static boolean nenhumMaiorQueDez(List<Integer> numeros) {
        return numeros.stream()
                      .noneMatch(numero -> numero > 10);
    }

    public static String coletarComoString(List<Integer> numeros) {
        return numeros.stream()
                      .map(String::valueOf)
                      .collect(Collectors.joining(" : "));
    }
}
