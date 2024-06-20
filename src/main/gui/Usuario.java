package gui;

import java.util.ArrayList;

public class Usuario {
    String rol;
    String nombreUsuario;
    String password;

        // gerente
        public static boolean generarInforme = false;
        public static boolean visualizarInfo = false;
    
        // cajero:
    
         static boolean checkOut = false;
    
        // recepcionista
         public static boolean registrarReserva = false;
         public static boolean cancelarReserva = false;
         public static boolean registrarServSolicitados = false;
         public static boolean consultarHabitaciones= false;
        // administrador
         public static boolean gestionarUsuarios = false;
        //todos

    public static ArrayList<Usuario> listaUser = new ArrayList<Usuario>();


    public Usuario(String rol, String nombreUsuario, String password) {
        this.rol = rol;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public String getRol() {
        return rol;
    }
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setrol(String rol) {
        this.rol = rol;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean cambiarPasswordUser(String password, String newPassword, String nombreUsuario) {
        if(this.password.equals(password) && this.nombreUsuario.equals(nombreUsuario)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }


    public boolean verificarUsuario(String rol,String nombreUsuario, String password) {
        return this.rol.equals(rol) && this.nombreUsuario.equals(nombreUsuario) && this.password.equals(password);
    }


    public boolean verificarRol(String rol) {
        return this.rol.equals(rol);
    }

    public void cambiarRol(String rol) {
        this.rol = rol;
    }


    public static void agregarUsuario(Usuario user) {
        listaUser.add(user);
    }

    public static void eliminarUsuario(String nombreUsuario) {
        for(Usuario user : listaUser) {
            if(user.getNombreUsuario().equals(nombreUsuario)) {
                listaUser.remove(user);
                break;
            }
        }
    }

    public static boolean cambiarPasword(String nombreUsuario, String password, String newPassword) {
        for(Usuario user : listaUser) {
            if(user.cambiarPasswordUser(password, newPassword, nombreUsuario)) {
                return true;
            }
        }
        return false;
    }

    public static boolean login(String rol,String nombreUsuario, String password) {
        for(Usuario user : listaUser) {
            if(user.verificarUsuario(rol,nombreUsuario, password)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificarExist(String nombreUsuario) {
        for(Usuario user : listaUser) {
            if(user.getNombreUsuario().equals(nombreUsuario)) {
                return true;
            }
        }
        return false;
    }
    
    static void asignarPrivilegios(String rol){
        switch (rol) {
            case "Administrador":
                resetPrivilegios();
                generarInforme = true;
                visualizarInfo = true;
                checkOut = true;
                registrarReserva = true;
                cancelarReserva = true;
                registrarServSolicitados = true;
                consultarHabitaciones = true;
                gestionarUsuarios = true;
                break;
            case "Gerente":
                resetPrivilegios();
                generarInforme = true;
                visualizarInfo = true;
                break;
            case "Cajero":
                resetPrivilegios();
                checkOut = true;
                break;
            case "Recepcionista":
                resetPrivilegios();
                registrarReserva = true;
                cancelarReserva = true;
                registrarServSolicitados = true;
                consultarHabitaciones = true;
                break;
            default:
                break;
        }
    }

    public static void resetPrivilegios(){
        generarInforme = false;
        visualizarInfo = false;
        checkOut = false;
        registrarReserva = false;
        cancelarReserva = false;
        registrarServSolicitados = false;
        consultarHabitaciones = false;
        gestionarUsuarios = false;
    }
    

    static {

        Usuario admin = new Usuario("Administrador", "admin", "admin");
        listaUser.add(admin);

        Usuario recepcUsuario = new Usuario("Recepcionista", "Juanmiguel Doncel", "1234");
        listaUser.add(recepcUsuario);

        Usuario gerenteUsuario = new Usuario("Gerente", "Juan Rojas", "0000");
        listaUser.add(gerenteUsuario);

        Usuario cajeroUsuario = new Usuario("Cajero", "Nicolas Romero", "0000");
        listaUser.add(cajeroUsuario);

        Usuario cajerUsuario = new Usuario("Cajero", "Chito", "1111");
        listaUser.add(cajerUsuario);


    }



    
    /* Perfil Gerente: Tiene privilegios para generar todos los informes, visualizar la información  *
        registrada por otros usuarios. 

        Perfil Cajero: Tiene permisos para registrar check out y cerrar cuenta.  *

        Perfil Recepcionista: Tiene permisos para registrar reservas, ingresos, servicios solicitados,  *

        consultar disponibilidad, características y costos de las habitaciones, cancelar reservas. 

        Perfil Administrador: Tiene privilegios para gestionar usuarios, clientes, habitaciones,  *
        reservas, servicios e ingresos. También tiene acceso a las tareas de los demás perfiles. 
        
        */

}
