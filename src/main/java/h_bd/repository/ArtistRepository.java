package h_bd.repository;

import h_bd.database.DBConnection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ArtistRepository {

    private final DBConnection conexaoBanco;
    private final String NOME_TABELA = "artist";

    public ArtistRepository() {
        this.conexaoBanco = new DBConnection();
        this.conexaoBanco.connectDB("auto-qa");
    }

    //Quando for projeto real
    public ArtistRepository(Properties props) {
        this.conexaoBanco = new DBConnection(props);
        this.conexaoBanco.connectDB("auto-qa");
    }

    //Apenas para fins didáticos
    public String selecionarNomeArtistaPorId(int id) {
        List<Map<String, Object>> resultado = conexaoBanco.select(NOME_TABELA, "artist_id", id);

        Map<String, Object> primeiraLinha = resultado.getFirst();

        String nomeArtista = primeiraLinha.get("name").toString();

        return nomeArtista;
    }

    public String selecionarNomeArtistaPorIdReduzido(int id) {
        return conexaoBanco.select(NOME_TABELA, "artist_id", id)
                .getFirst()
                .get("name").toString();
    }
}
