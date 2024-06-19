
package clientes_paneles;

import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Panel_IdentificarCliente extends javax.swing.JPanel {

    public Panel_IdentificarCliente() {
        initComponents();
    }


    
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButtonConsultarEstado = new javax.swing.JButton();
        label_ConsultaDispo = new javax.swing.JLabel();
        label_TipoCliente = new javax.swing.JLabel();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jLabelNombreCliente = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelDescuentoParaCliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ButtonGroup group = new ButtonGroup();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(640, 640));
        setMinimumSize(new java.awt.Dimension(640, 640));
        setPreferredSize(new java.awt.Dimension(640, 640));

        jButtonConsultarEstado.setBackground(new java.awt.Color(29, 29, 29));
        jButtonConsultarEstado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonConsultarEstado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarEstado.setText("Consultar");
        jButtonConsultarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarEstadoActionPerformed(evt);
            }

            private void jButtonConsultarEstadoActionPerformed(ActionEvent evt) {
                obtenerIdClient();
                reemplazarTexto("ronadol","Habitual", "0");         
            }
        });

        label_ConsultaDispo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_ConsultaDispo.setForeground(new java.awt.Color(255, 255, 255));
        label_ConsultaDispo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ConsultaDispo.setText("Buscar Cliente");

        label_TipoCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        label_TipoCliente.setForeground(new java.awt.Color(255, 255, 255));

        jLabelNombreCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabelNombreCliente.setForeground(new java.awt.Color(255, 255, 255));

        jRadioButton1.setForeground(new java.awt.Color(29, 29, 29));
        jRadioButton1.setText("Habitual");

        jRadioButton2.setForeground(new java.awt.Color(29, 29, 29));
        jRadioButton2.setText("Esporadico");
        

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresa la identificación del cliente:");

        jLabelDescuentoParaCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabelDescuentoParaCliente.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("El cliente:");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("El cliente tiene un descuento de:");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_ConsultaDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonConsultarEstado))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jRadioButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jRadioButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(label_TipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelDescuentoParaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label_ConsultaDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarEstado))
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addComponent(jLabelNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jRadioButton1)
                .addGap(9, 9, 9)
                .addComponent(jRadioButton2)
                .addGap(9, 9, 9)
                .addComponent(label_TipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(13, 13, 13)
                .addComponent(jLabelDescuentoParaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        group.add(jRadioButton1);
        group.add(jRadioButton2);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
    }// </editor-fold>//GEN-END:initComponents


private String obtenerIdClient(){
    if(jTextFieldIdCliente.getText().isEmpty()){
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Debe digitar el id del cliente", "Error", JOptionPane.ERROR_MESSAGE);
        throw new IllegalArgumentException("Debe digitar el id del cliente");
    }
    else return jTextFieldIdCliente.getText();
    
}

private void reemplazarTexto(String nombre, String tipo, String descuento){
    if (nombre.isEmpty()){
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        JOptionPane.showMessageDialog(null, "El cliente no existe en la BD", "Error", JOptionPane.ERROR_MESSAGE);
        
    
    }
    jLabelNombreCliente.setText(nombre);
    if (tipo.equals("Habitual")){
        jRadioButton1.setEnabled(true);
        jRadioButton1.setSelected(true);
    }
    else if (tipo.equals("Esporadico")){
        jRadioButton2.setEnabled(true);
        jRadioButton2.setSelected(true);
    }
    else {
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
    }

    jLabelDescuentoParaCliente.setText(descuento);    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDescuentoParaCliente;
    private javax.swing.JLabel jLabelNombreCliente; // nombre del cliente
    private javax.swing.JRadioButton jRadioButton1; // habitual
    private javax.swing.JRadioButton jRadioButton2; // esporadico
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldIdCliente;
    private javax.swing.JLabel label_ConsultaDispo; // titulo
    private javax.swing.JLabel label_TipoCliente; // tipo de cliente (persona natural o juridica)
    // End of variables declaration//GEN-END:variables
}
