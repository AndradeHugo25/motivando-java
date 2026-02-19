package h_bd.exercicios.exercicio42;

import h_bd.repository.AlbumRepository;
import java.util.List;

public class EscolhaAlbum {
    public static void main(String[] args){
        AlbumRepository albumRepository = new AlbumRepository();
        int artistaId = 4;
        List<String> nomesAlbuns = albumRepository.selecionarNomesAlbunsPorArtistaId(artistaId);

        System.out.println("Álbuns do artista com id " + artistaId + ":");
        for (String nomeAlbum : nomesAlbuns) {
            System.out.println(nomeAlbum);
        }
    }
}
