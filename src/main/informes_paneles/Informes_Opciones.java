
package informes_paneles;
import java.awt.event.ActionEvent;

import gui.CambiarPanel;
import gui.GUI_principal;


public class Informes_Opciones extends javax.swing.JPanel implements CambiarPanel{

    public Informes_Opciones() {
        initComponents();
    }

    private void initComponents() {

        jButtonBack = new javax.swing.JButton();
        jButtonInfoGeneral = new javax.swing.JButton();
        jButtonConsolidado = new javax.swing.JButton();
        jButtonVentas_x_mes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(29, 29, 29));
        setMaximumSize(new java.awt.Dimension(810, 640));
        setMinimumSize(new java.awt.Dimension(810, 640));
        setPreferredSize(new java.awt.Dimension(810, 640));

        jButtonBack.setBackground(new java.awt.Color(29, 29, 29));
        jButtonBack.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-izquierda.png"))); // NOI18N
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }

            private void jButtonBackActionPerformed(ActionEvent evt) {
                cambiarPanel(GUI_principal.modulosPanel, GUI_principal.Bg);
            }
        });

        jButtonInfoGeneral.setBackground(new java.awt.Color(29, 29, 29));
        jButtonInfoGeneral.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonInfoGeneral.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInfoGeneral.setText("Informe General");
        jButtonInfoGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoGeneralActionPerformed(evt);
            }
        });

        jButtonConsolidado.setBackground(new java.awt.Color(29, 29, 29));
        jButtonConsolidado.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonConsolidado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsolidado.setText("Consolidado servicios");
        jButtonConsolidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsolidadoActionPerformed(evt);
            }
        });

        jButtonVentas_x_mes.setBackground(new java.awt.Color(29, 29, 29));
        jButtonVentas_x_mes.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jButtonVentas_x_mes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVentas_x_mes.setText("Calcular las ventas");
        jButtonVentas_x_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentas_x_mesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Informes");

        jLabel2.setFont(new java.awt.Font("Roboto Thin", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El Descanso");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edificio.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonConsolidado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonVentas_x_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonInfoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jButtonConsolidado))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jButtonVentas_x_mes))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jButtonInfoGeneral))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel2))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }

    private void jButtonVentas_x_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentas_x_mesActionPerformed
        cambiarPanelInt(panelVentasXmes, jPanel1);
    }

    private void jButtonConsolidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsolidadoActionPerformed
        cambiarPanelInt(panelConsolidado, jPanel1);
    }
    

    private void jButtonInfoGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoGeneralActionPerformed
        cambiarPanelInt(panelDatosEstadisticos, jPanel1);
    }
    


    // Variables declaration 
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonConsolidado;
    private javax.swing.JButton jButtonInfoGeneral;
    private javax.swing.JButton jButtonVentas_x_mes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private Panel_VentasXmes panelVentasXmes = new Panel_VentasXmes();
    private Panel_Consolidado panelConsolidado = new Panel_Consolidado();
    private DatosEstadisticosPanel panelDatosEstadisticos = new DatosEstadisticosPanel();

    // End of variables declaration
}
