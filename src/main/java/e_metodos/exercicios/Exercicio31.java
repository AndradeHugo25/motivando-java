package e_metodos.exercicios;

public class Exercicio31 {
    public static void main(String[] args) {

        //metodos
        double media = temperaturaMedia(20.5, 30.0);
        System.out.println("Média das Temperaturas: " + media);

        int resultado = calcularPontuacaoFinal(20, 10, 10);
        System.out.println("Soma dos pontos no jogo: " + resultado);

        int pontuacaoFinal = 180;
        String resultadoFinal = avaliarPontuacao(pontuacaoFinal);
        System.out.println("resultado da avaliação: " +resultadoFinal);


    }

    public static double temperaturaMedia(double temp1, double temp2) {
        return (temp1 + temp2) / 2;
    }

    //para praticar com outro tipods de dados
    public static int calcularPontuacaoFinal(int tempo1, int tempo2, int tempo3){
        return (tempo1 + tempo2 +tempo3);
    }
    public static String avaliarPontuacao(int pontos){
        if(pontos >= 200){
            return "Execelente";
        } else if (pontos >= 100){
            return "Bom Desempenho";
        }else {
            return "Precisa melhorar";
        }
    }

}
