package h_bd.exercicios;

import h_bd.repository.AlbumRepository;
import h_bd.repository.ArtistaRepository;
import h_bd.repository.PlaylistRepository;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {

        ArtistaRepository artistaRepository = new ArtistaRepository();
        String nomeArtista = artistaRepository.selecionarNomeArtistaPorId(3);

        AlbumRepository albumRepository = new AlbumRepository();
        List<Map<String, Object>> album = albumRepository.selecionarAlbumPorArtistaId(3);

        System.out.println("\nO artista é: " + nomeArtista + "\n");
        System.out.println("Albuns do artista:" + nomeArtista + "\n");
        for (Map<String, Object> albums : album) {
            System.out.println(albums.get("nome"));
        }

        PlaylistRepository playlistRepository = new PlaylistRepository();
        List<Map<String, Object>> atualizarPlaylist = playlistRepository.atualizarPlaylist("playlist", "nome", "favoritas", "nome", "Minha playlist");

        System.out.println(atualizarPlaylist);
    }
}