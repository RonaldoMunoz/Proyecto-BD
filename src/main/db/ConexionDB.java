package main.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract public class ConexionDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/Hotel";
    private static final String USER = "postgres";
    private static final String PASSWORD = "juanmirojas";
    private static Connection conn = null;

    public static void crearConexion() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection obtenerConexion() throws SQLException {
        if (conn == null) throw new SQLException("No existe ninguna conexión");

        return conn;
    }

    public static void cerrarConexion() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
