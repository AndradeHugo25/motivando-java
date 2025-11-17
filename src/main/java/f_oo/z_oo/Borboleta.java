package f_oo.z_oo;

public class Borboleta extends Animal {

    private Estagio estagio;

    private enum Estagio {
        LARVA, CASULO, BORBOLETA
    }

    public Borboleta() {
    }

    public Borboleta(String nome, char sexo) {
        super(nome, sexo);
        this.estagio = Estagio.LARVA;
    }

    public void incrementarIdade() {
        super.incrementarIdade();
        mudarEstagio();
    }

    public void incrementarIdade(int anos) {
        super.incrementarIdade(anos);
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

    public Estagio getEstagio() {
        return estagio;
    }

    @Override
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
