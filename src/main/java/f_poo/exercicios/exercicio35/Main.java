package f_poo.exercicios.exercicio35;

public class Main {
    public static void main(String[] args) {
        NotaFiscal nota1 = new NotaFiscal(1, "corrente", 15, 98.50);
        NotaFiscal nota2 = new NotaFiscal(2, "roda", 4, 200);
        NotaFiscal nota3 = new NotaFiscal(3, "espelho", 2, 50.99);

        System.out.println(nota1.getTotalNota());
        System.out.println(nota2.getTotalNota());
        System.out.println(nota3.getTotalNota());

    }
}
