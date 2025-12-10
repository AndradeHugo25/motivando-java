package h_exercicios;

import java.util.Scanner;

public class ExerciciosCondicionais13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a previsão do tempo:");
        String previsao = in.nextLine();

        System.out.println("Digite true ou false se tem gasolina:");
        boolean temGasolina = in.nextBoolean() ;

        System.out.println("Digite true ou false se o carro está bom:");
        boolean temCarro = in.nextBoolean();

// Validar se pode fazer em Switch

        if (previsao == "sol" && temGasolina && temCarro ) {
            System.out.println("Viajará sozinho");
        } else if (previsao == "chuva") {
            System.out.println("Ficará em casa");
        } else if (previsao == "nevando" && temGasolina == true) {
            System.out.println("Viajará acompanhado");
        } else if (previsao == "sol" && temGasolina == true && temCarro == false) {
            System.out.println("Vai ao cinema de ônibus");
        } else {
            System.out.println("só pode sair se tiver dinheiro pra gasolina");
        }
    }
}
