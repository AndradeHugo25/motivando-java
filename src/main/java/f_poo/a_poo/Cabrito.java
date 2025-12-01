package f_poo.a_poo;

public class Cabrito {

    private String nome;
    private char sexo;

    public Cabrito() {
    }

    public Cabrito(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public void respirar() {
        System.out.println(this.nome + " ... respirando ...\n");
    }

    public void berrar() {
        System.out.println(this.nome + ": Béééééééé!!\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
