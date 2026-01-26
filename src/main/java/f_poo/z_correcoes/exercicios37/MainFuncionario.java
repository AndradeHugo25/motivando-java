package f_poo.z_correcoes.exercicios37;

public class MainFuncionario {
    public static void main(String[] args) {
        Integral funcionario1 = new Integral("Juliana", 15500);
        MeioPeriodo funcionario2 = new MeioPeriodo("Helen", 10800.00);
        PJ funcionario3 = new PJ("Pedro", 8750);
        Temporario funcionario4 = new Temporario("Fellipe", 17000);

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
    }
}

