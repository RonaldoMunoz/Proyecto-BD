/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package informes_paneles;

/**
 *
 * @author usuario
 */
public class Informes_Opciones extends javax.swing.JPanel {

    /**
     * Creates new form Informes_Opciones
     */
    public Informes_Opciones() {
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

        jButtonBack = new javax.swing.JButton();
        jButtonInfoGeneral = new javax.swing.JButton();
        jButtonConsolidado = new javax.swing.JButton();
        jButtonVentas_x_mes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(810, 640));
        setMinimumSize(new java.awt.Dimension(810, 640));
        setPreferredSize(new java.awt.Dimension(810, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBack.setBackground(new java.awt.Color(29, 29, 29));
        jButtonBack.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-izquierda.png"))); // NOI18N
        add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 120, 50));

        jButtonInfoGeneral.setBackground(new java.awt.Color(29, 29, 29));
        jButtonInfoGeneral.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonInfoGeneral.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInfoGeneral.setText("Informe General");
        jButtonInfoGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoGeneralActionPerformed(evt);
            }
        });
        add(jButtonInfoGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 200, -1));

        jButtonConsolidado.setBackground(new java.awt.Color(29, 29, 29));
        jButtonConsolidado.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonConsolidado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsolidado.setText("Consolidado servicios");
        jButtonConsolidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsolidadoActionPerformed(evt);
            }
        });
        add(jButtonConsolidado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, -1));

        jButtonVentas_x_mes.setBackground(new java.awt.Color(29, 29, 29));
        jButtonVentas_x_mes.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonVentas_x_mes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVentas_x_mes.setText("Calcular las ventas");
        jButtonVentas_x_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentas_x_mesActionPerformed(evt);
            }
        });
        add(jButtonVentas_x_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 180, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Informes");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Thin", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El Descanso");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edificio.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 640));

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));

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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVentas_x_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentas_x_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVentas_x_mesActionPerformed

    private void jButtonConsolidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsolidadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsolidadoActionPerformed

    private void jButtonInfoGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonInfoGeneralActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonConsolidado;
    private javax.swing.JButton jButtonInfoGeneral;
    private javax.swing.JButton jButtonVentas_x_mes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
