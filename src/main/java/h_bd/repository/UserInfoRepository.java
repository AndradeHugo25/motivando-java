package h_bd.repository;

import h_bd.database.ConexaoBD;
import h_bd.model.UserInfo;

import java.sql.ResultSet;
import java.util.ArrayList;

import static h_bd.database.ConexaoBD.*;
import static h_bd.database.ConexaoBD.Tipos.INTEGER;
import static h_bd.model.UserInfo.Campos.*;

public class UserInfoRepository {

    private static final String QUERY_USUARIOS = "SELECT * FROM SQDC_USER.USER_INFO WHERE STATUS = ? AND UPDATER = ?;";
    private static final String QUERY_USUARIO_POR_ID = "SELECT * FROM SQDC_USER.USER_INFO WHERE ID = ?;";

    //===============METODOS SET MODEL==================================================================================
    private static UserInfo popularDadosUserInfo(ResultSet resultado) throws Exception {
        UserInfo userInfo = new UserInfo();
        if (resultado.next()) {
            userInfo.setId(resultado.getString(ID.name()));
            userInfo.setName(resultado.getString(NAME.name()));
            userInfo.setEmail(resultado.getString(EMAIL.name()));
            userInfo.setRole(resultado.getString(ROLE.name()));
            userInfo.setTeam(resultado.getString(TEAM.name()));
            userInfo.setStatus(resultado.getString(STATUS.name()));
            userInfo.setCreator(resultado.getString(CREATOR.name()));
            userInfo.setCreate_at(resultado.getString(CREATE_AT.name()));
            userInfo.setUpdater(resultado.getString(UPDATER.name()));
            userInfo.setUpdate_at(resultado.getString(UPDATE_AT.name()));
        }
        return userInfo;
    }

    //=================METODO DE SELECAO=================================================================================
    public static UserInfo getUserInfoById(ConexaoBD conexaoBD, String id) throws Exception {
        String[] valores = {id};
        Tipos[] tipos = {INTEGER};
        ResultSet resultado = conexaoBD.select(valores, tipos, QUERY_USUARIO_POR_ID);
        UserInfo userInfo = popularDadosUserInfo(resultado);
        if (userInfo.getId() == null) {
            throw new Exception("Não foi possível achar registro na " + UserInfo.NOME_TABELA + "!");
        }
        return userInfo;
    }

    public static ArrayList<UserInfo> getUsersInfo(ConexaoBD conexaoBD, String[] valores, Tipos[] tipos) throws Exception {
        ResultSet resultado = conexaoBD.select(valores, tipos, QUERY_USUARIOS);
        ArrayList<UserInfo> usersInfo = new ArrayList<>();

        boolean acabou = false;
        while (!acabou) {
            UserInfo cartao = popularDadosUserInfo(resultado);
            if (cartao.getId() != null) {
                usersInfo.add(cartao);
            } else {
                acabou = true;
            }
        }

        if (usersInfo.size() == 0) {
            throw new Exception("Não foi possível achar registros " + UserInfo.NOME_TABELA + "!");
        }
        return usersInfo;
    }

    //=================METODOS DE DELECAO=================================================================================
    public static void deletarEquipment(String[] parametros, String[] valores) throws Exception {

    }

    //=================METODOS DE ATUALIZACAO==============================================================================
    public static void atualizarUpdateDateEquipmentById(ConexaoBD conexaoBD, String[] valores) throws Exception {

    }

}
