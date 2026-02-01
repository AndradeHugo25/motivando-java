package e_metodos.exercicios;

import org.apache.poi.hssf.record.PageBreakRecord;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeUsuario;

        while (true){
            try {
                System.out.println("Digite sua idade: ");
                idadeUsuario = sc.nextInt();
                if (idadeUsuario >= 0 && idadeUsuario < 120) {
                    break;
                }else{
                    System.out.println("Idade Invalida Tente Novamente: ");
                }
            }catch (Exception e){
                System.out.println("Idade Invalida Tente Novamente: ");
                sc.nextLine();
            }
        }

        String validacaoIdade = idadeInvalida(idadeUsuario);
        System.out.println("Status da Conta: " + validacaoIdade);
    }

    public static String idadeInvalida(int idade) {
        if (idade >= 0 && idade < 120) {
            return "Idade Válida";
        } else {
            return "Idade Inválida";
        }
    }
}
