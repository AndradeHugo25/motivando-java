package f_poo.f_enum;

import lombok.Getter;

@Getter
public enum NivelAcesso {

    ADMINISTRADOR(1, "Acesso total"),
    MODERADOR(2, "Acesso limitado"),
    USUARIO(3, "Acesso básico");

    private final int codigo;
    private final String descricao;

    NivelAcesso(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static NivelAcesso buscarPorCodigo(int codigo) {
        for (NivelAcesso nivel : NivelAcesso.values()) {
            if (nivel.getCodigo() == codigo) {
                return nivel;
            }
        }
        throw new IllegalArgumentException("Código não encontrado: " + codigo);
    }
}
