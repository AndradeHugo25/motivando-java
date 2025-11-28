package f_oo.c_interface;

import lombok.Data;

@Data
public class Borboleta implements Animal {

    private String nome;
    private int idade;
    private Estagio estagio;

    private enum Estagio {
        LARVA, CASULO, BORBOLETA
    }

    public Borboleta(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.estagio = Estagio.LARVA;
    }

    @Override
    public void respirar() {
        System.out.println(this.estagio + " " + this.nome + " ... respirando ...");
    }

    @Override
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

    @Override
    public String emitirSom() {
        return this.estagio + " " + this.nome + " diz ... ...";
    }

    @Override
    public String toString() {
        String nome = getNome();
        if (nome == null) {
            nome = "Animal indefinido";
        }

        return "{nome = " + nome +
                ", tipo = Borboleta" +
                ", idade = " + getIdade() +
                ", estágio = " + this.estagio + "}";
    }
}
