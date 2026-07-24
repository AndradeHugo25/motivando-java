package h_bd.runner;

import h_bd.repository.AlbumRepository;
import h_bd.repository.ArtistaRepository;

import java.util.List;
import java.util.Map;

public class Exercicio42Arquivos {
    public static void main(String[] args) {
        ArtistaRepository artistaRepository = new ArtistaRepository();
        AlbumRepository albumRepository = new AlbumRepository();
        int idLegiaoUrbana = -1;

        for (int id = 1; id <= 100; id++) {
            try {
                String nome = artistaRepository.selecionarNomeArtistaPorId(id);
                if (nome.equals("Legião Urbana")) {
                    idLegiaoUrbana = id;
                    break;
                }
            } catch (Exception e) {
            }
        }
            if (idLegiaoUrbana == -1) {
                System.out.println("Artista 'Legião Urbana' não encontrado.");
                return;
            }

            List<Map<String, Object>> albuns =
                    albumRepository.selecionarAlbunsPorArtistaId(idLegiaoUrbana);
            System.out.println("Álbuns do Legião Urbana:");

            for (Map<String, Object> album : albuns) {
                System.out.println(album.get("nome"));
            }
        }
    }

