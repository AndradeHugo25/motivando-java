package a_basico;

public class Basico3Variaveis {

    public static void main(String[] args) {
        // declaração x inicialização; declaração múltipla ========================================
        int numero;
        numero = 10;

        int outro = 10;

        int a = 5, b = 15, c = 25;


        // linguagem fortemente tipada =========================================================
        int idade = 30;
        var nome = "Hugo";
        System.out.println(((Object) idade).getClass().getSimpleName());
        System.out.println(((Object) nome).getClass().getSimpleName() + "\n\n");


        // type cast ============================================================================
        double preco = 3.51;
        int arredondado = (int) preco;
        System.out.println("Casting explícito: " + arredondado);

        String numeroStr = "123";
        int valor = Integer.parseInt(numeroStr);
        System.out.println("Parsing: " + valor);

        String doubleStr = "4.55";
        double valorDouble = Double.parseDouble(doubleStr);
        System.out.println("Parsing: " + valorDouble);

        String textoNum = String.valueOf(arredondado);
        System.out.println("Conversão para String: " + textoNum + "\n\n");


        // final =================================================================================
        // final int IDADE;
        // IDADE = 12;
        // System.out.println("Idade: " + IDADE);
        // IDADE = 15; // erro de compilação

        // final int CONSTANTE = 100;
        // System.out.println("Valor constante: " + CONSTANTE);


        // manipulação de texto ==================================================================
        String texto = "  Quero testar uma string.  ";

        System.out.println("Texto original: " + texto + "\n");
        texto = texto.trim();
        System.out.println("Sem espaços: " + texto);

        System.out.println("Tamanho: " + texto.length());
        System.out.println("Maiúsculo: " + texto.toUpperCase());
        System.out.println("Minúsculo: " + texto.toLowerCase());
        System.out.println("Substring: " + texto.substring(0, 5));
        System.out.println("Contém 'testar': " + texto.contains("testar"));
        System.out.println("Começa com 'Quero': " + texto.startsWith("Quero"));
        System.out.println("Termina com '.': " + texto.endsWith("."));
        System.out.println("Troca palavra: " + texto.replace("string", "texto"));
        System.out.println("Caractere na posição 1: " + texto.charAt(1));
    }

}