import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaBoton {
    public static void main(String[] args) {
        MarcoBoton marcoBoton = new MarcoBoton();
        marcoBoton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBoton.setSize(300, 200);
        marcoBoton.setVisible(true);

        // Cambiar el título de la ventana
        String nuevoTitulo = JOptionPane.showInputDialog("Nuevo título de la ventana:");
        if (nuevoTitulo != null) {
            marcoBoton.setTitle(nuevoTitulo);
        }
    }
}
