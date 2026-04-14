package h_bd.exercicios43;

import h_bd.repository.AlbumRepository;
import h_bd.repository.PlaylistRepository;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PlaylistRepository playlistRepository = new PlaylistRepository();
        List<Map<String, Object>> playlistAll = playlistRepository.selecionarTodasPlaylists();
        Map<String, Object> playlistAntesAlterar = new HashMap<String, Object>();
        Map<String, Object> playlistDepoisAlterar = new HashMap<String, Object>();

        String nomePlaylist = "Minha playlist 0";
        int idPlaylist = 0;
        boolean existePlaylist = false;

        try{
            for (Map<String, Object> aux : playlistAll) {
                if (aux.values().toArray()[1].toString().equals(nomePlaylist)){
                    idPlaylist = Integer.parseInt(aux.values().toArray()[0].toString());
                    System.out.println("\nId de " + aux.values().toArray()[1].toString() + " é " + idPlaylist + "\n");
                    existePlaylist = true;
                    playlistAntesAlterar = aux;
                    break;
                }
            }

            if (!existePlaylist){
                throw new NoSuchElementException("\n" + nomePlaylist + " - PLAYLIST NÃO EXISTE!");
            }

            String[] palavras = playlistAntesAlterar.values().toArray()[1].toString().split(" ");
            for (String palavra : palavras){
                System.out.println(palavra + " ");
            }

            int novo = 0;

            for (int i = 0; i<palavras.length; i++){
                try {
                    novo = Integer.parseInt(palavras[i]) + 1;
                    palavras[i] = String.valueOf(novo);
                } catch (NumberFormatException ignored){
                }
            }


            StringBuilder novoNome = new StringBuilder();
            for (String palavra : palavras){
                System.out.println(palavra + " ");
                novoNome.append(palavra).append(" ");
            }
            novoNome = new StringBuilder(novoNome.toString().trim());

            playlistDepoisAlterar = playlistAntesAlterar;
            playlistDepoisAlterar.remove(String.valueOf(idPlaylist));


            playlistDepoisAlterar.put("[id, nome]", <String.valueOf(idPlaylist),novoNome>);
//            playlistAntesAlterar.values().toArray()[1].toString() = novoNome;

//            playlistRepository.updatePlaylist("nome", "Minha playlist");

        } catch (NoSuchElementException erroNomeNaoExiste){
            System.out.println(erroNomeNaoExiste.getMessage());
            throw new NoSuchElementException();
        }


    }
}
