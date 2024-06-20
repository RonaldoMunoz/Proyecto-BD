
package clientes_paneles;

import java.awt.event.ActionEvent;
import gui.CambiarPanel;
import gui.GUI_principal;

/**
 *
 * @author Ronaldo el desbarata viejitas
 */
public class Panel_Clientes_opciones extends javax.swing.JPanel implements CambiarPanel {


    public Panel_Clientes_opciones() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jButtonRegistrarServicio = new javax.swing.JButton();
        jButtonGeneralTotalCliente = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonDescuentoClientes = new javax.swing.JButton();
        jButtonIdentificarClientes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(810, 640));
        setMinimumSize(new java.awt.Dimension(810, 640));
        setPreferredSize(new java.awt.Dimension(810, 640));
        setLayout(null);

        jButtonRegistrarServicio.setBackground(new java.awt.Color(29, 29, 29));
        jButtonRegistrarServicio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonRegistrarServicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarServicio.setText("Registrar Servicio");
        jButtonRegistrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarServicioActionPerformed(evt);
            }

            private void jButtonRegistrarServicioActionPerformed(ActionEvent evt) {
                cambiarPanelInt(panelServiciosSolicitados,jPanel1);
            }
        });
        add(jButtonRegistrarServicio);
        jButtonRegistrarServicio.setBounds(20, 380, 180, 24);

        jButtonGeneralTotalCliente.setBackground(new java.awt.Color(29, 29, 29));
        jButtonGeneralTotalCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonGeneralTotalCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGeneralTotalCliente.setText("Generar Total a Pagar");
        jButtonGeneralTotalCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeneralTotalClienteActionPerformed(evt);
            }

            private void jButtonGeneralTotalClienteActionPerformed(ActionEvent evt) {
                cambiarPanelInt(panel_TotalCliente,jPanel1);
            }
        });
        add(jButtonGeneralTotalCliente);
        jButtonGeneralTotalCliente.setBounds(20, 340, 180, 24);

        jButtonBack.setBackground(new java.awt.Color(29, 29, 29));
        jButtonBack.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-izquierda.png"))); // NOI18N
        add(jButtonBack);
        jButtonBack.setBounds(40, 540, 120, 50);

        jButtonDescuentoClientes.setBackground(new java.awt.Color(29, 29, 29));
        jButtonDescuentoClientes.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonDescuentoClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDescuentoClientes.setText("Descuento Clientes");
        jButtonDescuentoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescuentoClientesActionPerformed(evt);
            }
        });
        add(jButtonDescuentoClientes);
        jButtonDescuentoClientes.setBounds(20, 300, 180, 24);

        jButtonIdentificarClientes.setBackground(new java.awt.Color(29, 29, 29));
        jButtonIdentificarClientes.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonIdentificarClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIdentificarClientes.setText("Buscar Cliente");
        jButtonIdentificarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIdentificarClientesActionPerformed(evt);
            }
        });
        add(jButtonIdentificarClientes);
        jButtonIdentificarClientes.setBounds(20, 260, 180, 24);

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clientes");
        add(jLabel6);
        jLabel6.setBounds(70, 210, 67, 22);

        jLabel2.setFont(new java.awt.Font("Roboto Thin", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El Descanso");
        add(jLabel2);
        jLabel2.setBounds(50, 150, 133, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edificio.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(50, 10, 128, 130);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 0, 230, 640);

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));
        jPanel1.setMaximumSize(new java.awt.Dimension(640, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 640));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        add(jPanel1);
        jPanel1.setBounds(230, 0, 640, 640);
    }

    private void jButtonDescuentoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDescuentoClientesActionPerformed
        cambiarPanelInt(panel_DescuentoClientes,jPanel1);
    }

    private void jButtonIdentificarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIdentificarClientesActionPerformed
        cambiarPanelInt(panel_IdentificarClientes, jPanel1);
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDescuentoClientes;
    private javax.swing.JButton jButtonGeneralTotalCliente;
    private javax.swing.JButton jButtonIdentificarClientes;
    private javax.swing.JButton jButtonRegistrarServicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private PanelServiciosSolicitados panelServiciosSolicitados = new PanelServiciosSolicitados();
    private PanelDescuentos panel_DescuentoClientes = new PanelDescuentos();
    private Panel_IdentificarCliente panel_IdentificarClientes = new Panel_IdentificarCliente();
    private Panel_TotalCliente panel_TotalCliente = new Panel_TotalCliente();

    // End of variables declaration//GEN-END:variables
}
