package f_poo.g_exercicios.exercicio35;

public class Exercicio35Poo {
    public static void main(String[] args) {

        NotaFiscal nota1 = new NotaFiscal(101, "Pastilha de Freio", 2, 150.00);
        NotaFiscal nota2 = new NotaFiscal(102, "Filtro de Óleo", 3, 35.50);
        NotaFiscal nota3 = new NotaFiscal(103, "Amortecedor", 1, 450.00);

        double totalCompra =
                nota1.getTotalNota() +
                        nota2.getTotalNota() +
                        nota3.getTotalNota();

        System.out.println(nota1.toString() + "\nValor total da Nota: R$ " + nota1.getTotalNota());
        System.out.println(nota2.toString() + "\nValor total da Nota: R$ " + nota2.getTotalNota());
        System.out.println(nota3.toString() + "\nValor total da Nota: R$ " + nota3.getTotalNota());
        System.out.println("\nValor total da compra: R$ " + totalCompra);
    }
}
