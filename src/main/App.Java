import gui.GUI_principal;

public class App {
    public static GUI_principal gui = new GUI_principal();

    public static void main(String[] args) {
        App.gui.setLocationRelativeTo(null);
        gui.setVisible(true);
    }
}
