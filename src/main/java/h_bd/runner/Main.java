package h_bd.runner;

import h_bd.repository.ArtistaRepository;
import h_bd.repository.MusicaRepository;
import h_bd.repository.AlbumRepository;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {

        ArtistaRepository artistaRepository = new ArtistaRepository();
        String nomeArtista = artistaRepository.selecionarNomeArtistaPorId(3);

        AlbumRepository repository = new AlbumRepository();


        int idLegiaoUrbana = 3;

        List<Map<String, Object>> albuns =
                repository.selecionarAlbunsPorArtistaId(idLegiaoUrbana);

        System.out.println("Álbuns do Legião Urbana:");

        for (Map<String, Object> album : albuns) {
            System.out.println(album.get("nome"));
        }
        System.out.println("\nO artista é: " + nomeArtista + "\n");


        MusicaRepository musicaRepository = new MusicaRepository();
        List<Map<String, Object>> musicas = musicaRepository.selecionarMusicasPorAlbumId(4);

        System.out.println("Músicas do álbum de id = 4:\n");
        for (Map<String, Object> musica : musicas) {
            System.out.println(musica.get("nome"));
        }
    }

}
