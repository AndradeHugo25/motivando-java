package h_exercicios;

import java.util.Scanner;

public class ExerciciosCondicionais13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a previsão do tempo");
        System.out.println("Digite se tem gasolina");
        System.out.println("Digite se tem carro");
        String previsao = in.next();
        boolean temGasolina = true;
        boolean temCarro = false;

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
