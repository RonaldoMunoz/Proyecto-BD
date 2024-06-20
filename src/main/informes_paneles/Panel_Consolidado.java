
package informes_paneles;

import db.Informes;

/**
 *
 * @author usuario
 */
public class Panel_Consolidado extends javax.swing.JPanel {

    public Panel_Consolidado() {
        initComponents();
    }


    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_Consolidado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        label_ConsultaDispo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonCalcularVentaxMes = new javax.swing.JButton();
        jTextFieldFecha = new javax.swing.JTextField();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(640, 640));
        setMinimumSize(new java.awt.Dimension(640, 640));
        setPreferredSize(new java.awt.Dimension(640, 640));
        setLayout(null);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consolidado de servicios en la fecha indicada");
        add(jLabel4);
        jLabel4.setBounds(50, 190, 290, 20);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Generar consolidado de los servicios vendidos en la fecha indicada");
        add(jLabel3);
        jLabel3.setBounds(50, 100, 347, 17);

        label_Consolidado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        label_Consolidado.setForeground(new java.awt.Color(255, 255, 255));
        add(label_Consolidado);
        label_Consolidado.setBounds(50, 220, 550, 350);
        add(jSeparator1);
        jSeparator1.setBounds(0, 40, 650, 20);

        label_ConsultaDispo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_ConsultaDispo.setForeground(new java.awt.Color(255, 255, 255));
        label_ConsultaDispo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ConsultaDispo.setText("Generar Consolidado De Servicios Vendidos");
        add(label_ConsultaDispo);
        label_ConsultaDispo.setBounds(10, 0, 640, 40);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresa el año y el mes (A/M)");
        add(jLabel1);
        jLabel1.setBounds(50, 150, 184, 17);

        jButtonCalcularVentaxMes.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCalcularVentaxMes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonCalcularVentaxMes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalcularVentaxMes.setText("Consultar");
        add(jButtonCalcularVentaxMes);
        jButtonCalcularVentaxMes.setBounds(400, 150, 83, 22);
        jButtonCalcularVentaxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularVentaxMes(evt);
            }
        });

        jTextFieldFecha.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        add(jTextFieldFecha);
        jTextFieldFecha.setBounds(250, 150, 120, 20);
    }

    private void jButtonCalcularVentaxMes(java.awt.event.ActionEvent evt) {
        int anio = Integer.parseInt(obtenerAnio());
        int mes = Integer.parseInt(obtenerMes());

        setConsolidado(Informes.obtenerConsolidadoServicios(anio, mes));
    }

    private String obtenerAnio(){
        String fecha = jTextFieldFecha.getText();
        String[] partes = fecha.split("-");
        return partes[0];
    }

    private String obtenerMes(){
        String fecha = jTextFieldFecha.getText();
        String[] partes = fecha.split("-");
        return partes[1];
    }

    private void setConsolidado(String consolidado) {
        label_Consolidado.setText(consolidado);
    }

    // Variables declaration 
    private javax.swing.JButton jButtonCalcularVentaxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JLabel label_Consolidado;
    private javax.swing.JLabel label_ConsultaDispo;
    // End of variables declaration
}