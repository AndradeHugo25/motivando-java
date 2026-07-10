package d_ed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio28QuemVaiDividirAConta {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<String> pessoas = new ArrayList<>();

        System.out.println("Digite os nomes das pessoas que beberam cerveja:");

        for (int i = 1; i <= 4; i++) {
            System.out.println("Nome " + i + ":");
            pessoas.add(in.nextLine());
        }

        System.out.println("Lista original:");
        pessoas.forEach(System.out::println);

        pessoas.add("Aline");

        System.out.println("Nova lista:");
        pessoas.forEach(System.out::println);

        in.close();
    }
}