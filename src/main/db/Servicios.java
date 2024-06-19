package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}
