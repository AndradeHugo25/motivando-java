package f_poo.g_exercicios.exercicio39;

import java.util.InputMismatchException;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data (int dia, int mes, int ano) {
        try {
            if (dia < 1 || dia > 31){
                throw new InputMismatchException("Dia inválido: " + dia);
            }
            if (mes < 1 || mes > 12){
                throw new InputMismatchException("Mes invalido: " + mes);
            }
            if (ano < 1){
                throw new InputMismatchException("Ano inválido: " + ano);
            }
            this.ano = ano;
            this.dia = dia;
            this.mes = mes;

        } catch (InputMismatchException erroDataInvalida) {
            throw new RuntimeException(erroDataInvalida);
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimirData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    public String quantoParaFimAno(){
        if (this.mes == 12){
            return "Falta(m) " + (31 - this.dia) + " dia(s) para o fim do ano!";
        } else {
            return "Falta(m) " + (12 - this.mes) + " mes(es) para o fim do ano.";
        }
    }
}
