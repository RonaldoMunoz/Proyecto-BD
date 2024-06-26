
package CheckOut_paneles;

import java.sql.Date;
import java.sql.Time;
import javax.swing.JOptionPane;

import db.CheckOut;


/**
 *
 * @author maico
 */
public class Panel_CheckOut extends javax.swing.JPanel {


    public Panel_CheckOut() {
        initComponents();
    }

    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldHABITACION = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldHora = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jButtonGenerarFactura = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextFactura = new javax.swing.JTextArea();
        
        
        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(640, 640));
        setMinimumSize(new java.awt.Dimension(640, 640));
        setPreferredSize(new java.awt.Dimension(640, 640));
        setLayout(null);

        jLabel7.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Check-out");
        add(jLabel7);
        jLabel7.setBounds(280, 10, 83, 22);
        add(jSeparator1);
        jSeparator1.setBounds(0, 40, 640, 50);

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Identificacion:");
        add(jLabel2);
        jLabel2.setBounds(30, 110, 90, 17);

        add(jTextFieldID);
        jTextFieldID.setBounds(170, 110, 240, 22);

        jLabel9.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Numero Habitacion:");
        add(jLabel9);
        jLabel9.setBounds(30, 150, 125, 17);

        add(jTextFieldHABITACION);
        jTextFieldHABITACION.setBounds(170, 150, 240, 22);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ingresa los siguientes datos:");
        add(jLabel10);
        jLabel10.setBounds(30, 70, 176, 17);

        jLabel11.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hora de Salida:");
        add(jLabel11);
        jLabel11.setBounds(30, 190, 93, 17);

        add(jTextFieldHora);
        jTextFieldHora.setBounds(170, 190, 240, 22);

        jLabel12.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha de Salida:");
        add(jLabel12);
        jLabel12.setBounds(30, 230, 100, 17);


        add(jTextFieldFecha);
        jTextFieldFecha.setBounds(170, 230, 240, 22);

        jButtonGenerarFactura.setBackground(new java.awt.Color(29, 29, 29));
        jButtonGenerarFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonGenerarFactura.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGenerarFactura.setText("Generar Factura");
        jButtonGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarFacturaActionPerformed(evt);
            }
        });
        add(jButtonGenerarFactura);
        jButtonGenerarFactura.setBounds(30, 290, 132, 24);

        jTextFactura.setBackground(new java.awt.Color(29, 29, 29));
        jTextFactura.setColumns(20);
        jTextFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextFactura.setForeground(new java.awt.Color(255, 255, 255));
        jTextFactura.setRows(5);
        jScrollPane2.setViewportView(jTextFactura);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 350, 580, 230);
    }

    

    private void jButtonGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {
        if(jTextFieldID.getText().isEmpty() || jTextFieldHABITACION.getText().isEmpty() || jTextFieldFecha.getText().isEmpty() || jTextFieldHora.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos" );
        }
        String resulGenerarFactura = CheckOut.generarFactura(obtenerID(), obtenerHabitacion(), obtenerHora(), obtenerFecha());
        jTextFactura.setText(resulGenerarFactura);
    }

    private Date obtenerFecha(){
        return Date.valueOf(jTextFieldFecha.getText());
    }

    private Time obtenerHora(){
        return Time.valueOf(jTextFieldHora.getText());
    }

    private Integer obtenerID(){
        return Integer.parseInt(jTextFieldID.getText());
    }

    private Integer obtenerHabitacion(){
        return Integer.parseInt(jTextFieldHABITACION.getText());
    }
    




    // Variables declaration 
    private javax.swing.JButton jButtonGenerarFactura;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextFactura;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldHABITACION;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
