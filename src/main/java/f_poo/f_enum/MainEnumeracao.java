package f_poo.f_enum;

public class MainEnumeracao {

    public static void main(String[] args) {
        NivelAcesso nivel = NivelAcesso.ADMINISTRADOR;
        System.out.println("Nível: " + nivel);
        System.out.println("Código: " + nivel.getCodigo());
        System.out.println("Descrição: " + nivel.getDescricao());


        int codigoBuscado = 3;
        NivelAcesso nivelPorCodigo = NivelAcesso.buscarPorCodigo(codigoBuscado);
        System.out.println("\n\nBusca por código " + codigoBuscado + ": " + nivelPorCodigo);
    }
}
