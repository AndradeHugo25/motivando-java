package h_bd.exercicios.exercicio43;

import h_bd.repository.PlayListRepositoryA;

public class MainEx43 {
    public static void main(String[] args) {
        PlayListRepositoryA repo = new PlayListRepositoryA();

        String nomePlayList = repo.selecionarPlaylistsPorId(3).getFirst().get("nome").toString();


        int atual = Integer.parseInt(nomePlayList.substring(nomePlayList.length() - 1));
        int novoChar = atual + 1;

        String nomeNovoPlayList = nomePlayList.replace(String.valueOf(atual), String.valueOf(novoChar));



        repo.atualizarPlaylistsPorId(3, nomeNovoPlayList);
    }
}
