package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

abstract public class Habitaciones {
    public static String mostrarHabitacion(String tipo_habitacion) {
        String informacion_hab = "";
        String sql = "SELECT * FROM habitaciones WHERE tipo = ?";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setString(1, tipo_habitacion);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while(rs.next()) {
                    int num_habitacion = rs.getInt("num_habitacion");
                    double precio = rs.getDouble("precio");
                    String tipo = rs.getString("tipo");
                    String estado = rs.getString("estado");

                    Integer num_reserva = null;
                    if (rs.getInt("num_reserva") != 0) num_reserva = rs.getInt("num_reserva");
                        
                    informacion_hab += "Número de habitación: " + num_habitacion + " Precio: " + precio + " Tipo: " + tipo + " Estado: " + estado + " Número de reserva: " + num_reserva + "\n";
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return informacion_hab;
    }

    public static String consultarPrecio(String tipo_habitacion){
        String tipo_precio = "";
        String sql = "SELECT DISTINCT tipo, precio FROM habitaciones WHERE tipo = ?";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setString(1, tipo_habitacion);

            try (ResultSet rs = stmt.executeQuery()) {
                if(rs.next()) {
                    double precio = rs.getDouble("precio");
                    String tipo = rs.getString("tipo");
                        
                    tipo_precio = "La habitación " + tipo + " tiene un precio de: $" + precio;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return tipo_precio;
    }

    public static Boolean modificarPrecio(String tipo_habitacion, Double nuevo_precio){
        String sql = "UPDATE habitaciones SET precio = ? WHERE tipo = ?";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setDouble(1, nuevo_precio);
            stmt.setString(2, tipo_habitacion);
            
            if (stmt.executeUpdate() > 0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}