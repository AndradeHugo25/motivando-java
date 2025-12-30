/*Exercicio 4
Patricia Ellen Silva Specht
Faça um programa que leia a quantia em dinheiro que uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar.
Considere US$1,00 = R$5,34.
 */

void main() {
    Scanner sc = new Scanner(System.in);
    IO.print("Quantia em R$: ");
    double quantia = sc.nextDouble();
    double cotacao = 5.34;
    double conversao = quantia / cotacao;
    IO.println("Você pode comprar US$" + String.format("%.2f", conversao));
}
