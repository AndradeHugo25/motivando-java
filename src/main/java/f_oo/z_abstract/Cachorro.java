package f_oo.z_abstract;

import lombok.Data;

@Data
public class Cachorro extends Animal {

    private String nome;
    private int idade;
    public static final String tipo = "CACHORRO";

    public Cachorro(String nome) {
        this.nome = nome;
        this.idade = 0;
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome + "... au au ...");
    }
}
