package f_poo.f_enum;

public class MainEnumSimples {

    public enum DiaSemana {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        System.out.println("Todos os dias da semana:");
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.print(dia + " ");
        }

        DiaSemana melhorDia = DiaSemana.SEXTA;
        System.out.println("\n\nMelhor dia da semana: " + melhorDia);
    }
}
