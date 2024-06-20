package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo La bestia
 */
public class JpanelModulos extends javax.swing.JPanel implements CambiarPanel{


    public JpanelModulos() {
        initComponents();
        jButtonGestionarPerfiles.setVisible(false);
    }


    private void initComponents() {

        jButtonGestionarPerfiles = new javax.swing.JButton();
        jButtonInformes = new javax.swing.JButton();
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
        labelUserWelcome = new javax.swing.JLabel();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(810, 640));
        setMinimumSize(new java.awt.Dimension(810, 640));
        setPreferredSize(new java.awt.Dimension(810, 640));
        setLayout(null);

        jButtonGestionarPerfiles.setBackground(new java.awt.Color(29, 29, 29));
        jButtonGestionarPerfiles.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonGestionarPerfiles.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGestionarPerfiles.setText("Gestionar Perfiles");
        add(jButtonGestionarPerfiles);
        jButtonGestionarPerfiles.setBounds(50, 450, 125, 22);
        jButtonGestionarPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarPerfilesActionPerformed(evt);
            }
        });

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
        add(jButtonInformes);
        jButtonInformes.setBounds(60, 416, 100, 20);

        jButtonCheckIn.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCheckIn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonCheckIn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCheckIn.setText("Check-In");
        add(jButtonCheckIn);
        jButtonCheckIn.setBounds(60, 390, 100, 20);
        jButtonCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckInActionPerformed(evt);
            }
        });

        jButtonCheckOut.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCheckOut.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCheckOut.setText("Check-Out");
        add(jButtonCheckOut);
        jButtonCheckOut.setBounds(60, 360, 100, 20);
        jButtonCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckOutActionPerformed(evt);
            }
        });

        jButtonHabitacion.setBackground(new java.awt.Color(29, 29, 29));
        jButtonHabitacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHabitacion.setText("Habitaciones");
        add(jButtonHabitacion);
        jButtonHabitacion.setBounds(60, 300, 120, 20);
        jButtonHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHabitacionActionPerformed(evt);
            }
        });

        jButtonCliente.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCliente.setText("Cliente");
        add(jButtonCliente);
        jButtonCliente.setBounds(62, 270, 100, 22);
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });

        jButtonReservas.setBackground(new java.awt.Color(29, 29, 29));
        jButtonReservas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonReservas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReservas.setText("Reservar");
        add(jButtonReservas);
        jButtonReservas.setBounds(60, 330, 100, 20);
        jButtonReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservasActionPerformed(evt);
            }
        }); 

        jButtonBackTologin.setBackground(new java.awt.Color(29, 29, 29));
        jButtonBackTologin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-izquierda.png"))); // NOI18N
        add(jButtonBackTologin);
        jButtonBackTologin.setBounds(70, 500, 100, 60);
        jButtonBackTologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackTologinActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(80, 190, 64, 64);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edificio.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(50, 10, 128, 130);

        jLabel2.setFont(new java.awt.Font("Roboto Thin", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El Descanso");
        add(jLabel2);
        jLabel2.setBounds(50, 150, 133, 29);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(874, 0, 230, 640);

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));
        jPanel1.setMaximumSize(new java.awt.Dimension(640, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 640));
        jPanel1.setRequestFocusEnabled(false);

        labelUserWelcome.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelUserWelcome.setForeground(new java.awt.Color(255, 255, 255));
        labelUserWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUserWelcome.setText("Bienvenido al sistema del Hotel El Descanso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUserWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUserWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(588, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(228, 0, 640, 640);
    }

    private void jButtonInformesActionPerformed(java.awt.event.ActionEvent evt) {
        if(Usuario.generarInforme == true){
            cambiarPanel(GUI_principal.panelReportes,GUI_principal.Bg);
        }
        else {
            JOptionPane.showMessageDialog(null, "No tiene permisos para acceder a esta opción");
        }
        
    }

    private void jButtonBackTologinActionPerformed(java.awt.event.ActionEvent evt) {
       cambiarPanel(GUI_principal.panelInicio,GUI_principal.Bg);
       Usuario.resetPrivilegios();
    }


    private void jButtonCheckInActionPerformed(java.awt.event.ActionEvent evt) {
        int seleccion = JOptionPane.showInternalOptionDialog(null, "¿Haz realizado la reserva?", "Registro de servicios", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
        if( seleccion == 1){
            cambiarPanelInt(GUI_principal.panelNoReserva,jPanel1);
            return;
        }
        if(Usuario.registrarServSolicitados == true){
            cambiarPanelInt(GUI_principal.panelCheckIn,jPanel1);
        }
        else {
            JOptionPane.showMessageDialog(null, "No tiene permisos para acceder a esta opción");
        }
        
        
    }

    private void jButtonCheckOutActionPerformed(java.awt.event.ActionEvent evt) {
        if(Usuario.checkOut == true){
            cambiarPanelInt(GUI_principal.panelCheckOut,jPanel1);
        }
        else {
            JOptionPane.showMessageDialog(null, "No tiene permisos para acceder a esta opción");
        }
        
    }

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {
        
        cambiarPanel(GUI_principal.panelClientes,GUI_principal.Bg);
    }

    private void jButtonGestionarPerfilesActionPerformed(java.awt.event.ActionEvent evt) {
        cambiarPanel(GUI_principal.panelPerfiles,GUI_principal.Bg);
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
    // End of variables declaration
}
