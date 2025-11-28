package f_oo.b_abstract;

public class Gato extends Animal {

    private String nome;
    private int idade;

    public Gato(String nome) {
        this.nome = nome;
        this.idade = 0;
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome + " ... miau miau ...");
    }
}
