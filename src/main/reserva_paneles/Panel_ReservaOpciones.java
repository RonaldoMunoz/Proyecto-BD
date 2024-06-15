/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package reserva_paneles;

/**
 *
 * @author maico
 */
public class Panel_ReservaOpciones extends javax.swing.JPanel {

    /**
     * Creates new form Panel_ReservaOpciones
     */
    public Panel_ReservaOpciones() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        jButtonAtrasReserva = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jButtonCancelarReserva = new javax.swing.JButton();
        jButtonHacerReserva = new javax.swing.JButton();
        jLabelReserva = new javax.swing.JLabel();
        jLabelNameHotel = new javax.swing.JLabel();
        jButtonConsultarReserva = new javax.swing.JButton();
        panel_Interno_Options = new javax.swing.JPanel();
        jLabelFondoAzul = new javax.swing.JLabel();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(810, 640));
        setMinimumSize(new java.awt.Dimension(810, 640));
        setPreferredSize(new java.awt.Dimension(810, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAtrasReserva.setBackground(new java.awt.Color(29, 29, 29));
        jButtonAtrasReserva.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtrasReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        jButtonAtrasReserva.setToolTipText("");
        add(jButtonAtrasReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 60, 30));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edificio.png"))); // NOI18N
        add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 130));

        jButtonCancelarReserva.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCancelarReserva.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonCancelarReserva.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarReserva.setText("Cancelar Reserva");
        jButtonCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarReservaActionPerformed(evt);
            }
        });
        add(jButtonCancelarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jButtonHacerReserva.setBackground(new java.awt.Color(29, 29, 29));
        jButtonHacerReserva.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonHacerReserva.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHacerReserva.setText("Hacer Reserva");
        jButtonHacerReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHacerReservaActionPerformed(evt);
            }
        });
        add(jButtonHacerReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabelReserva.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelReserva.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReserva.setText("Reservas");
        add(jLabelReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabelNameHotel.setFont(new java.awt.Font("Roboto Thin", 3, 24)); // NOI18N
        jLabelNameHotel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameHotel.setText("El Descanso");
        add(jLabelNameHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jButtonConsultarReserva.setBackground(new java.awt.Color(29, 29, 29));
        jButtonConsultarReserva.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonConsultarReserva.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarReserva.setText("Consultar Reserva");
        jButtonConsultarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarReservaActionPerformed(evt);
            }
        });
        add(jButtonConsultarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        panel_Interno_Options.setBackground(new java.awt.Color(29, 29, 29));
        panel_Interno_Options.setMaximumSize(new java.awt.Dimension(640, 580));
        panel_Interno_Options.setMinimumSize(new java.awt.Dimension(640, 580));
        panel_Interno_Options.setName(""); // NOI18N
        panel_Interno_Options.setPreferredSize(new java.awt.Dimension(640, 580));

        javax.swing.GroupLayout panel_Interno_OptionsLayout = new javax.swing.GroupLayout(panel_Interno_Options);
        panel_Interno_Options.setLayout(panel_Interno_OptionsLayout);
        panel_Interno_OptionsLayout.setHorizontalGroup(
            panel_Interno_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        panel_Interno_OptionsLayout.setVerticalGroup(
            panel_Interno_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        add(panel_Interno_Options, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 580, 640));

        jLabelFondoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        add(jLabelFondoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 640));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarReservaActionPerformed

    private void jButtonCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarReservaActionPerformed

    private void jButtonHacerReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHacerReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHacerReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonAtrasReserva;
    private javax.swing.JButton jButtonCancelarReserva;
    private javax.swing.JButton jButtonConsultarReserva;
    private javax.swing.JButton jButtonHacerReserva;
    private javax.swing.JLabel jLabelFondoAzul;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNameHotel;
    private javax.swing.JLabel jLabelReserva;
    private javax.swing.JPanel panel_Interno_Options;
    // End of variables declaration//GEN-END:variables
}
