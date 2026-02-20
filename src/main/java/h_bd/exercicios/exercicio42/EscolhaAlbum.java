package h_bd.exercicios.exercicio42;

import h_bd.repository.AlbumRepository;
import java.util.List;
import java.util.Map;

public class EscolhaAlbum {
    public static void main(String[] args){
        AlbumRepository albumRepository = new AlbumRepository();
        int artistaId = 3;
        List<Map<String, Object>> albuns = albumRepository.selecionarNomesAlbunsPorArtistaId(artistaId);

        System.out.println("Álbuns do artista com id " + artistaId + ":");
        for (Map<String, Object> album : albuns) {
            Object nome = album.get("nome");
            if (nome != null) {
                System.out.println(nome.toString());
            }
        }
    }
}
