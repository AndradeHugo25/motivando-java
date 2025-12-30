package f_poo.a_poo;

public class Borboleta {

    private String nome;
    private char sexo;
    private int idade;
    private Estagio estagio;

    private enum Estagio {
        LARVA, CASULO, BORBOLETA
    }

    public Borboleta() {
    }

    public Borboleta(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = 0;
        this.estagio = Estagio.LARVA;
    }

    public void incrementarIdade() {
        this.idade++;
        mudarEstagio();
    }

    public void incrementarIdade(int qtdAnos) {
        this.idade += qtdAnos;
        mudarEstagio();
    }

    private void mudarEstagio() {
        if (this.getIdade() >= 3) {
            this.estagio = Estagio.BORBOLETA;
        } else if (this.getIdade() >= 1) {
            this.estagio = Estagio.CASULO;
        }
    }

    public void voar() throws Exception {
        if (this.estagio == Estagio.BORBOLETA) {
            System.out.println(getNome() + " ... voando ...\n");
        } else {
            throw new Exception("Que pena! Mas " + getNome() + " ainda está no estágio "
                    + this.estagio + " e não pode voar!\n");
        }
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

    public Estagio getEstagio() {
        return estagio;
    }

    public void setEstagio(Estagio estagio) {
        this.estagio = estagio;
    }

    public String toString() {
        String nome = getNome();
        if (nome == null) {
            nome = "Animal indefinido";
        }

        return "{nome = " + nome +
                ", tipo = Borboleta" +
                ", sexo = " + getSexo() +
                ", idade = " + getIdade() +
                ", estágio = " + this.estagio + "}";
    }
}
