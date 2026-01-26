package f_poo.z_exercicios.exercicios39;

public class Data {

    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public int getDia(int dia) {
        return dia;
    }

    public int getMes(int mes) {
        return mes;
    }

    public int getAno(int ano) {
        return ano;
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido: deve estar entre 1 e 31.");
        }
        this.dia = dia;
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido: deve estar entre 1 e 12.");
        }
        this.mes = mes;

    }

    public void setAno(int ano) {
        if (ano <= 0) {
            throw new IllegalArgumentException("Ano inválido: deve ser maior que zero.");
        }
        this.ano = ano;
    }

    //Não fiz tratamento para fevereiro que não possui mais de 29 dias
    String imprimirData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String quantoParaFimAno() {
        if (mes == 12) {
            int faltamDias = 31 - dia;
            return faltamDias + (faltamDias == 1 ? " dia" : " dias");
        } else {
            int faltamMeses = 12 - mes;
            return faltamMeses + (faltamMeses == 1 ? " mês" : " meses");
        }

    }
}
