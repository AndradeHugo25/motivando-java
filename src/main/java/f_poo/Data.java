package f_poo;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {

        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido!");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {

        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido!");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {

        if (ano > 0) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido!");
        }
    }

    public void imprimirData() {

        System.out.printf("%02d/%02d/%04d%n",
                dia,
                mes,
                ano);
    }

    public String quantoParaFimAno() {

        if (mes == 12) {

            int diasRestantes = 31 - dia;

            return "Faltam " + diasRestantes + " dias para o fim do ano.";
        }

        int mesesRestantes = 12 - mes;

        return "Faltam " + mesesRestantes + " meses para o fim do ano.";
    }
}