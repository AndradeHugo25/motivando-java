package b_condicionais;

public class Condicionais5Switch {

    public static void main(String[] args) {
        String diaSemana = "quarta";

        switch (diaSemana.toLowerCase()) {
            case "segunda" -> System.out.println("Hoje é segunda-feira.");
            case "terça" -> System.out.println("Hoje é terça-feira.");
            case "quarta" -> System.out.println("Hoje é quarta-feira.");
            case "quinta" -> System.out.println("Hoje é quinta-feira.");
            case "sexta" -> System.out.println("Hoje é sexta-feira.");
            case "sábado" -> System.out.println("Hoje é sábado.");
            case "domingo" -> System.out.println("Hoje é domingo.");
            default -> System.out.println("Dia inválido.");
        }
    }
}
