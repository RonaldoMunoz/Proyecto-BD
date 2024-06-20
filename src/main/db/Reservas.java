package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;

abstract public class Reservas {
    private static boolean crearReserva(int idCliente, int numHab, Date fechaEntrada, int numDias) {
        String sql = "INSERT INTO RESERVAS (FECHA_ENTRADA, NUM_DIAS, ESTADO, HABITACION, CLIENTE) VALUES (?, ?, 'Reservada', ?, ?)";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setDate(1, fechaEntrada);
            stmt.setInt(2, numDias);
            stmt.setInt(3, numHab);
            stmt.setInt(4, idCliente);

            if (stmt.executeUpdate() > 0) return true; 
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

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

    private static boolean verificarDisponible(int numHab, Date fecha) {
        String sql ="""
                SELECT H.NUM_HABITACION FROM HABITACIONES H
                WHERE NOT EXISTS (
                    SELECT R.HABITACION FROM RESERVAS R
                    WHERE R.HABITACION = H.NUM_HABITACION
                    AND (R.ESTADO = 'Reservada' OR R.ESTADO = 'Ocupada')
                    AND R.FECHA_ENTRADA <= ?
                    AND (R.FECHA_ENTRADA + MAKE_INTERVAL(DAYS => R.NUM_DIAS))::DATE > ?
                ) AND H.NUM_HABITACION = ?
                """;

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setDate(1, fecha);
            stmt.setDate(2, fecha);
            stmt.setInt(3, numHab);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    
    public static String hacerReserva(int idCliente, String nombre, String apellido, String correo, String telefono, int numHab, Date fechaEntrada, int numDias) {
        LocalDate fechaEntr = fechaEntrada.toLocalDate();
        Date fechaSalida = Date.valueOf(fechaEntr.plusDays(numDias));

        if (verificarDisponible(numHab, fechaEntrada) && verificarDisponible(numHab, fechaSalida)) {
            if (Clientes.existeCliente(idCliente)) {
                if (!crearReserva(idCliente, numHab, fechaEntrada, numDias)) return "Ocurrio un error al crear la reserva";

                return "Se ha realizado la reserva correctamente";
            } else {
                if (!Clientes.crearCliente(idCliente, nombre, apellido, correo, telefono)) return "Ocurrio un error al registrar el cliente";
                if (!crearReserva(idCliente, numHab, fechaEntrada, numDias)) return "Ocurrio un error al crear la reserva";

                return "Se ha realizado la reserva correctamente";
            }
        } else return "La habitacion " + numHab + " no esta disponible para el " + fechaEntrada;
    }
}
