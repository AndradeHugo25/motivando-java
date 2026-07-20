package b_condicionais.Exercicios;

import java.util.Scanner;

public class Exercicio13Condicionais {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Como estará o tempo no fim de semana? (Sol, Chovendo, Nevando)");
        String clima = in.next();
        System.out.println("Você tem dinheiro para gasolina? (Sim/Não): ");
        String condicaoFinanceira = in.next().toLowerCase();
        System.out.println("O carro está quebrado? (Sim/Não): ");
        String condicaoCarro = in.next().toLowerCase();

        switch (clima.toLowerCase()) {
            case "chovendo":{
                System.out.println("Você ficará em casa.");
                break;}
            case "nevando": {
                if (condicaoFinanceira.equals("sim") && condicaoCarro.equals("não")) {
                    System.out.println("Você viajará acompanhado de carro.");
                } else if (condicaoFinanceira.equalsIgnoreCase("não") || condicaoCarro.equalsIgnoreCase("sim")) {
                    System.out.println("Você viajrá acompanhado sem carro");
                }
                break;
            }
            case "sol": {
                if (condicaoFinanceira.equals("sim") && condicaoCarro.equals("não")) {
                    System.out.println("Você viajará sozinho de carro.");
                } else if (condicaoFinanceira.equalsIgnoreCase("não") || condicaoCarro.equalsIgnoreCase("sim")) {
                    System.out.println("VocÊ viajará sozinho sem carro.");
                }
            }
        }
    }
}


