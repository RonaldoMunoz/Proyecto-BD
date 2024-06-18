/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package informes_paneles;

/**
 *
 * @author usuario
 */
public class Panel_VentasXmes extends javax.swing.JPanel {

    /**
     * Creates new form Panel_VentasXmes
     */
    public Panel_VentasXmes() {
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

        jLabelMes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        label_ConsultaDispo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonCalcularVentaxMes = new javax.swing.JButton();
        mes_Seleccionado = new javax.swing.JComboBox<>();
        label_CalculadoVentas = new javax.swing.JLabel();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(640, 640));
        setMinimumSize(new java.awt.Dimension(640, 640));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 640));

        jLabelMes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabelMes.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ventas en el mes de:");

        label_ConsultaDispo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_ConsultaDispo.setForeground(new java.awt.Color(255, 255, 255));
        label_ConsultaDispo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ConsultaDispo.setText("Calcular Ventas Por Meses");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecciona el mes al que deseas calcular las ventas: ");

        jButtonCalcularVentaxMes.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCalcularVentaxMes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonCalcularVentaxMes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalcularVentaxMes.setText("Consultar");

        mes_Seleccionado.setBackground(new java.awt.Color(29, 29, 29));
        mes_Seleccionado.setForeground(new java.awt.Color(255, 255, 255));
        mes_Seleccionado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        mes_Seleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mes_SeleccionadoActionPerformed(evt);
            }
        });

        label_CalculadoVentas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        label_CalculadoVentas.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label_ConsultaDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(mes_Seleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonCalcularVentaxMes))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jLabelMes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(label_CalculadoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label_ConsultaDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mes_Seleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalcularVentaxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(label_CalculadoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mes_SeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mes_SeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mes_SeleccionadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcularVentaxMes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_CalculadoVentas;
    private javax.swing.JLabel label_ConsultaDispo;
    private javax.swing.JComboBox<String> mes_Seleccionado;
    // End of variables declaration//GEN-END:variables
}