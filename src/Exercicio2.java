/*Exercicio 2
Patricia Ellen Silva Specht
Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
 */

void main() {
    Scanner sc = new Scanner(System.in);
    IO.print("Digite um número: ");
    int numero = sc.nextInt();
    int antecessor = numero - 1;
    int sucessor = numero + 1;
    IO.println("O antecessor de " + numero + " é " + antecessor + " e o sucessor é " + sucessor);
}
