package h_bd.exercicios.exercicio43;

import h_bd.repository.AtualizacaoPlayList;

public class AtualizandoGeneroMusical {
    public static void main(String[] args) {
        AtualizacaoPlayList repo = new AtualizacaoPlayList();
        String novoNome = repo.atualizarPlaylistIncrementandoNumeroPorNome();
        if (novoNome != null) {
            System.out.println("Nome atualizado para: " + novoNome);
        } else {
            System.out.println("Nenhuma playlist encontrada para atualizar.");
        }
    }
}
