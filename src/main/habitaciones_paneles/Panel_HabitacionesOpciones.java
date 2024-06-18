/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package habitaciones_paneles;

import java.awt.event.ActionEvent;

import gui.GUI_principal;
import gui.CambiarPanel;

/**
 *
 * @author El singaparao Ronaldo
 */
public class Panel_HabitacionesOpciones extends javax.swing.JPanel implements CambiarPanel {


    public Panel_HabitacionesOpciones() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
 
    private void initComponents() {

        jButtonServiciosDeHabitacion = new javax.swing.JButton();
        jButtonListarHabitaciones = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonConsultarPrecio = new javax.swing.JButton();
        jButtonModificarPrecio = new javax.swing.JButton();
        jButtonCambiarEstado1 = new javax.swing.JButton();
        jButtonVerificarDispo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_Interno_Options = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(810, 640));
        setMinimumSize(new java.awt.Dimension(810, 640));
        setPreferredSize(new java.awt.Dimension(810, 640));

        jButtonServiciosDeHabitacion.setBackground(new java.awt.Color(29, 29, 29));
        jButtonServiciosDeHabitacion.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonServiciosDeHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonServiciosDeHabitacion.setText("Servicios Ofrecidos");
        jButtonServiciosDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServiciosDeHabitacionActionPerformed(evt);
            }

            private void jButtonServiciosDeHabitacionActionPerformed(ActionEvent evt) {
              cambiarPanelInt(panelListarServicios, panel_Interno_Options);
            }
        });

        jButtonListarHabitaciones.setBackground(new java.awt.Color(29, 29, 29));
        jButtonListarHabitaciones.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonListarHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListarHabitaciones.setText("Buscar Habitaciones");
        jButtonListarHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarHabitacionesActionPerformed(evt);
            }
        });

        jButtonBack.setBackground(new java.awt.Color(29, 29, 29));
        jButtonBack.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-izquierda.png"))); // NOI18N
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack(evt);
            }
        });
        jButtonConsultarPrecio.setBackground(new java.awt.Color(29, 29, 29));
        jButtonConsultarPrecio.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonConsultarPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarPrecio.setText("Consultar Precio");
        jButtonConsultarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarPrecioActionPerformed(evt);
            }
        });

        jButtonModificarPrecio.setBackground(new java.awt.Color(29, 29, 29));
        jButtonModificarPrecio.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonModificarPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarPrecio.setText("Modificar Precio");
        jButtonModificarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarPrecioPerformed(evt);
            }

        });

        jButtonCambiarEstado1.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCambiarEstado1.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonCambiarEstado1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCambiarEstado1.setText("Cambiar Estado Habitacion");
        jButtonCambiarEstado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarEstado1ActionPerformed(evt);
            }

            private void jButtonCambiarEstado1ActionPerformed(ActionEvent evt) {
                panelVerificarDispo.cambiarEstado();
                cambiarPanelInt(panelVerificarDispo, panel_Interno_Options);
            }
        });

        jButtonVerificarDispo.setBackground(new java.awt.Color(29, 29, 29));
        jButtonVerificarDispo.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonVerificarDispo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerificarDispo.setText("Verificar Estado Habitacion");
        jButtonVerificarDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarDispoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Habitaciones");

        jLabel2.setFont(new java.awt.Font("Roboto Thin", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El Descanso");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edificio.png"))); // NOI18N

        panel_Interno_Options.setBackground(new java.awt.Color(29, 29, 29));
        panel_Interno_Options.setMaximumSize(new java.awt.Dimension(640, 640));
        panel_Interno_Options.setMinimumSize(new java.awt.Dimension(640, 640));
        panel_Interno_Options.setName(""); // NOI18N
        panel_Interno_Options.setPreferredSize(new java.awt.Dimension(640, 640));

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonVerificarDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonServiciosDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonModificarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonConsultarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonCambiarEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonListarHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(panel_Interno_Options, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jButtonVerificarDispo)
                .addGap(136, 136, 136)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jButtonServiciosDeHabitacion))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jButtonModificarPrecio))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jButtonConsultarPrecio))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jButtonCambiarEstado1))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jButtonListarHabitaciones))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_Interno_Options, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }

    private void jButtonBack(ActionEvent evt) {
        cambiarPanel(GUI_principal.modulosPanel, GUI_principal.Bg);
        
    }

    private void jButtonListarHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {
        cambiarPanelInt(panelListarHabitaciones,panel_Interno_Options);
    }

    private void jButtonVerificarDispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarDispoActionPerformed
        panelVerificarDispo.verificarDispo();
        cambiarPanelInt(panelVerificarDispo,panel_Interno_Options);
    }

    private void jButtonConsultarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarPrecioActionPerformed
        // ocultar lo que no es de consultar Precio
        panelConsultarPrecio.ocultarModPrecio();
        cambiarPanelInt(panelConsultarPrecio,panel_Interno_Options);
    }

    private void jButtonModificarPrecioPerformed(ActionEvent evt) {
        //ocultar lo que no es de modificarPrecio
        panelConsultarPrecio.ocultarConsultaPrecio();
        cambiarPanelInt(panelConsultarPrecio, panel_Interno_Options);
    }

    // Variables declaration 
    public static PanelListar panelListarHabitaciones = new PanelListar();
    private PanelListarServicios panelListarServicios = new PanelListarServicios();
    private Panel_Check_In panelCheckIn = new Panel_Check_In();
    private ConsultarPrecio_Panel panelConsultarPrecio = new ConsultarPrecio_Panel();
    private PanelVerificar_CambiarEstado panelVerificarDispo = new PanelVerificar_CambiarEstado();
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCambiarEstado1;
    private javax.swing.JButton jButtonConsultarPrecio;
    private javax.swing.JButton jButtonListarHabitaciones;
    private javax.swing.JButton jButtonModificarPrecio;
    private javax.swing.JButton jButtonServiciosDeHabitacion;
    private javax.swing.JButton jButtonVerificarDispo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public  javax.swing.JPanel panel_Interno_Options;
    // End of variables declaration//GEN-END:variables
}
