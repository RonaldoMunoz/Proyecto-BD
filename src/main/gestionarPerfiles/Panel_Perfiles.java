
package gestionarPerfiles;
import gui.CambiarPanel;
import gui.GUI_principal;
/**
 *
 * @author usuario
 */
public class Panel_Perfiles extends javax.swing.JPanel implements CambiarPanel {

    /**
     * Creates new form Panel_Perfiles
     */
    public Panel_Perfiles() {
        initComponents();
    }



    private void initComponents() {

        jButtonAtrasReserva = new javax.swing.JButton();
        jButtonEliminarUsuario1 = new javax.swing.JButton();
        jButtonEliminarUsuario = new javax.swing.JButton();
        jButtonModificarPrivilegios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setLayout(null);

        jButtonAtrasReserva.setBackground(new java.awt.Color(29, 29, 29));
        jButtonAtrasReserva.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtrasReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        jButtonAtrasReserva.setToolTipText("");
        jButtonAtrasReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasReservaActionPerformed(evt);
            }
        });
        add(jButtonAtrasReserva);
        jButtonAtrasReserva.setBounds(80, 550, 60, 30);

        jButtonEliminarUsuario1.setBackground(new java.awt.Color(29, 29, 29));
        jButtonEliminarUsuario1.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonEliminarUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarUsuario1.setText("Agregar Usuario");
        jButtonEliminarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarUsuario1ActionPerformed(evt);
            }
        });
        add(jButtonEliminarUsuario1);
        jButtonEliminarUsuario1.setBounds(20, 340, 180, 24);

        jButtonEliminarUsuario.setBackground(new java.awt.Color(29, 29, 29));
        jButtonEliminarUsuario.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarUsuario.setText("Eliminar Usuario");
        jButtonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarUsuarioActionPerformed(evt);
            }
        });
        add(jButtonEliminarUsuario);
        jButtonEliminarUsuario.setBounds(20, 300, 180, 24);

        jButtonModificarPrivilegios.setBackground(new java.awt.Color(29, 29, 29));
        jButtonModificarPrivilegios.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonModificarPrivilegios.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarPrivilegios.setText("Cambiar Rol de usuario");
        jButtonModificarPrivilegios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarPrivilegiosActionPerformed(evt);
            }
        });
        add(jButtonModificarPrivilegios);
        jButtonModificarPrivilegios.setBounds(20, 260, 180, 24);

        jLabel2.setFont(new java.awt.Font("Roboto Thin", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El Descanso");
        add(jLabel2);
        jLabel2.setBounds(50, 150, 133, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edificio.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(50, 10, 128, 128);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(-10, 0, 230, 650);

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));

        jPanel2.setBackground(new java.awt.Color(29, 29, 29));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(220, 0, 590, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModificarPrivilegiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarPrivilegiosActionPerformed
        cambiarPanelInt(panelCambiarRol, jPanel2);
    }

    private void jButtonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarUsuarioActionPerformed
        cambiarPanelInt(panelEliminarUsuario, jPanel2);
    }

    private void jButtonEliminarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarUsuario1ActionPerformed
        cambiarPanelInt(panelAgregarUsuario, jPanel2);
    }

    private void jButtonAtrasReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasReservaActionPerformed
        cambiarPanel(GUI_principal.modulosPanel, GUI_principal.Bg);
    }


    // Variables declaration 
    private PanelAgregarUsuario panelAgregarUsuario = new PanelAgregarUsuario();
    private PanelEliminarUsuarios panelEliminarUsuario = new PanelEliminarUsuarios();
    private PanelCambiarRol panelCambiarRol = new PanelCambiarRol();
    private javax.swing.JButton jButtonAtrasReserva;
    private javax.swing.JButton jButtonEliminarUsuario;
    private javax.swing.JButton jButtonEliminarUsuario1;
    private javax.swing.JButton jButtonModificarPrivilegios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
