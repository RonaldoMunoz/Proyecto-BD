/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package clientes_paneles;

/**
 *
 * @author usuario
 */
public class Panel_TotalCliente extends javax.swing.JPanel {

    /**
     * Creates new form Panel_TotalCliente
     */
    public Panel_TotalCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jText_IDcliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCoBoxTipoHabitacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButtonGenerarTotal = new javax.swing.JButton();
        jTextNumDias = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        label_TotalApagarTitle = new javax.swing.JLabel();
        label_Listar1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(640, 640));
        setMinimumSize(new java.awt.Dimension(640, 640));
        setPreferredSize(new java.awt.Dimension(640, 640));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresa la identificación del cliente:");

        jCoBoxTipoHabitacion.setBackground(new java.awt.Color(29, 29, 29));
        jCoBoxTipoHabitacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jCoBoxTipoHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jCoBoxTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de habitacion:");

        jButtonGenerarTotal.setBackground(new java.awt.Color(29, 29, 29));
        jButtonGenerarTotal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonGenerarTotal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGenerarTotal.setText("Consultar");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingresa el numero de dias de estadia:");

        label_TotalApagarTitle.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        label_TotalApagarTitle.setForeground(new java.awt.Color(255, 255, 255));
        label_TotalApagarTitle.setText("El total a pagar para el cliente es de:");

        label_Listar1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        label_Listar1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Generar total a cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jText_IDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jCoBoxTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTextNumDias, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonGenerarTotal))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(label_TotalApagarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(label_Listar1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jText_IDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(jCoBoxTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNumDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGenerarTotal))
                .addGap(18, 18, 18)
                .addComponent(label_TotalApagarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_Listar1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }

    private String obtenerId(){
        return jText_IDcliente.getText();
    }

    private String obtenerTipoHabitacion(){
        return jCoBoxTipoHabitacion.getSelectedItem().toString();
    }

    private String obtenerNumDias(){
        return jTextNumDias.getText();
    }

    private void jButtonGenerarTotalActionPerformed(java.awt.event.ActionEvent evt) {
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerarTotal;
    private javax.swing.JComboBox<String> jCoBoxTipoHabitacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextNumDias;
    private javax.swing.JTextField jText_IDcliente;
    private javax.swing.JLabel label_Listar1;
    private javax.swing.JLabel label_TotalApagarTitle;
    // End of variables declaration//GEN-END:variables
}
