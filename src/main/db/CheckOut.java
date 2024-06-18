package main.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Date;
import java.sql.Time;

public class CheckOut {
    public static String generarFactura(int idCliente, int numHabitacion, Time horaSalida,  Date fechaSalida) {
    String inf_factura = "";
        String sql = "SELECT * FROM facturas " +
                     "WHERE cod_factura IN ( " +
                     "   SELECT cod_factura " +
                     "   FROM checkout " +
                     "   WHERE (hora_salida = ? AND fecha_salida = ?) AND reserva IN ( " +
                     "       SELECT num_reserva " +
                     "       FROM reservas " +
                     "       WHERE cliente = ? AND num_reserva IN ( " +
                     "           SELECT num_reserva " +
                     "           FROM habitaciones " +
                     "           WHERE num_habitacion = ? " +
                     "       ) " +
                     "   ) " +
                     ")";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setTime(1, horaSalida);
            stmt.setDate(2, fechaSalida);
            stmt.setInt(3, idCliente);
            stmt.setInt(4, numHabitacion);

            try (ResultSet rs = stmt.executeQuery()) {
                while(rs.next()) {
                    int cod_factura = rs.getInt("cod_factura");
                    double total = rs.getDouble("total");
                    int num_dias = rs.getInt("num_dias");

                    inf_factura += "Tu código de factura es: " + cod_factura + "\n" + 
                                   "Tendrás que pagar un total de " + total + " por tu estadía de: " + num_dias + " días\n";
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return inf_factura;
    }
}
