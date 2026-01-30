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

        System.out.println("\nÁlbuns do artista: " + nomeArtista);
        for (Map<String, Object> albums : album) {
            System.out.println("\t" + albums.get("nome"));
        }

        System.out.println();

        PlaylistRepository playlistRepository = new PlaylistRepository();
        System.out.println("\nPlaylist original: " + playlistRepository.selecionarPlaylist(3));

        String novaPlaylist = gerarNovaPlaylist(playlistRepository);
        playlistRepository.atualizarPlaylist("id", 3, "nome", novaPlaylist);
        System.out.println("\nPlaylist alterada: " + playlistRepository.selecionarPlaylist(3));
    }

    private static String gerarNovaPlaylist(PlaylistRepository playlistRepository) {
        String playlistAtual = playlistRepository.selecionarPlaylist(3);
        String[] splitado = playlistAtual.split(" ");

        int valorIndex = Integer.parseInt(splitado[2]);
        int novoIndex = valorIndex + 1;

        return playlistAtual.replace(String.valueOf(valorIndex), String.valueOf(novoIndex));
    }
}