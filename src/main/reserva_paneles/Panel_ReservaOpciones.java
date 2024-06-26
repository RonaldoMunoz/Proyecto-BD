/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package reserva_paneles;

import gui.GUI_principal;
import gui.Usuario;

import javax.swing.JOptionPane;

import gui.CambiarPanel;


/**
 *
 * @author maico
 */
public class Panel_ReservaOpciones extends javax.swing.JPanel implements CambiarPanel {

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

        jButtonAtrasReserva.setBackground(new java.awt.Color(29, 29, 29));
        jButtonAtrasReserva.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtrasReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        jButtonAtrasReserva.setToolTipText("");
        jButtonAtrasReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasReservaActionPerformed(evt);
            }

            private void jButtonAtrasReservaActionPerformed(java.awt.event.ActionEvent evt) {
               cambiarPanel(GUI_principal.modulosPanel,GUI_principal.Bg);
            }
        });        

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edificio.png"))); // NOI18N

        jButtonCancelarReserva.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCancelarReserva.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonCancelarReserva.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarReserva.setText("Cancelar Reserva");
        jButtonCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarReservaActionPerformed(evt);
            }
        });

        jButtonHacerReserva.setBackground(new java.awt.Color(29, 29, 29));
        jButtonHacerReserva.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonHacerReserva.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHacerReserva.setText("Hacer Reserva");
        jButtonHacerReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHacerReservaActionPerformed(evt);
            }
        });

        jLabelReserva.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelReserva.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReserva.setText("Reservas");

        jLabelNameHotel.setFont(new java.awt.Font("Roboto Thin", 3, 24)); // NOI18N
        jLabelNameHotel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameHotel.setText("El Descanso");

        jButtonConsultarReserva.setBackground(new java.awt.Color(29, 29, 29));
        jButtonConsultarReserva.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonConsultarReserva.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarReserva.setText("Consultar Reserva");
        jButtonConsultarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarReservaActionPerformed(evt);
            }
        });

        panel_Interno_Options.setBackground(new java.awt.Color(29, 29, 29));
        panel_Interno_Options.setMaximumSize(new java.awt.Dimension(640, 580));
        panel_Interno_Options.setMinimumSize(new java.awt.Dimension(640, 580));
        panel_Interno_Options.setName(""); // NOI18N
        panel_Interno_Options.setPreferredSize(new java.awt.Dimension(640, 580));

        javax.swing.GroupLayout panel_Interno_OptionsLayout = new javax.swing.GroupLayout(panel_Interno_Options);
        panel_Interno_Options.setLayout(panel_Interno_OptionsLayout);
        panel_Interno_OptionsLayout.setHorizontalGroup(
            panel_Interno_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_Interno_OptionsLayout.setVerticalGroup(
            panel_Interno_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        jLabelFondoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonAtrasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabelReserva))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButtonConsultarReserva))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabelLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabelNameHotel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButtonCancelarReserva))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButtonHacerReserva))
                    .addComponent(jLabelFondoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(panel_Interno_Options, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(jButtonAtrasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabelReserva))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jButtonConsultarReserva))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabelNameHotel))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jButtonCancelarReserva))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jButtonHacerReserva))
            .addComponent(jLabelFondoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_Interno_Options, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarReservaActionPerformed(java.awt.event.ActionEvent evt) {
        cambiarPanelInt(Panel_ConsultarReserva , panel_Interno_Options);
    }//GEN-LAST:event_jButtonConsultarReservaActionPerformed

    private void jButtonCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {
        if(Usuario.cancelarReserva == false){
            JOptionPane.showMessageDialog(null, "No tienes permisos para cancelar reservas");
            return;
        }
        cambiarPanelInt(Panel_CancelarReserva , panel_Interno_Options);
    }//GEN-LAST:event_jButtonCancelarReservaActionPerformed

    private void jButtonHacerReservaActionPerformed(java.awt.event.ActionEvent evt) {
        if(Usuario.registrarReserva == false){
            JOptionPane.showMessageDialog(null, "No tienes permisos para hacer reservas");
            return;
        }
        cambiarPanelInt(Panel_HacerReserva , panel_Interno_Options);
    }


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
    private Panel_ConsultarReserva Panel_ConsultarReserva = new Panel_ConsultarReserva();
    private Panel_CancelarReserva Panel_CancelarReserva = new Panel_CancelarReserva();
    private Panel_HacerReserva Panel_HacerReserva = new Panel_HacerReserva();
    // End of variables declaration//GEN-END:variables
}
