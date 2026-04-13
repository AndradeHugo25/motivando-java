package h_bd.exercicio42;

import h_bd.repository.AlbumRepository;
import h_bd.repository.ArtistaRepository;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        ArtistaRepository artistaRepository = new ArtistaRepository();
        List<Map<String, Object>> artistasAll = artistaRepository.selecionarTodosArtistas();

        String nome = "Djavan1";
        int idArtista = 0;
        boolean nomeExiste = false;

        try{
            for (Map<String, Object> aux : artistasAll) {
                if (aux.values().toArray()[1].equals(nome)){
                    idArtista = Integer.parseInt(aux.values().toArray()[0].toString());
                    System.out.println("\nId do Djavan é " + idArtista + "\n");
                    nomeExiste = true;
                    break;
                }
            }

            if (!nomeExiste){
                throw new NoSuchElementException("\nNOME NÃO EXISTE!");
            }

            AlbumRepository albumRepository = new AlbumRepository();
            List<Map<String, Object>> albuns = albumRepository.selecionarAlbumPorArtistaId(idArtista);

            if (albuns.size() == 1){
                System.out.println("\n\nO album do Djavan é: ");
                albuns.stream().forEach(n -> System.out.println(n.values().toArray()[1]));
            } else {
                System.out.println("\n\nOs albuns do Djavan são: ");
                albuns.stream().forEach(n -> System.out.println(n.values().toArray()[1]));
            }

        } catch (NoSuchElementException erroNomeNaoExiste){
            System.out.println(erroNomeNaoExiste.getMessage());
            throw new NoSuchElementException();
        }
    }
}
