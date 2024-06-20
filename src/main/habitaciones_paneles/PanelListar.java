/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package habitaciones_paneles;

import java.awt.event.ActionEvent;
import java.sql.Date;

import db.Habitaciones;

/**
 *
 * @author usuario
 */

public class PanelListar extends javax.swing.JPanel {

    public PanelListar() {
        initComponents();
    }

    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jCoBoxTipoHabitacion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldFechaSalida = new javax.swing.JTextField();
        jTextFieldFechaInicio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonListarHabitaciones1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextConsultaReserva = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(640, 640));
        setMinimumSize(new java.awt.Dimension(640, 640));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 640));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Habitaciones Disponibles");
        add(jLabel2);
        jLabel2.setBounds(692, 10, 640, 22);

        jCoBoxTipoHabitacion.setBackground(new java.awt.Color(29, 29, 29));
        jCoBoxTipoHabitacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jCoBoxTipoHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jCoBoxTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sencilla", "doble", "matrimonial", "suite sencilla","suite presidencial" }));
        add(jCoBoxTipoHabitacion);
        jCoBoxTipoHabitacion.setBounds(90, 90, 72, 21);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de habitacion:");
        add(jLabel1);
        jLabel1.setBounds(70, 60, 117, 17);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkLista.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(310, 60, 70, 70);
        add(jSeparator1);
        jSeparator1.setBounds(0, 40, 650, 20);
        add(jTextFieldFechaSalida);
        jTextFieldFechaSalida.setBounds(300, 170, 64, 22);
        add(jTextFieldFechaInicio);
        jTextFieldFechaInicio.setBounds(300, 220, 64, 22);

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Selecciona la fecha de inicio (A/M/D)");
        add(jLabel8);
        jLabel8.setBounds(70, 220, 199, 15);

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Selecciona la fecha de salida (A/M/D)");
        add(jLabel9);
        jLabel9.setBounds(70, 170, 203, 15);

        jButtonListarHabitaciones1.setBackground(new java.awt.Color(29, 29, 29));
        jButtonListarHabitaciones1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonListarHabitaciones1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListarHabitaciones1.setText("Listar");
        add(jButtonListarHabitaciones1);
        jButtonListarHabitaciones1.setBounds(90, 120, 72, 22);
        jButtonListarHabitaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarHabitacionesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Habitaciones Disponibles en la fecha indicada");
        add(jLabel6);
        jLabel6.setBounds(0, 260, 510, 22);

        jTextConsultaReserva.setBackground(new java.awt.Color(29, 29, 29));
        jTextConsultaReserva.setColumns(20);
        jTextConsultaReserva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextConsultaReserva.setForeground(new java.awt.Color(255, 255, 255));
        jTextConsultaReserva.setRows(5);
        jScrollPane2.setViewportView(jTextConsultaReserva);

        add(jScrollPane2);
        jScrollPane2.setBounds(60, 290, 430, 290);

        jLabel10.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Habitaciones Disponibles");
        add(jLabel10);
        jLabel10.setBounds(230, 10, 202, 22);

    }

    private void jButtonListarHabitacionesActionPerformed(ActionEvent evt) {
        setHabitacionesDisponibles(Habitaciones.mostrarHabitacion(getTipoHabitacion(), Date.valueOf(getFechaInicio()), Date.valueOf(getFechaSalida())));
    }

    private String getTipoHabitacion() {
        return jCoBoxTipoHabitacion.getSelectedItem().toString();
    }

    private String getFechaInicio(){
        return jTextFieldFechaInicio.getText();
    }

    private String getFechaSalida(){
        return jTextFieldFechaSalida.getText();
    }


    private void setHabitacionesDisponibles(String habitaciones) {
        jTextConsultaReserva.setText(habitaciones);
    }
    

    // Variables declaration 
    private javax.swing.JButton jButtonListarHabitaciones1;
    private javax.swing.JComboBox<String> jCoBoxTipoHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextConsultaReserva;
    private javax.swing.JTextField jTextFieldFechaInicio;
    private javax.swing.JTextField jTextFieldFechaSalida;
    
    // End of variables declaration
}
