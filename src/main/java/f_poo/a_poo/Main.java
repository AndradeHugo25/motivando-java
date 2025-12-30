package f_poo.a_poo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        //====================================================================================
//        Cabrito cabritao = new Cabrito("Buzz", 'M');
//        cabritao.respirar();
//        cabritao.berrar();
//
//        cabritao.setNome("Tiago");
//        cabritao.respirar();
//        cabritao.berrar();
//
//        System.out.println("O sexo do cabrito " + cabritao.getNome() + " é: " + cabritao.getSexo());

        //=====================================================================================
//        Borboleta b1 = new Borboleta("Caterpie do Ash", 'F');
//        Borboleta b2 = new Borboleta("Metapod do Ash", 'F');
//        Borboleta b3 = new Borboleta("Butterfree do Ash", 'F');
//
//        ArrayList<Borboleta> borboletas = new ArrayList<>();
//        borboletas.add(b1);
//        borboletas.add(b2);
//        borboletas.add(b3);
//
//        imprimirBorboletas(borboletas);
//
//        System.out.println("\n============================Simulando passagem de tempo=========================\n");
//
//        b2.incrementarIdade();
//        b3.incrementarIdade(3);
//
//        imprimirBorboletas(borboletas);
//
//        System.out.println();
//        b1.voar();
//        b2.voar();
//        b3.voar();
    }

    public static void imprimirBorboletas(ArrayList<Borboleta> brabuletas) {
        for (Borboleta atual : brabuletas) {
            System.out.println(atual);
        }
    }
}
