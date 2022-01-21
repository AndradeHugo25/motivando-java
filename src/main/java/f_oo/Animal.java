package f_oo;

public class Animal {

    private String nome;
    private char sexo;
    private int idade;

    public Animal() {
    }

    public Animal(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = 0;
    }

    public void respirar() {
        if (this.nome == null) {
            System.out.println("Animal indefinido ... respirando ...\n");
        } else {
            System.out.println(this.nome + " ... respirando ...\n");
        }
    }

    public void incrementarIdade() {
        this.idade++;
    }

    public void incrementarIdade(int qtdAnos) {
        this.idade += qtdAnos;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", idade=" + idade +
                '}';
    }
}
