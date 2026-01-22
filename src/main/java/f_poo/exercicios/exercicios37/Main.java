import java.util.HashMap;
import java.util.List;
import java.util.Map;

public static void main(String[] args) {

//    O intellij sugeriu que o Double mudasse para D maiusculo, queria entender o porque
    Map<String, Double> nomes = new HashMap<>();
    nomes.put("Juliana", 4500.00);
    nomes.put("Hugo", 12000.00);
    nomes.put("Jeniffer",17000.00 );

    System.out.println(nomes);

    for (Map.Entry<String, Double> lista : nomes.entrySet()) {
        System.out.println("\nFuncionario | Salário: " + lista);
    }

//    Ele imprimi a lista mas não sei como colocar o tipo de bonus para cada um deles, pedir ajuda, vai virar uma matriz com 3 informações?
//    Pode ser que dando um add pra cada funcionario funcione mas não sei como juntar as opções
}
