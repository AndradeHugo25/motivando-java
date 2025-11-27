package c_repeticao;

import java.util.Scanner;

public class RepeticaoApoio {

    public static boolean estaChovendo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Está chovendo? (s/n)");
        return sc.next().equalsIgnoreCase("s");
    }
}
