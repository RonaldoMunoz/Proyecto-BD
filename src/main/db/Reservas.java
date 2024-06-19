package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

abstract public class Reservas {
    public static boolean cancelarReserva(int numReserva) {
        String sql = "UPDATE RESERVAS SET ESTADO = 'Cancelada' WHERE NUM_RESERVA = ?";
        
        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, numReserva);
            if (stmt.executeUpdate() > 0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public static String consultarReserva (int idCliente){
        String mensaje = "";
        String sql = """
                SELECT C.NOMBRE, C.APELLIDO, H.NUM_HABITACION, H.TIPO, R.NUM_DIAS FROM RESERVAS R
                INNER JOIN CLIENTES C ON R.CLIENTE = C.ID
                INNER JOIN HABITACIONES H ON R.HABITACION = H.NUM_HABITACION
                WHERE R.CLIENTE = ?
                """;
        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            
            stmt.setInt(1, idCliente);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()){
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    int num_hab = rs.getInt("num_habitacion");
                    String tipo = rs.getString("tipo");
                    int dias = rs.getInt("num_dias");
                    mensaje += "El/La cliente " + nombre + " " + apellido + " tiene reservada la habitación #" + num_hab + " de tipo " + tipo + " por " + dias + " dias.\n";
                }
            }
            }catch (SQLException e){
                e.printStackTrace();
            }

        return mensaje; 
    }
    
    public static Boolean hacerReserva(int idCliente, String nombre, String apellido, String correo, String telefono, int num_hab, Date fecha_entrada, int num_dias){
        return false; 
    }
}
