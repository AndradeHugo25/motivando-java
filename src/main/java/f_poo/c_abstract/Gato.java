package f_poo.c_abstract;

public class Gato extends Animal {

    private String nome;
    private int idade;

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome + " ... miau miau ...");
    }
}
