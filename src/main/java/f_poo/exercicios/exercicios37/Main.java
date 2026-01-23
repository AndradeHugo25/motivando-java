import f_poo.exercicios.exercicios37.Funcionario;

public static void main(String[] args) {

    Funcionario funcionario1 = new Funcionario("Juliana", 15500, Funcionario.Categoria.INTEGRAL);
    Funcionario funcionario2 = new Funcionario("Helen", 10800.00, Funcionario.Categoria.MEIOPERIODO);
    Funcionario funcionario3 = new Funcionario("Pedro", 8750, Funcionario.Categoria.PJ);
    Funcionario funcionario4 = new Funcionario("Fellipe", 17000, Funcionario.Categoria.TEMPORARIO);

    System.out.println(funcionario1);
    System.out.println(funcionario2);
    System.out.println(funcionario3);
    System.out.println(funcionario4 + "\n");

    double calculoBonus1 = funcionario1.calculoBonus();
    System.out.printf("A funcionaria %s recebe de salário %s é contratado na categoria %s e vai receber de bônus R$%s%n", funcionario1.nomeFuncionario, funcionario1.salario, funcionario1.getCategoria(), calculoBonus1);

    double calculoBonus2 = funcionario2.calculoBonus();
    System.out.printf("A funcionaria %s recebe de salário %s é contratado na categoria %s e vai receber de bônus R$%s%n", funcionario2.nomeFuncionario, funcionario2.salario, funcionario2.getCategoria(), calculoBonus2);

    double calculoBonus3 = funcionario3.calculoBonus();
    System.out.printf("O funcionario %s recebe de salário %s é contratado na categoria %s e vai receber de bônus R$%s%n", funcionario3.nomeFuncionario, funcionario3.salario, funcionario3.getCategoria(), calculoBonus3);

    double calculoBonus4 = funcionario4.calculoBonus();
    System.out.printf("O funcionario %s recebe de salário %s é contratado na categoria %s e vai receber de bônus R$%s%n", funcionario4.nomeFuncionario, funcionario4.salario, funcionario4.getCategoria(), calculoBonus4);

}
