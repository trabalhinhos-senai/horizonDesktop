package util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    //Dados para conexão com o banco dados
    private static final String URL_MYSQL = "jdbc:mysql://localhost/sistema";
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "a1s2d3";

    public static Connection conectarBanco() {
        System.out.println("iniciando conexão ...");
        try {
            Class.forName(DRIVER_CLASS);
            return (Connection) DriverManager.getConnection(URL_MYSQL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Não foi possível conectar..." + ex.getMessage());
            return null;
        }
    }
}
