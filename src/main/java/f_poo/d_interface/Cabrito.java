package f_poo.d_interface;

import lombok.Data;

@Data
public class Cabrito implements Animal {

    private String nome;
    private int idade;

    public Cabrito(String nome) {
        this.nome = nome;
        this.idade = 0;
    }

    @Override
    public void respirar() {
        System.out.println("Cabrito " + this.nome + " ... respirando ...");
    }

    @Override
    public void incrementarIdade(int qtdAnos) {
        this.idade += qtdAnos;
    }

    @Override
    public String emitirSom() {
        return "Cabrito " + this.nome + " diz ... bééééééééé´...";
    }

}
