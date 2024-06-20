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

    /**
     * Creates new form PanelListar
     */
    public PanelListar() {
        initComponents();
    }

    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCoBoxTipoHabitacion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonListarHabitaciones = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextHabitacionesDisponible = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jCoBoxTipoHabitacion1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonListarHabitaciones1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextHabitacionesDisponible1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldFechaInicio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldFechaSalida = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(640, 640));
        setMinimumSize(new java.awt.Dimension(640, 640));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 640));

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Habitaciones Disponibles");

        jCoBoxTipoHabitacion.setBackground(new java.awt.Color(29, 29, 29));
        jCoBoxTipoHabitacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jCoBoxTipoHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jCoBoxTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de habitacion:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkLista.png"))); // NOI18N

        jButtonListarHabitaciones.setBackground(new java.awt.Color(29, 29, 29));
        jButtonListarHabitaciones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonListarHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListarHabitaciones.setText("Listar");

        jTextHabitacionesDisponible.setBackground(new java.awt.Color(29, 29, 29));
        jTextHabitacionesDisponible.setColumns(20);
        jTextHabitacionesDisponible.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextHabitacionesDisponible.setForeground(new java.awt.Color(255, 255, 255));
        jTextHabitacionesDisponible.setRows(5);
        jScrollPane1.setViewportView(jTextHabitacionesDisponible);

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));
        jPanel1.setMaximumSize(new java.awt.Dimension(640, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 640));
        jPanel1.setName(""); // NOI18N

        jCoBoxTipoHabitacion1.setBackground(new java.awt.Color(29, 29, 29));
        jCoBoxTipoHabitacion1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jCoBoxTipoHabitacion1.setForeground(new java.awt.Color(255, 255, 255));
        jCoBoxTipoHabitacion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sencilla", "doble", "matrimonial", "suite sencilla","suite presidencial" }));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de habitacion:");

        jLabel6.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Habitaciones Disponibles");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkLista.png"))); // NOI18N

        jButtonListarHabitaciones1.setBackground(new java.awt.Color(29, 29, 29));
        jButtonListarHabitaciones1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonListarHabitaciones1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListarHabitaciones1.setText("Listar");
        jButtonListarHabitaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarHabitacionesActionPerformed(evt);
            }
        }); 

        jTextHabitacionesDisponible1.setBackground(new java.awt.Color(29, 29, 29));
        jTextHabitacionesDisponible1.setColumns(20);
        jTextHabitacionesDisponible1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextHabitacionesDisponible1.setForeground(new java.awt.Color(255, 255, 255));
        jTextHabitacionesDisponible1.setRows(5);
        jScrollPane2.setViewportView(jTextHabitacionesDisponible1);

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Selecciona la fecha de inicio (A/M/D)");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Selecciona la fecha de salida (A/M/D)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonListarHabitaciones1)
                    .addComponent(jCoBoxTipoHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jTextFieldFechaSalida)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(7, 7, 7)
                .addComponent(jCoBoxTipoHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListarHabitaciones1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jCoBoxTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarHabitaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)))
                .addGap(10, 10, 10)
                .addComponent(jCoBoxTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButtonListarHabitaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
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
        jTextHabitacionesDisponible1.setText(habitaciones);
    }
    

    // Variables declaration 
    private javax.swing.JButton jButtonListarHabitaciones;
    private javax.swing.JButton jButtonListarHabitaciones1;
    private javax.swing.JComboBox<String> jCoBoxTipoHabitacion;
    private javax.swing.JComboBox<String> jCoBoxTipoHabitacion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldFechaInicio;
    private javax.swing.JTextField jTextFieldFechaSalida;
    private javax.swing.JTextArea jTextHabitacionesDisponible;
    private javax.swing.JTextArea jTextHabitacionesDisponible1;
    
    // End of variables declaration
}
