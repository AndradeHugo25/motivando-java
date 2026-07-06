/*Exercicio 1
Patricia Ellen Silva Specht
Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas:
 */

import java.util.Scanner;

public class Exercicio1 {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o seu nome?: ");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + ", seja bem-vindo!");
    }
}