/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gestionarPerfiles;

/**
 *
 * @author usuario
 */
public class PanelEliminarUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form PanelEliminarUsuarios
     */
    public PanelEliminarUsuarios() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        perfilUser = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButtonCambiarRol = new javax.swing.JButton();
        jTextFieldUserName = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selecciona el Rol de usuario que deseas eliminar");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 160, 330, 17);

        perfilUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(perfilUser);
        perfilUser.setBounds(290, 190, 72, 22);

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingresa el nombre de usuario");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(230, 230, 220, 17);

        jButtonCambiarRol.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButtonCambiarRol.setText("Realizar");
        jButtonCambiarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarRolActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCambiarRol);
        jButtonCambiarRol.setBounds(270, 300, 120, 30);

        jTextFieldUserName.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldUserName);
        jTextFieldUserName.setBounds(280, 260, 100, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCambiarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCambiarRolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCambiarRol;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JComboBox<String> perfilUser;
    // End of variables declaration//GEN-END:variables
}
