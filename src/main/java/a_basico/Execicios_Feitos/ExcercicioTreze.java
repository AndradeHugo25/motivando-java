package a_basico.Execicios_Feitos;

import java.util.Scanner;

public class ExcercicioTreze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olha pra janela e me diz como está? (sol, chovendo, nevando)");
        String clima = sc.nextLine().toLowerCase();

        System.out.println("O tutu caiu na tua conta? Responda com (sim/não)");
        String dinheiro = sc.nextLine().toLowerCase();

        System.out.println("Hugo o Seu Carro Esta quebrado novamente? Responda com (sim/não) ");
        String carro = sc.nextLine().toLowerCase();

        //regras das condições
        // a ordem das condições esta enfluenciando na respontas

        if (clima.equals("chovendo")) {
            System.out.println("Tu é feito de açucar, fica em casa");
        } else if (clima.equals("nevando")) {
            System.out.println("Com essa neve do rio de janeiro você só sai acompanhado");
        } else if (carro.equals("sim") && !clima.equals("chovendo") && !clima.equals("nevando")) {
            System.out.println("Você irá ao cinema de ônibus.");
        } else if (clima.equals("sol")) {
            System.out.println("Ja que deu sol vai viajar sozinho");
        } else if (dinheiro.equals("sim")) {
            System.out.println("Ainda bem que você esta com dinheiro, pode sair e completa o gas");
        }


    }

}

