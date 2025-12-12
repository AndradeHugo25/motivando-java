package a_basico.Execicios_Feitos;

import java.util.Scanner;

public class ExercícioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoLata = 6.00;

        System.out.println("Bar do Cabelo, Digite o Valor Desejado:");
        String input = scanner.next();
        input = input.replace(",", ".");
        double pagamento = Double.parseDouble(input);
        // continuar pensar em uma forma de melhorar a lógica

        int quantidade = (int) (pagamento / precoLata);

        if (pagamento < precoLata) {
            System.out.println("Com o valor Informado, Tu Não Bebes Nada Aqui!");
        } else {
            double troco = pagamento % quantidade * precoLata;
            System.out.println("É possível comprar " + quantidade + " cervejas.");
            System.out.println("Teu Troco: R$ " + String.format("%.2f", troco));

        }

    }
}
