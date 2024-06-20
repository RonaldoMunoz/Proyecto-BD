
package habitaciones_paneles;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import db.Habitaciones;


public class PanelVerificar_CambiarEstado extends javax.swing.JPanel {


    public PanelVerificar_CambiarEstado() {
        initComponents();
    }

    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButtonConsultarEstado = new javax.swing.JButton();
        label_ConsultaDispo = new javax.swing.JLabel();
        label_ConsultaDispo1 = new javax.swing.JLabel();
        jTextFieldPrecioNuevo = new javax.swing.JTextField();
        jButtonCambiarEstado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        group.add(jRadioButton1);
        group.add(jRadioButton2);
        group.add(jRadioButton3);
        
        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(640, 640));
        setMinimumSize(new java.awt.Dimension(640, 640));
        setPreferredSize(new java.awt.Dimension(640, 640));

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Disponibilidad de Habitacion");

        jButtonConsultarEstado.setBackground(new java.awt.Color(29, 29, 29));
        jButtonConsultarEstado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonConsultarEstado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarEstado.setText("Consultar");
        jButtonConsultarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarEstadoActionPerformed(evt);
            }
        });

        label_ConsultaDispo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_ConsultaDispo.setForeground(new java.awt.Color(255, 255, 255));
        label_ConsultaDispo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ConsultaDispo.setText("Cambiar Estado de la Habitación.");

        label_ConsultaDispo1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        label_ConsultaDispo1.setForeground(new java.awt.Color(255, 255, 255));

        jButtonCambiarEstado.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCambiarEstado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonCambiarEstado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCambiarEstado.setText("Cambiar");
        jButtonCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarEstadoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresa el numero de la habitación: ");

        jRadioButton1.setForeground(new java.awt.Color(29, 29, 29));
        jRadioButton1.setText("Ocupada");

        jRadioButton2.setForeground(new java.awt.Color(29, 29, 29));
        jRadioButton2.setText("Reservada");

        jRadioButton3.setForeground(new java.awt.Color(29, 29, 29));
        jRadioButton3.setText("Cancelada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_ConsultaDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTextFieldPrecioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonConsultarEstado))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton1))
                    .addComponent(label_ConsultaDispo1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jRadioButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jRadioButton3)
                .addGap(51, 51, 51)
                .addComponent(jButtonCambiarEstado))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_ConsultaDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPrecioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarEstado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(label_ConsultaDispo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jRadioButton2)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jButtonCambiarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }


    //                     ACTION LISTENERS

    private void jButtonCambiarEstadoActionPerformed (ActionEvent evt){
        
        Boolean flag = Habitaciones.modificarEstado(obtenerNumHabitacion(), obtenerEstadoSeleccionado());
        if (flag) {
            JOptionPane.showMessageDialog(this, "Estado Cambiado Exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al Cambiar Estado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButtonConsultarEstadoActionPerformed(ActionEvent evt) {

        String consulta = Habitaciones.consultarEstado(obtenerNumHabitacion());
        setEstado(consulta);
        
    }


    private String obtenerEstadoSeleccionado(){
        if (jRadioButton1.isSelected()) {
            return jRadioButton1.getText();
        } else if (jRadioButton2.isSelected()) {
            return jRadioButton2.getText();
        } else if (jRadioButton3.isSelected()) {
            return  jRadioButton3.getText();
        }
        else  {
            JOptionPane.showMessageDialog(this,"Seleccione Una Opcion Valida", "Error", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Seleccione Una Opcion Valida");
        }
    }

    public void verificarDispo() {
            jLabel1.setVisible(true);
            jButtonConsultarEstado.setVisible(true);
            jButtonCambiarEstado.setVisible(false);
            label_ConsultaDispo.setVisible(false);
            this.repaint();
    }

    public void cambiarEstado(){
        label_ConsultaDispo.setVisible(true);
        jButtonCambiarEstado.setVisible(true);
        jButtonConsultarEstado.setVisible(false);
        jLabel1.setVisible(false);
        this.repaint();
    }

    public Integer obtenerNumHabitacion(){
        return Integer.parseInt(jTextFieldPrecioNuevo.getText());
    }

    public void setEstado(String estado){
        if (estado.equals("Ocupada")) {
            jRadioButton1.setSelected(true);
        } else if (estado.equals("Reservada")) {
            jRadioButton2.setSelected(true);
        } else if (estado.equals("Cancelada")) {
            jRadioButton3.setSelected(true);
        }
    }

    



    //                                                     Variables declaration 
    private ButtonGroup group = new ButtonGroup();
    private javax.swing.JButton jButtonCambiarEstado;
    private javax.swing.JButton jButtonConsultarEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1; // ocupado
    private javax.swing.JRadioButton jRadioButton2; // reservado
    private javax.swing.JRadioButton jRadioButton3; // disponible
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldPrecioNuevo; // num habitacion
    private javax.swing.JLabel label_ConsultaDispo;
    private javax.swing.JLabel label_ConsultaDispo1;
    //                                                      End of variables declaration
}
