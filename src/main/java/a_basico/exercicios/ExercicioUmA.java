package a_basico.exercicios;

import java.util.Scanner;

public class ExercicioUmA {
    public static void main(String[] args){
//        Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas:
//
//
//        Exemplo:
//        Qual é o seu nome?
//                João da Silva
//        Olá João da Silva, seja bem-vindo!
        Scanner in = new Scanner(System.in);
        System.out.println("Qual é o seu nome, caro usuário?");
        String nome = in.nextLine(); //roubei perguntando ao GPT pois tinha colocado apenas .next() e coloquei "Eduardo Barros" como entrada, e só pegou "Eduardo", mas entendi o motivo.
        System.out.println("Olá " + nome + ", seja bem-vindo!");
    }
}
