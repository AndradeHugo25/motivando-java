package d_ed.Exercicios;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Exercicio25ED {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};
        int[] numerosDobrado = new int[numeros.length];

        System.out.print("Vetor Fixo: {");
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0){
                System.out.print(numeros[i]);
            } else {
                System.out.print(", " + numeros[i]);
            }
        }
        System.out.println("}");

        for (int i = 0; i < numeros.length; i++) {
            numerosDobrado[i] = numeros[i] * 2;
        }

        System.out.print("Vetor Dobrado: { ");
        for (int i = 0; i < numerosDobrado.length; i++) {
            if (i == 0){
                System.out.print(numerosDobrado[i]);
            }else {
                System.out.print(", " + numerosDobrado[i]);
            }
        }
        System.out.println("}");
    }
}
