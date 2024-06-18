
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

        jButtonBack = new javax.swing.JButton();
        jButtonDescuentoClientes = new javax.swing.JButton();
        jButtonIdentificarClientes = new javax.swing.JButton();
        jButtonGeneralTotalCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(810, 640));
        setMinimumSize(new java.awt.Dimension(810, 640));
        setPreferredSize(new java.awt.Dimension(810, 640));

        jButtonBack.setBackground(new java.awt.Color(29, 29, 29));
        jButtonBack.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-izquierda.png"))); // NOI18N
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }

            private void jButtonBackActionPerformed(ActionEvent evt) {
               cambiarPanel(GUI_principal.modulosPanel,GUI_principal.Bg);
            }
        });

        jButtonDescuentoClientes.setBackground(new java.awt.Color(29, 29, 29));
        jButtonDescuentoClientes.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonDescuentoClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDescuentoClientes.setText("Descuento Clientes");
        jButtonDescuentoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescuentoClientesActionPerformed(evt);
            }
        });

        jButtonIdentificarClientes.setBackground(new java.awt.Color(29, 29, 29));
        jButtonIdentificarClientes.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonIdentificarClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIdentificarClientes.setText("Buscar Cliente");
        jButtonIdentificarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIdentificarClientesActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clientes");

        jLabel2.setFont(new java.awt.Font("Roboto Thin", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El Descanso");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edificio.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonDescuentoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonGeneralTotalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonIdentificarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(68, 68, 68)
                .addComponent(jButtonDescuentoClientes)
                .addGap(16, 16, 16)
                .addComponent(jButtonGeneralTotalCliente))
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jButtonIdentificarClientes))
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private Panel_IdentificarCliente panel_IdentificarClientes = new Panel_IdentificarCliente();
    private PanelDescuentos panel_DescuentoClientes = new PanelDescuentos();
    private Panel_TotalCliente panel_TotalCliente = new Panel_TotalCliente();
    // End of variables declaration//GEN-END:variables
}
