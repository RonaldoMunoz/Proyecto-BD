package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;

abstract public class Habitaciones {
    public static String mostrarHabitacion(String tipoHabitacion, Date fechaInicio, Date fechaFinal) {
        String informacion_hab = "";
        String sql = """
                SELECT * FROM HABITACIONES H
                WHERE NOT EXISTS (
                    SELECT 1 FROM RESERVAS R
                    WHERE R.HABITACION = H.NUM_HABITACION
                    AND (R.ESTADO = 'Reservada' OR R.ESTADO = 'Ocupada')
                    AND R.FECHA_ENTRADA >= ?
                    AND (R.FECHA_ENTRADA + MAKE_INTERVAL(DAYS => R.NUM_DIAS))::DATE <= ?
                ) AND H.TIPO = ?
                """;

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setDate(1, fechaInicio);
            stmt.setDate(2, fechaFinal);
            stmt.setString(3, tipoHabitacion);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while(rs.next()) {
                    int num_habitacion = rs.getInt("num_habitacion");
                    double precio = rs.getDouble("precio");
                    String tipo = rs.getString("tipo");
                        
                    informacion_hab += "Número de habitación: " + num_habitacion + " Precio: " + precio + " Tipo: " + tipo + "\n";
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

    public static String consultarEstado(int num_habitacion){
        String sql = "select estado from reservas where habitacion = ? ";
        String estado = "";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, num_habitacion);

            try (ResultSet rs = stmt.executeQuery()) {
                if(rs.next()) {
                    String estado_hab = rs.getString("estado");
                           
                    estado += estado_hab;
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 

        return estado;
    }

    public static Boolean modificarEstado(int num_habitacion, String estado){
        String sql = "update reservas set estado = ? where habitacion = ?";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setString(1, estado);
            stmt.setInt(2, num_habitacion);
            
            if (stmt.executeUpdate() > 0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } 

        return false;
    }

    //Primer función de CheckIn
    public static String listarHab_Reservadas(int idCliente){
        String sql = """
                select r.habitacion, h.tipo
                from habitaciones h inner join reservas r
                on h.num_habitacion = r.habitacion 
                where r.cliente = ?
                """;   
        String hab_reservadas = "";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, idCliente);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while(rs.next()) {
                    int num_hab = rs.getInt("habitacion");
                    String tipo = rs.getString("tipo");
                    
                    hab_reservadas += "El cliente tiene reservada la habitación #" + num_hab + " tipo " + tipo + "\n";
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 

        return hab_reservadas;
    }

    //Segunda función de CheckIn
    public static Boolean cambiarReserxOcupado(int num_habitacion, int idCliente){
        String sql = """
            update reservas 
            set estado = 'Ocupada'
            where estado = 'Reservada' and habitacion = ? and cliente = ?
                """;

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ){
                stmt.setInt(1, num_habitacion);
                stmt.setInt(2, idCliente);
                    
                if (stmt.executeUpdate() > 0) return true;
            } catch (SQLException e) {
                    e.printStackTrace();
            }

        return false;
    }
}
