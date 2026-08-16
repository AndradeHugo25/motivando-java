/*Exercicio39*/

import java.util.Scanner;

public class MainExercicio39 {

    public static void main(String[] args) {
        System.out.println("FIM DE ANO");

        Scanner sc = new Scanner(System.in);

        Data data = new Data();

        System.out.print("Digite o dia: ");
        data.setDia(sc.nextInt());

        System.out.print("Digite o mês: ");
        data.setMes(sc.nextInt());

        System.out.print("Digite o ano: ");
        data.setAno(sc.nextInt());

        System.out.println();

        System.out.println("Data informada:");
        data.imprimirData();

        data.quantoParaFimAno();

        sc.close();
    }
}
