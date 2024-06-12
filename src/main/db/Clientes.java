package main.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

abstract public class Clientes {
    private static PreparedStatement stmt = null;
    private static ResultSet rs = null;

    public static double mostrarDescuento() {
        String sql = "SELECT DESCUENTO FROM HABITUALES LIMIT 1";

        try {
            Connection conn = ConexionDB.obtenerConexion();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if(rs.next()) {
                return rs.getDouble("descuento");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null && stmt != null) {
                    stmt.close();
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return -1;
    }

    public static Boolean modificarDescuento(double nDescuento) {
        String sql = "UPDATE HABITUALES SET DESCUENTO = ?";

        try {
            Connection conn = ConexionDB.obtenerConexion();
            stmt = conn.prepareStatement(sql);
            stmt.setDouble(1, nDescuento);
            
            if (stmt.executeUpdate() > 0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return false;
    }
}
