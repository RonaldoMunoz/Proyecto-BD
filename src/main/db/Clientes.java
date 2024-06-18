package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

abstract public class Clientes {
    public static ArrayList<String> buscarCliente(int idCliente) {
        ArrayList<String> result = new ArrayList<String>();
        String sql = "SELECT C.NOMBRE, C.APELLIDO, P.ID AS TIPO_CLIENTE, H.DESCUENTO FROM CLIENTES C LEFT JOIN HABITUALES H ON C.ID = H.ID LEFT JOIN PERSONAS_NATURALES P ON P.ID = H.ID WHERE C.ID = ?";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, idCliente);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    result.add(rs.getString("nombre") + " " + rs.getString("apellido"));
                    
                    if (rs.getString("descuento") != null) {
                        if (rs.getString("tipo_cliente") == null) result.add("Corporativo");
                        else result.add("Persona natural");
                    } else result.add(rs.getString("tipo_cliente"));

                    result.add(rs.getString("descuento"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static double mostrarDescuento() {
        String sql = "SELECT DESCUENTO FROM HABITUALES LIMIT 1";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
        ) {
            if (rs.next()) {
                return rs.getDouble("descuento");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }

    public static Boolean modificarDescuento(double nDescuento) {
        String sql = "UPDATE HABITUALES SET DESCUENTO = ?";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setDouble(1, nDescuento);
            
            if (stmt.executeUpdate() > 0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
