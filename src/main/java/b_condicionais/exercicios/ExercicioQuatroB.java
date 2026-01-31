package b_condicionais.exercicios;

import java.util.Scanner;

public class ExercicioQuatroB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira seu nome");
        String nome = in.nextLine();
        nome = nome.trim(); // retirando os espaços antes e depois do texto

        if (nome.contains(" ")){ //se contem espaço entre dois caracteres, é composto
            System.out.println("Seu nome é composto.");
        } else if (!nome.contains(" ") && !nome.isEmpty()){ // se nao tem espaço e não é vazio então é valido e nao composto
            // nessa condição eu ignorei o (nome != null) pois vi que .nextLine() não retorna null em condições normais
            System.out.println("Seu nome não é composto");
        } else { // qualquer outra condição, é invalido
            System.out.println("Insira um nome válido.");
        }
    }
}

/* Escreva um programa que faça a validação do nome fornecido pelo usuário, seguindo as regras abaixo:
Se o nome não for nulo
Se o nome não for uma String vazia
Se o nome possui mais de uma palavra

Dica metodo .contains()

Exemplo 1:
Digite seu nome:
João
Seu nome não é composto


Exemplo 2:
Digite seu nome:
João Gabriel
Seu nome é composto */