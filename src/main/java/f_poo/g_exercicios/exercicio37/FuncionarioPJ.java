package f_poo.g_exercicios.exercicio37;

public class FuncionarioPJ extends FuncionarioMeioPeriodo {
    private String cnpj;


    public FuncionarioPJ (String nome, double salario, String cnpj) {
        super(nome,salario);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularBonus() {
        double salario = super.getSalario();
        return salario * 0.02;
    }

    @Override
    public void printarInfo(){
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Nome do funcionario: " + super.getNome());
        System.out.println("Salario do funcionario: " + super.getSalario());
        System.out.println("CNPJ: " + this.getCnpj());
        System.out.println("Bonus do funcionario: " + this.calcularBonus());
        System.out.println("----------------------------------------------");
    }
}
