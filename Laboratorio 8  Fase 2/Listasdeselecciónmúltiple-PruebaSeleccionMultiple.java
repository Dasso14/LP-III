import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaSeleccionMultiple {
    public static void main(String[] args) {
        MarcoSeleccionMultiple marcoSeleccionMultiple = new MarcoSeleccionMultiple();
        marcoSeleccionMultiple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoSeleccionMultiple.setSize(350, 140);
        marcoSeleccionMultiple.setVisible(true);

        // Cambiar el nombre de la ventana
        String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre de la ventana:");
        if (nuevoNombre != null) {
            marcoSeleccionMultiple.setTitle(nuevoNombre);
        }
    }
}
