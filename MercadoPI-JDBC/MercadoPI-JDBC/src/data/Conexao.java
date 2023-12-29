package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Connection conn;

    public static void conectar() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercado_db", "root", "1234");
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (SQLException ex) {
            System.out.print("Erro: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.print("Erro: " + ex.getMessage());
        }
    }

    public static void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print("Erro: " + ex.getMessage());
        }
    }

    public static Connection getConnection() {
        return conn;
    }

}
