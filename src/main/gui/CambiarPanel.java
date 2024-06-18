package gui;


import javax.swing.JPanel;

public interface CambiarPanel {
            public default void cambiarPanel(JPanel panelNew, JPanel jPanel1) {
            jPanel1.setVisible(true); // Asegura que panel esté visible.
            jPanel1.removeAll(); // Remueve todos los componentes anteriores de Bg.
            jPanel1.add(panelNew); // Agrega el nuevo panel a panel1
            jPanel1.revalidate(); // Revalida el layout de Bg después de agregar el panel.
            jPanel1.repaint(); // Repinta Bg para asegurar que los cambios sean visibles.
        }

        public default void cambiarPanelInt(javax.swing.JPanel panelNuevo, javax.swing.JPanel panelContenedor) {
            panelContenedor.removeAll();
            panelContenedor.revalidate();
            panelContenedor.repaint();
        
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panelContenedor);
            panelContenedor.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
        
            // Ajustar las dimensiones del panelNuevo para que coincidan con las del panelContenedor
            panelNuevo.setPreferredSize(panelContenedor.getSize());
            panelNuevo.setMinimumSize(panelContenedor.getSize());
            panelNuevo.setMaximumSize(panelContenedor.getSize());
        
            panelContenedor.revalidate();
            panelContenedor.repaint();
        }

        
}
