package h_bd.runner;

import h_bd.repository.ArtistRepository;

public class Main {

    public static void main(String[] args) throws Exception {
        ArtistRepository artistRepository = new ArtistRepository();
        String nomeArtista = artistRepository.selecionarNomeArtistaPorId(99);

        System.out.println("\nO artista é: " + nomeArtista);
    }

}
