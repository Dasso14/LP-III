import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaBotonOpcion {
    public static void main(String[] args) {
        MarcoBotonOpcion marcoBotonOpcion = new MarcoBotonOpcion();
        marcoBotonOpcion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBotonOpcion.setSize(350, 150);
        marcoBotonOpcion.setVisible(true);

        // Cambiar el nombre de la ventana
        String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre de la ventana:");
        if (nuevoNombre != null) {
            marcoBotonOpcion.setTitle(nuevoNombre);
        }
    }
}
