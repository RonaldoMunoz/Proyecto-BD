package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Types;

public class Servicios {
    public static String listarServicios(){
        String sql = "select distinct tipo from servicios";
        String servicios = "";

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
        ) {

        while(rs.next()) {
            String tipo = rs.getString("tipo");
            servicios += tipo + "\n";
        }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return servicios;
    }

    public static Boolean crearServicio(String tipo, Date fecha, Time hora, Integer cod_factura, double precio, int cliente){
        String sql = """
                INSERT INTO SERVICIOS (tipo, fecha, hora, cod_factura, precio, cliente) VALUES
                (?, ?, ?, ?, ?, ?);
                """;

        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setString(1, tipo);
            stmt.setDate(2, fecha);
            stmt.setTime(3, hora);
            if(cod_factura == null) stmt.setNull(4, Types.INTEGER);
            else stmt.setInt(4, cod_factura);
            stmt.setDouble(5, precio);
            stmt.setInt(6, cliente);
            
            if (stmt.executeUpdate() > 0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } 

        return false;
    }
}
