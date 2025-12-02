package h_bd.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserInfo {

    public enum Campos {
        ID,
        NAME,
        EMAIL,
        ROLE,
        TEAM,
        STATUS,
        CREATOR,
        CREATE_AT,
        UPDATER,
        UPDATE_AT
    }

    public static final String NOME_TABELA = "USER_INFO";

    private String id;
    private String name;
    private String email;
    private String role;
    private String team;
    private String status;
    private String creator;
    private String create_at;
    private String updater;
    private String update_at;

    public String[] getCampos() {
        String[] campos = new String[10];
        campos[0] = id;
        campos[1] = name;
        campos[2] = email;
        campos[3] = role;
        campos[4] = team;
        campos[5] = status;
        campos[6] = creator;
        campos[7] = create_at;
        campos[8] = updater;
        campos[9] = update_at;
        return campos;
    }
}
