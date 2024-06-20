package gui;


import habitaciones_paneles.Panel_Check_In;
import habitaciones_paneles.Panel_HabitacionesOpciones;
import informes_paneles.Informes_Opciones;
import reserva_paneles.Panel_ReservaOpciones;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import CheckOut_paneles.Panel_CheckOut;
import clientes_paneles.Panel_Clientes_opciones;
import gestionarPerfiles.Panel_Perfiles;


/**
 *
 * @author Yeifer Ronaldo
 */
public class GUI_principal extends javax.swing.JFrame implements CambiarPanel{
    
    public static PanelLogin panelInicio = new PanelLogin();
    public static Panel_HabitacionesOpciones panelHabitacionesOpciones = new Panel_HabitacionesOpciones();
    public static JpanelModulos modulosPanel = new JpanelModulos();
    public static Panel_ReservaOpciones panelReservaciones = new Panel_ReservaOpciones ();
    public static Panel_Clientes_opciones panelClientes = new Panel_Clientes_opciones();
    public static Panel_HabitacionesOpciones panelHabitaciones = new Panel_HabitacionesOpciones();
    public static Informes_Opciones panelReportes = new Informes_Opciones();
    public static Panel_Check_In panelCheckIn = new Panel_Check_In();
    public static Panel_CheckOut panelCheckOut = new Panel_CheckOut();
    public static Panel_Perfiles panelPerfiles = new Panel_Perfiles();
    public static PanelClienteNoReserva panelNoReserva = new PanelClienteNoReserva() ;

    


    public GUI_principal() {
        initComponents();
        cambiarPanel(panelInicio,Bg);
        

    }

    @SuppressWarnings("unchecked")

    private void initComponents() {
        Bg = new JPanel();
        Bg.setLayout(new BorderLayout()); // Establece un Layout Manager
    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(810, 640));
        setMinimumSize(new java.awt.Dimension(810, 640));
        setPreferredSize(new java.awt.Dimension(810, 640));
        setResizable(false);
    
        
        Bg.setPreferredSize(new java.awt.Dimension(810, 640)); // Asegura de que Bg tenga un tamaño.
    
        getContentPane().add(Bg, BorderLayout.CENTER); // Añade Bg al contenedor de contenido de la ventana.
    
        pack(); // Ajusta el tamaño de la ventana para que se ajuste a sus subcomponentes.
    }



    public static javax.swing.JPanel Bg;


        
    
    

    
    

}

