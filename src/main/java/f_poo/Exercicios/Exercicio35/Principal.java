package f_poo.Exercicios.Exercicio35;

public class Principal {
    public static  void main(String[] args){
        NotaFiscal nf1 = new NotaFiscal(1, "Parafuso", 10, 0.50);
        NotaFiscal nf2 = new NotaFiscal(2, "Porca", 5, 0.30);
        NotaFiscal nf3 = new NotaFiscal(3, "Arruela", 20, 0.10);

        double totalCompra = nf1.getTotalNota() + nf2.getTotalNota() + nf3.getTotalNota();

        System.out.println("Total da compra: R$ " + totalCompra);

    }
}
