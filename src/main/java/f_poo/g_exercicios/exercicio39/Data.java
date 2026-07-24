package f_poo.g_exercicios.exercicio39;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    // Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // Setters com validação
    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido! Deve estar entre 1 e 31.");
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido! Deve estar entre 1 e 12.");
        }
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido! Deve ser maior que zero.");
        }
    }

    public void imprimirData() {
        System.out.printf("%02d/%02d/%04d%n", dia, mes, ano);
    }

    public void quantoParaFimAno() {

        if (mes == 12) {
            System.out.println("Faltam " + (31 - dia) + " dias para o fim do ano.");
        } else {
            System.out.println("Faltam " + (12 - mes) + " meses para o fim do ano.");
        }
    }
}
