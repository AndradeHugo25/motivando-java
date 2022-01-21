package f_oo;

public class Cabrito extends Animal {

    public Cabrito() {
    }

    public Cabrito(String nome, char sexo) {
        super(nome, sexo);
    }

    public void berrar() {
        System.out.println(getNome() + " diz: Béééééééé!!\n");
    }

}
