package h_bd.exercicio43;

import h_bd.repository.PlaylistRepository;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PlaylistRepository playlistRepository = new PlaylistRepository();
        List<Map<String, Object>> playlistAll = playlistRepository.selecionarTodasPlaylists();
        Map<String, Object> playlistAntesAlterar = new HashMap<>();
        Map<String, Object> playlistDepoisAlterar = new HashMap<String, Object>();

        String nomePlaylist = "Minha playlist 0";
        int playlistId = 0;
        boolean existePlaylist = false;
        boolean playlistPodeSomarUm = false;

        try{
            for (Map<String, Object> aux : playlistAll) {
                if (aux.values().toArray()[1].toString().equals(nomePlaylist)){
                    System.out.println("\nAntes:\n");
                    System.out.println(aux.entrySet() + "\n");
                    existePlaylist = true;
                    playlistId = Integer.parseInt(aux.values().toArray()[0].toString());
                    playlistAntesAlterar = aux;
                    break;
                }
            }

            if (!existePlaylist){
                throw new NoSuchElementException("\n" + nomePlaylist + " - PLAYLIST NÃO EXISTE!");
            }

            String[] palavras = playlistAntesAlterar.values().toArray()[1].toString().split(" ");

            int novo = 0;

            for (int i = 0; i<palavras.length; i++){
                try {
                    novo = Integer.parseInt(palavras[i]);
                    System.out.println(novo + " - ISSO PODE SER UM INT!");
                    novo = novo + 1;
                    palavras[i] = String.valueOf(novo);
                    playlistPodeSomarUm = true;
                } catch (NumberFormatException erroCaracterInvalido){
                    System.out.println(palavras[i] + " - ESTA PALAVRA NÃO PODE VIRAR UM INT!");
                }
            }

            if (!playlistPodeSomarUm){
                throw new Exception("\n" + nomePlaylist + " - ESTE NOME NÃO TEM NENHUMA PALAVRA QUE PODE VIRAR INT");
            }

            StringBuilder novoNome = new StringBuilder();
            for (String palavra : palavras){
                novoNome.append(palavra).append(" ");
            }
            novoNome = new StringBuilder(novoNome.toString().trim());

            playlistDepoisAlterar.put("id", playlistId);
            playlistDepoisAlterar.put("nome", novoNome);

            playlistRepository.updatePlaylist("nome", playlistAntesAlterar, playlistDepoisAlterar);

            playlistAll = playlistRepository.selecionarTodasPlaylists();
            System.out.println("\nDepois:\n");
            playlistAll.stream()
                    .forEach(n -> System.out.println(n.entrySet()));

        } catch (Exception erroNomeNaoExiste){
            System.out.println(erroNomeNaoExiste.getMessage());
            throw new NoSuchElementException();
        }


    }
}
