package f_poo.c_abstract;

public abstract class Animal {

    private String nome;
    private int idade;

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
        this.idade = 0;
    }

    public void respirar() {
        System.out.println(this.nome + " ... respirando ...");
    }

    public abstract void emitirSom();

}
