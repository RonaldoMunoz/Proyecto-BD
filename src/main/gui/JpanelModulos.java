package gui;



/**
 *
 * @author Ronaldo La bestia
 */
public class JpanelModulos extends javax.swing.JPanel implements CambiarPanel{


    public JpanelModulos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jButtonCheckIn = new javax.swing.JButton();
        jButtonCheckOut = new javax.swing.JButton();
        jButtonHabitacion = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        jButtonReservas = new javax.swing.JButton();
        jButtonBackTologin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonInformes = new javax.swing.JButton();
        labelUserWelcome = new javax.swing.JLabel();
        jButtonGestionarPerfiles = new javax.swing.JButton();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(810, 640));
        setMinimumSize(new java.awt.Dimension(810, 640));
        setPreferredSize(new java.awt.Dimension(810, 640));

        jButtonCheckIn.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCheckIn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonCheckIn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCheckIn.setText("Asignar Habitacion");
        jButtonCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckInActionPerformed(evt);
            }
        });

        jButtonCheckOut.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCheckOut.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCheckOut.setText("Check-Out");
        jButtonCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckOutActionPerformed(evt);
            }
        });
        

        jButtonHabitacion.setBackground(new java.awt.Color(29, 29, 29));
        jButtonHabitacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHabitacion.setText("Habitaciones");
        jButtonHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHabitacionActionPerformed(evt);
            }
        });

        jButtonCliente.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCliente.setText("Cliente");
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });

        jButtonReservas.setBackground(new java.awt.Color(29, 29, 29));
        jButtonReservas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonReservas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReservas.setText("Reservar");
        jButtonReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservasActionPerformed(evt);
            }
        });

        jButtonBackTologin.setBackground(new java.awt.Color(29, 29, 29));
        jButtonBackTologin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-izquierda.png"))); // NOI18N
        jButtonBackTologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackTologinActionPerformed(evt);
            }
        });
        
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edificio.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto Thin", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El Descanso");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));
        jPanel1.setMaximumSize(new java.awt.Dimension(640, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 640));
        jPanel1.setRequestFocusEnabled(false);

        jButtonInformes.setBackground(new java.awt.Color(29, 29, 29));
        jButtonInformes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonInformes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInformes.setText("Informes");
        jButtonInformes.setOpaque(true);
        jButtonInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformesActionPerformed(evt);
            }
        });

        labelUserWelcome.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelUserWelcome.setForeground(new java.awt.Color(255, 255, 255));
        labelUserWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUserWelcome.setText("Bienvenido al sistema del Hotel El Descanso");

        jButtonGestionarPerfiles.setBackground(new java.awt.Color(29, 29, 29));
        jButtonGestionarPerfiles.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonGestionarPerfiles.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGestionarPerfiles.setText("Gestionar Perfiles");
        jButtonGestionarPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarPerfilesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUserWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButtonInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGestionarPerfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUserWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGestionarPerfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(535, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButtonHabitacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButtonReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButtonCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButtonCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButtonBackTologin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jButtonCliente)
                                .addGap(8, 8, 8)
                                .addComponent(jButtonHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButtonReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButtonCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButtonCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel2)))
                        .addGap(150, 150, 150)
                        .addComponent(jButtonBackTologin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }

    private void jButtonInformesActionPerformed(java.awt.event.ActionEvent evt) {
        cambiarPanel(GUI_principal.panelReportes,GUI_principal.Bg);
    }

    private void jButtonBackTologinActionPerformed(java.awt.event.ActionEvent evt) {
       cambiarPanel(GUI_principal.panelInicio,GUI_principal.Bg);
    }


    private void jButtonCheckInActionPerformed(java.awt.event.ActionEvent evt) {
        cambiarPanelInt(GUI_principal.panelCheckIn,jPanel1);
        
    }

    private void jButtonCheckOutActionPerformed(java.awt.event.ActionEvent evt) {
        cambiarPanelInt(GUI_principal.panelCheckOut,jPanel1);
        
    }

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {
        cambiarPanel(GUI_principal.panelClientes,GUI_principal.Bg);
    }

    private void jButtonGestionarPerfilesActionPerformed(java.awt.event.ActionEvent evt) {
        cambiarPanel(GUI_principal.panelReportes,GUI_principal.Bg);
    }

    private void jButtonHabitacionActionPerformed(java.awt.event.ActionEvent evt) {
        cambiarPanel(GUI_principal.panelHabitaciones,GUI_principal.Bg);
    }

    private void jButtonReservasActionPerformed(java.awt.event.ActionEvent evt) {
        cambiarPanel(GUI_principal.panelReservaciones,GUI_principal.Bg);
    }




    // Variables declaration

    private javax.swing.JButton jButtonBackTologin;
    private javax.swing.JButton jButtonCheckIn;
    private javax.swing.JButton jButtonCheckOut;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonGestionarPerfiles;
    private javax.swing.JButton jButtonHabitacion;
    private javax.swing.JButton jButtonInformes;
    private javax.swing.JButton jButtonReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelUserWelcome;
    // End of variables declaration//GEN-END:variables
}
