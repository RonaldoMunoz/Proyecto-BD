package habitaciones_paneles;

public class Panel_Check_In extends javax.swing.JPanel {

    public Panel_Check_In() {
        initComponents();
    }

    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButtonAsignar = new javax.swing.JButton();
        label_ConsultaDispo = new javax.swing.JLabel();
        jTextFied_idCliente = new javax.swing.JTextField();
        jTextFieldHabitacionAsignar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaListarReservas = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel_opcional = new javax.swing.JLabel();
        jLabel_NombreCliente = new javax.swing.JLabel();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(640, 640));
        setMinimumSize(new java.awt.Dimension(640, 640));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 640));

        jButtonAsignar.setBackground(new java.awt.Color(29, 29, 29));
        jButtonAsignar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonAsignar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAsignar.setText("Asignar");
        jButtonAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignarActionPerformed(evt);
            }
        });

        label_ConsultaDispo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_ConsultaDispo.setForeground(new java.awt.Color(255, 255, 255));
        label_ConsultaDispo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ConsultaDispo.setText("Asignar Habitacion");


        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero de la habitación que desea asignar:");

        jLabel6.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Identificacion del cliente");

        jButtonAceptar.setBackground(new java.awt.Color(29, 29, 29));
        jButtonAceptar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButtonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jTextAreaListarReservas.setBackground(new java.awt.Color(29, 29, 29));
        jTextAreaListarReservas.setColumns(20);
        jTextAreaListarReservas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextAreaListarReservas.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaListarReservas.setRows(5);
        jScrollPane1.setViewportView(jTextAreaListarReservas);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_opcional.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_opcional.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_opcional.setText("Habitaciones reservadas por el cliente:");

        jLabel_NombreCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_NombreCliente.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ConsultaDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFied_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_opcional)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldHabitacionAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jButtonAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label_ConsultaDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFied_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_opcional, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldHabitacionAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAsignar)
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }

    private String obtenerID(){
        return jTextFied_idCliente.getText();
    }

    private String obtenerHabitacion(){
        return jTextFieldHabitacionAsignar.getText();
    }

    private void limpiarCampos(){
        jTextFied_idCliente.setText("");
        jTextFieldHabitacionAsignar.setText("");
    }

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButtonAsignarActionPerformed(java.awt.event.ActionEvent  evt) {
        
    }

    


    // Variables declaration                   
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAsignar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_NombreCliente;
    private javax.swing.JLabel jLabel_opcional;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaListarReservas;
    private javax.swing.JTextField jTextFied_idCliente;
    private javax.swing.JTextField jTextFieldHabitacionAsignar;
    private javax.swing.JLabel label_ConsultaDispo;
    // End of variables declaration                   
}
