package f_poo.exercicios.exercicios35;

public class Main {

    public static void main(String[] args) throws Exception {
        NotaFiscal notafiscal1 = new NotaFiscal("Martelo", 1234, 3, 18.50);
        notafiscal1.setPrecoUnitario(25.02);
        notafiscal1.setQtdpeca(4);

        NotaFiscal notafiscal2 = new NotaFiscal("Tesoura", 2345, 10, 5.90);

        NotaFiscal notafiscal3 = new NotaFiscal("Alicate", 3456, 6, 24.80);
        notafiscal3.setQtdpeca(10);

        double valorTotal = notafiscal1.getTotalNota();
        System.out.println("Produto " + notafiscal1.produto + " - Valor total gasto: " + valorTotal + "\n");

        double valorTotal2 = notafiscal2.getTotalNota();
        System.out.println("Produto " + notafiscal2.produto + " - Valor total gasto: " + valorTotal2 + "\n");

        double valorTotal3 = notafiscal3.getTotalNota();
        System.out.println("Produto " + notafiscal3.produto + " - Valor total gasto: " + valorTotal3 + "\n");

        System.out.println("O Valor total das notas é " + (valorTotal + valorTotal2 + valorTotal3));
    }
}
