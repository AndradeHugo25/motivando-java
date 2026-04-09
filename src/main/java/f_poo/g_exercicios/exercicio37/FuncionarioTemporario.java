package f_poo.g_exercicios.exercicio37;

public class FuncionarioTemporario extends FuncionarioMeioPeriodo {

    private int diasTrabalhados;

    public FuncionarioTemporario(String nome, double salario, int diasTrabalhados){
        super(nome, salario);
        this.diasTrabalhados = diasTrabalhados;
    }

    public double calcularPagamento(int dias){
        double salario = super.getSalario();
        return salario * dias;
    }

    @Override
    public double calcularBonus() {
        return 0;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    @Override
    public void printarInfo(){
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Nome do funcionario: " + super.getNome());
        System.out.println("Salario do funcionario por dia: " + super.getSalario());
        System.out.println("Pagamento por " + this.getDiasTrabalhados() + " dias: " + this.calcularPagamento(this.getDiasTrabalhados()));
        System.out.println("Sem Bonus!");
        System.out.println("----------------------------------------------");
    }
}
