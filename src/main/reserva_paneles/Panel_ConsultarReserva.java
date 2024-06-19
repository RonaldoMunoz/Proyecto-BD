
package reserva_paneles;

import db.Reserva;

/**
 *
 * @author maico
 */
public class Panel_ConsultarReserva extends javax.swing.JPanel {

    public Panel_ConsultarReserva() {
        initComponents();
    }

    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonMostrarReservar = new javax.swing.JButton();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(640, 640));
        setMinimumSize(new java.awt.Dimension(640, 640));
        setPreferredSize(new java.awt.Dimension(640, 640));

        jLabel7.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Consultar Reserva");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ingresa los siguientes datos:");

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Identificacion:");

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jButtonMostrarReservar.setBackground(new java.awt.Color(29, 29, 29));
        jButtonMostrarReservar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMostrarReservar.setText("Mostar Reserva");
        jButtonMostrarReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel7))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButtonMostrarReservar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButtonMostrarReservar))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

private void jButtonMostrarReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarReservarActionPerformed
    // Simulación de consulta de reserva
    String idReserva = jTextFieldID.getText(); // Obtener la identificación de la reserva
    if (!idReserva.isEmpty()) {
        // Realizar aquí la lógica de consulta de la reserva
        // Supongamos que la reserva se encuentra en una lista de reservas llamada 'listaReservas'
        boolean reservaEncontrada = false;
        for (Reserva reserva : "lista de las reservas que chito no tiene") {
            if (reserva.getId().equals(idReserva)) {
                // Mostrar la información de la reserva
                System.out.println("Reserva encontrada:");
                System.out.println(reserva);
                reservaEncontrada = true;
                break;
            }
        }
        if (!reservaEncontrada) {
            System.out.println("La reserva con ID " + idReserva + " no se encuentra.");
        }
    } else {
        System.out.println("Error: Debes ingresar la identificación de la reserva.");
    }
}//GEN-LAST:event_jButtonMostrarReservarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMostrarReservar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
