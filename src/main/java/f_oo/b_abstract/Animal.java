package f_oo.b_abstract;

public abstract class Animal {

    private String nome;
    private int idade = 3;

    public void respirar() {
        System.out.println(this.nome + " ... respirando ...");
    }

    public abstract void emitirSom();

}
