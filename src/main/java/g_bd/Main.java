package g_bd;

import g_bd.database.ConexaoBD;
import g_bd.model.UserInfo;
import g_bd.repository.UserInfoRepository;

import java.sql.ResultSet;
import java.util.ArrayList;

import static g_bd.database.ConexaoBD.*;
import static g_bd.database.ConexaoBD.Tipos.*;

public class Main {

    private static final String QUERY_USUARIOS = "SELECT * FROM SQDC_USER.USER_INFO;";
    private static final String QUERY_USUARIO_POR_ID = "SELECT * FROM SQDC_USER.USER_INFO WHERE ID = ?;";

    public static void main(String[] args) throws Exception {

        ConexaoBD conexaoBD = new ConexaoBD();
        conexaoBD.conectarBanco();

//        ResultSet resultSet = conexaoBD.select(QUERY_USUARIOS);
//        while (resultSet.next()) {
//            int id = Integer.parseInt(resultSet.getString(1));
//            String nome = resultSet.getString(2);
//
//            System.out.print("ID=" + id);
//            System.out.print(", NAME='" + nome + "'\n");
//        }


//        String[] valores = {"19"};
//        Tipos[] tipos = {INTEGER};
//
//        resultSet = conexaoBD.select(valores, tipos, QUERY_USUARIO_POR_ID);
//        resultSet.next();
//
//        int id = Integer.parseInt(resultSet.getString(1));
//        String nome = resultSet.getString(2);
//
//        System.out.print("ID=" + id);
//        System.out.print("NAME='" + nome + '");



//        UserInfo usuario1 = UserInfoRepository.getUserInfoById(conexaoBD, "19");
//        System.out.print("ID=" + usuario1.getId());
//        System.out.print(", NAME=" + usuario1.getName() + "\n");


//        String[] valores = {"ACTIVE", "13"};
//        Tipos[] tipos = {VARCHAR, VARCHAR};
//        ArrayList<UserInfo> usuarios = UserInfoRepository.getUsersInfo(conexaoBD, valores, tipos);
//
//        for (UserInfo atual : usuarios) {
//            System.out.print("ID=" + atual.getId());
//            System.out.print(", NAME=" + atual.getName() + "\n");
//        }

        conexaoBD.desconectarBanco();
    }

}
