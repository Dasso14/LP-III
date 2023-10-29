import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DemoGridLayout {
    public static void main(String[] args) {
        MarcoGridLayout marcoGridLayout = new MarcoGridLayout();
        marcoGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cambiar el nombre de la ventana
        String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre de la ventana:");
        marcoGridLayout.cambiarNombreVentana(nuevoNombre);

        marcoGridLayout.setSize(300, 200);
        marcoGridLayout.setVisible(true);
    }
}
