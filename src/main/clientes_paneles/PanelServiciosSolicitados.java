
package clientes_paneles;

import java.awt.event.ActionEvent;

/**
 *
 * @author usuario
 */
public class PanelServiciosSolicitados extends javax.swing.JPanel {

    /**
     * Creates new form PanelServiciosSolicitados
     */
    public PanelServiciosSolicitados() {
        initComponents();
    }

    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldHoraSer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFielIDcliente = new javax.swing.JTextField();
        jTextFieldPrecioSer = new javax.swing.JTextField();
        jTextFieldTipoSer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFechaSer = new javax.swing.JTextField();
        jButtonReservar = new javax.swing.JButton();

        setBackground(new java.awt.Color(29, 29, 29));
        setLayout(null);

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo Servicio");
        add(jLabel5);
        jLabel5.setBounds(50, 100, 78, 17);
        add(jSeparator2);
        jSeparator2.setBounds(0, 30, 660, 20);

        jLabel6.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registrar servicio");
        add(jLabel6);
        jLabel6.setBounds(0, 0, 660, 30);


        add(jTextFieldHoraSer);
        jTextFieldHoraSer.setBounds(140, 210, 240, 22);

        jLabel7.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio Servicio");
        add(jLabel7);
        jLabel7.setBounds(50, 270, 93, 17);

        jLabel8.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Identificacion del cliente");
        add(jLabel8);
        jLabel8.setBounds(50, 320, 153, 17);

        jLabel9.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hora Servicio");
        add(jLabel9);
        jLabel9.setBounds(50, 210, 83, 17);


        add(jTextFielIDcliente);
        jTextFielIDcliente.setBounds(220, 320, 240, 22);


        add(jTextFieldPrecioSer);
        jTextFieldPrecioSer.setBounds(160, 270, 240, 22);

        add(jTextFieldTipoSer);
        jTextFieldTipoSer.setBounds(170, 100, 240, 22);

        jLabel4.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Servicio");
        add(jLabel4);
        jLabel4.setBounds(50, 160, 90, 17);

        add(jTextFieldFechaSer);
        jTextFieldFechaSer.setBounds(160, 160, 240, 22);

        jButtonReservar.setBackground(new java.awt.Color(29, 29, 29));
        jButtonReservar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReservar.setText("Reservar");
        add(jButtonReservar);
        jButtonReservar.setBounds(300, 380, 74, 23);
        jButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarActionPerformed(evt);
            }
        });
    }

    
    private void jButtonReservarActionPerformed(ActionEvent evt) {
        
    }

    public String getIDCliente() {
        return jTextFielIDcliente.getText();
    }
    
    public String getFechaSer() {
        return jTextFieldFechaSer.getText();
    }
    
    public String getHoraSer() {
        return jTextFieldHoraSer.getText();
    }
    
    public String getPrecioSer() {
        return jTextFieldPrecioSer.getText();
    }
    
    public String getTipoSer() {
        return jTextFieldTipoSer.getText();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReservar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFielIDcliente;
    private javax.swing.JTextField jTextFieldFechaSer;
    private javax.swing.JTextField jTextFieldHoraSer;
    private javax.swing.JTextField jTextFieldPrecioSer;
    private javax.swing.JTextField jTextFieldTipoSer;
    // End of variables declaration//GEN-END:variables
}
