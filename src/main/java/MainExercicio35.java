/*mainExercicio35*/

public class MainExercicio35 {

    public static void main(String[] args) {
        System.out.println("NOTA FISCAL");

        Exercicio35 nota1 = new Exercicio35(
                1001, "Filtro de Óleo", 2, 35.50);

        Exercicio35 nota2 = new Exercicio35(

                1002, "Pastilha de Freio", 1, 120.00);

        Exercicio35 nota3 = new Exercicio35(

                1003, "Vela de Ignição", 4, 18.90);

        double totalCompra =

                nota1.getTotalNota() +

                        nota2.getTotalNota() +

                        nota3.getTotalNota();
        System.out.println("Total da compra: R$ "

                + String.format("%.2f", totalCompra));
    }
}
