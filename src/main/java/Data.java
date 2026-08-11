/*Exercicio39*/

public class Data {

    private int dia;
    private int mes;
    private int ano;

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
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public void quantoParaFimAno() {

        if (mes == 12) {

            int diasRestantes = 31 - dia;

            System.out.println(
                    "Faltam " + diasRestantes +
                            " dias para o fim do ano."
            );

        } else {

            int mesesRestantes = 12 - mes;

            System.out.println(
                    "Faltam " + mesesRestantes +
                            " meses para o fim do ano."
            );
        }
    }
}
