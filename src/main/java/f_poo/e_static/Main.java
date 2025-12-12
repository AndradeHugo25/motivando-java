package f_poo.e_static;

public class Main {

    public static void main(String[] args) {
        Elefante.mostrarPopulacao();

        Elefante dumbo = new Elefante("Dumbo");
        dumbo.apresentar();

        Elefante.mostrarPopulacao();

        Elefante jotalhao = new Elefante("Jotalhão");
        jotalhao.apresentar();

        Elefante.mostrarPopulacao();
    }
}
