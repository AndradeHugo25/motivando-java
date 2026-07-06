/*Exercicio 4
Patricia Ellen Silva Specht
Faça um programa que leia a quantia em dinheiro que uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar.
Considere US$1,00 = R$5,34.
 */

import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantia em R$: ");
    double quantia = sc.nextDouble();
    double cotacao = 5.34;
    double conversao = quantia / cotacao;
    System.out.println("Você pode comprar US$" + String.format("%.2f", conversao));
}
