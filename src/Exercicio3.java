/*Exercicio 3
Patricia Ellen Silva Specht
Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela sua média na disciplina.
 */

void main() {
    Scanner sc = new Scanner(System.in);
    IO.print("Nota 1: ");
    double nota1 = sc.nextDouble();
    IO.print("Nota 2: ");
    double nota2 = sc.nextDouble();
    double media = (nota1 + nota2) / 2;
    IO.println("A média do aluno é " + media);
}
