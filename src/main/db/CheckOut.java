package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class CheckOut {
    public static String totalFactura(){
        String inf_factura = "";
        String sql = """
                SELECT f.cod_factura, 
                (f.total + COALESCE(SUM(s.precio), 0)) AS total
                FROM facturas f 
                LEFT JOIN servicios s ON s.cod_factura = f.cod_factura
                WHERE f.cod_factura = (SELECT MAX(cod_factura) FROM facturas)
                GROUP BY f.cod_factura, f.total;
                """;
        try (
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ) {
                try (ResultSet rs = stmt.executeQuery()) {
                    if(rs.next()) {
                    double total = rs.getDouble("total");
                    int cod_factura = rs.getInt("cod_factura");
                                
                    inf_factura = "Código de factura: " + cod_factura + "\nTotal: " + total + "\n-----------------------------------------";
                        }
                    }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
        
                return inf_factura;
    }
    public static String generarFactura(int idCliente, int num_hab, Time hora, Date fecha){
        String factura = "";
        String sql = "SELECT * FROM generar_factura(?, ?, ?, ?);";
            try (
                Connection conn = ConexionDB.obtenerConexion();
                PreparedStatement stmt = conn.prepareStatement(sql);
            ) {
                stmt.setInt(1, idCliente);
                stmt.setInt(2, num_hab);
                stmt.setTime(3, hora);
                stmt.setDate(4, fecha);
    
                try (ResultSet rs = stmt.executeQuery()) {
                    int acum = 0;

                    while(rs.next()) {
                        double precio = rs.getDouble("precioo");
                        String tipo = rs.getString("tipoo");
                        Date fecha_Ser = rs.getDate("fechaa");
                        Time hora_Ser = rs.getTime("horaa");
                        int cliente = rs.getInt("cliente_ID");

                        
                        factura += "\nServicio " + (acum+=1) + ":\n" + tipo + "|" + precio + "|" + fecha_Ser + "|" + hora_Ser + "|" + cliente + "\n";
                    }
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            String primera_parte = totalFactura();
            return primera_parte + factura;
    }
}    
                            

