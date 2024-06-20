package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract public class ConexionDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/HotelDescanso";
    private static final String USER = "postgres";
    private static final String PASSWORD = "juanmirojas";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
