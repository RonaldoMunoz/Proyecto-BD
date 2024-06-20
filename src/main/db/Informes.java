package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Informes {
    public static String calcularVentasMes(int anio, int mes) {
        String informe = "";
        double totalVentas = 0;
        String sql = "SELECT calcular_ventas_mes(?, ?);";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, anio);
            stmt.setInt(2, mes);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    totalVentas = rs.getDouble(1);
                    informe += "Las ventas totales en el mes indicado son de: $" + totalVentas;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return informe;
    }
    public static double calcularPorcentajeOcupacion(int anio, int mes) {
        double porcentajeOcupacion = 0;
        String sql = "SELECT calcular_porcentaje_ocupacion(?, ?);";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, anio);
            stmt.setInt(2, mes);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    porcentajeOcupacion = rs.getDouble(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return porcentajeOcupacion;
    }
    public static double calcularPorcentajeCancelacion(int anio, int mes) {
        double porcentajeCancelacion = 0;
        String sql = "SELECT calcular_porcentaje_cancelacion(?, ?);";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, anio);
            stmt.setInt(2, mes);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    porcentajeCancelacion = rs.getDouble(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return porcentajeCancelacion;
    }
    public static String tipoServicioMasRepetido(int anio, int mes) {
        String tipoMasRepetido = "";
        String sql = "SELECT tipo_servicio_mas_repetido(?, ?);";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, anio);
            stmt.setInt(2, mes);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    tipoMasRepetido = rs.getString(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipoMasRepetido;
    }
    public static String obtenerConsolidadoServicios(int anio, int mes) {
        StringBuilder tiposServicios = new StringBuilder();
        String sql = "SELECT DISTINCT tipo FROM servicios WHERE EXTRACT(YEAR FROM fecha) = ? AND EXTRACT(MONTH FROM fecha) = ?;";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, anio);
            stmt.setInt(2, mes);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String tipo = rs.getString("tipo");
                    if (tiposServicios.length() > 0) {
                        tiposServicios.append(", ");
                    }
                    tiposServicios.append(tipo);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tiposServicios.toString();
    }
}
