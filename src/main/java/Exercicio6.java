/*Exercicio 6
Patricia Ellen Silva Specht
Agora faça um programa que imprima o troco para cada nota apresentada na questão anterior.

Obs.: Não é permitido utilizar a operação de subtração.
*/

import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Leia a cédula: ");
    double cedula = sc.nextDouble();
    double cerveja = 6.00;
    double troco = cedula % cerveja;
    System.out.println("Seu troco é R$ " + String.format("%.2f", troco));
    System.out.println("Volte sempre!!! E lembre-se: Se beber não dirija!");
}