package c_repeticao.Exercicios;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exercicio20Repeticao {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nome = "";

        while (true) {
            System.out.println("Digite seu nome completo ou escreva 'Cancelar' para sair): ");
            nome = in.nextLine();

            if (nome.equalsIgnoreCase("Cancelar")) {
                System.exit(0);
            }

            boolean tamanhoValido = nome.length() >= 5 && nome.length() <= 50;
            boolean contemNumero = nome.matches(".*\\d.*");

            if (!tamanhoValido && contemNumero) {
                System.out.println("Nome inválido!\n- Deve conter de 5 a 50 caracteres\n- Não pode conter números");
            } else if (!tamanhoValido) {
                System.out.println("Nome inválido!\n- Deve conter de 5 a 50 caracteres\n");
            } else if (contemNumero) {
                System.out.println("Nome inválido!\n- Não pode conter números");
            }
             else {
            System.out.println("Nome válido informado: " + nome);
                System.exit(0);
            }
        }
    }
}