package h_bd.runner;

import h_bd.repository.AlbumRepository;

import java.util.List;
import java.util.Map;

public class Exercicio42AlbunsLegiaoUrbana {

    public static void main(String[] args) {

        AlbumRepository albumRepository = new AlbumRepository();

        List<Map<String, Object>> albuns =
                albumRepository.selecionarAlbunsPorArtistaId(4);

        System.out.println("Álbuns do artista:\n");

        for (Map<String, Object> album : albuns) {
            System.out.println(album.get("nome"));
        }
    }
}