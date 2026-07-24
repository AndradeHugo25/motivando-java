package h_bd;

import h_bd.repository.PlaylistRepository;

import java.util.Map;

public class Exercicio43Arquivos {

    public static void main(String[] args) {

        PlaylistRepository repository = new PlaylistRepository();

        int idPlaylist = 3;

        Map<String, Object> playlist =
                repository.selecionarPlaylistPorId(idPlaylist);

        String nomeAtual = playlist.get("nome").toString();

        String numeroTexto = nomeAtual.replaceAll("\\D+", "");
        int numero = Integer.parseInt(numeroTexto);

        int novoNumero = numero + 1;

        String novoNome = nomeAtual.replaceAll("\\d+$", String.valueOf(novoNumero));

        repository.atualizarNomePlaylist(idPlaylist, novoNome);

        System.out.println("Nome anterior: " + nomeAtual);
        System.out.println("Novo nome: " + novoNome);
    }
}