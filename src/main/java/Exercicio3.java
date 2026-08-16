/*Exercicio 3
Patricia Ellen Silva Specht
Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela sua média na disciplina.
 */

import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nota 1: ");
    double nota1 = sc.nextDouble();
    System.out.println("Nota 2: ");
    double nota2 = sc.nextDouble();
    double media = (nota1 + nota2) / 2;
    System.out.println("A média do aluno é " + media);
}
