package g_arquivos.Exercicios.exercicio41;

public class SaldoGolsTime {
    private int golFeito;
    private int golSofrido;

    public SaldoGolsTime(int golFeito, int golSofrido) {
        this.golFeito = golFeito;
        this.golSofrido = golSofrido;
    }

    public int getSaldoGols() {
        return golFeito - golSofrido;
    }
}
