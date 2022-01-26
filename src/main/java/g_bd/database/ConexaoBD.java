package g_bd.database;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

@Data
public class ConexaoBD {

    private static PreparedStatement stmt;
    private static ResultSet resultado;
    private Connection connection;

    public enum Tipos {
        VARCHAR, INTEGER, DECIMAL, TIME_STAMP, BOOL, DATE, NULL
    }

    public void conectarBanco() throws Exception {
        String urlJdbc = "jdbc:postgresql://10.149.0.5:5432/sqdc_user";
        String usuarioBD = "sqdc";
        String senhaBD = "Wmt5nPSwqfMvXLWr";

        connection = DriverManager.getConnection(urlJdbc, usuarioBD, senhaBD);
    }

    public void desconectarBanco() throws Exception {
        connection.close();
    }

    private PreparedStatement setarParametros(PreparedStatement statement, String[] valores, Tipos[] tipos) throws SQLException {
        int param = 1;
        for (Tipos tipo : tipos) {
            switch (tipo) {
                case VARCHAR:
                    statement.setString(param, valores[param - 1]);
                    break;
                case INTEGER:
                    statement.setInt(param, Integer.parseInt(valores[param - 1]));
                    break;
                case DECIMAL:
                    statement.setBigDecimal(param, new BigDecimal(valores[param - 1]));
                    break;
                case TIME_STAMP:
                    statement.setTimestamp(param, Timestamp.valueOf(valores[param - 1]));
                    break;
                case DATE:
                    statement.setDate(param, Date.valueOf(valores[param - 1]));
                    break;
                case BOOL:
                    statement.setBoolean(param, Boolean.parseBoolean(valores[param - 1]));
                    break;
                case NULL:
                    statement.setNull(param, Types.NULL);
                    break;
            }
            param++;
        }
        return statement;
    }

    //-----------------------DELETE----------------------------------------------------------------------------
    public void delete(String parametro, String query) throws SQLException {
        stmt = connection.prepareStatement(query);
        stmt.setString(1, parametro);
        stmt.execute();
        stmt.close();
    }

    public void delete(String[] valores, Tipos[] tipos, String query) throws SQLException {
        stmt = connection.prepareStatement(query);
        stmt = setarParametros(stmt, valores, tipos);
        stmt.execute();
        stmt.close();
    }

    //-----------------------UPDATES----------------------------------------------------------------------------
    public void update(String query) throws SQLException {
        stmt = connection.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
    }

    public void update(String[] valores, Tipos[] tipos, String query) throws SQLException {
        stmt = connection.prepareStatement(query);
        stmt = setarParametros(stmt, valores, tipos);
        stmt.executeUpdate();
        stmt.close();
    }


    //-----------------------SELECT----------------------------------------------------------------------------
    public ResultSet select(String[] valores, Tipos[] tipos, String query) throws SQLException {
        stmt = connection.prepareStatement(query);
        stmt = setarParametros(stmt, valores, tipos);
        resultado = stmt.executeQuery();
        return resultado;
    }

    public ResultSet select(String query) throws SQLException {
        stmt = connection.prepareStatement(query);
        resultado = stmt.executeQuery();
        return resultado;
    }

}

