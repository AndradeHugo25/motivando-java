package f_poo;

public class Exercicio35NotaFiscal {

    public static void main(String[] args) {

        NotaFiscal nota1 = new NotaFiscal(
                1,
                "Filtro de Óleo",
                2,
                35.50);

        NotaFiscal nota2 = new NotaFiscal(
                2,
                "Pastilha de Freio",
                1,
                120.00);

        NotaFiscal nota3 = new NotaFiscal(
                3,
                "Vela de Ignição",
                4,
                18.00);

        double totalCompra =
                nota1.getTotalNota()
                        + nota2.getTotalNota()
                        + nota3.getTotalNota();

        System.out.println("Total da compra: R$ " + totalCompra);
    }
}