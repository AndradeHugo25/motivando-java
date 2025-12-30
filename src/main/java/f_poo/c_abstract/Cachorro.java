package f_poo.c_abstract;

public class Cachorro extends Animal {

    private String nome;
    private int idade;
    public static final String tipo = "CACHORRO";

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome + "... au au ...");
    }
}
