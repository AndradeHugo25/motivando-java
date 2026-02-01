package c_repeticao.execicios;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero interio ");
        int numero = sc.nextInt();

        if (numero == 0){
            System.out.println("O numero digitado tem 1 dígito");
            return;
        }
        if (numero < 0){
            numero = -numero;
        }
        int contador = 0;

        while (numero > 0){
            numero = numero /10;
            contador++;
        }
        System.out.print("O número digitado possui " + contador +  " dígitos");

    }


}
