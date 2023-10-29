import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaLista {
    public static void main(String[] args) {
        MarcoLista marcoLista = new MarcoLista();
        marcoLista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoLista.setSize(350, 150);
        marcoLista.setVisible(true);

        // Cambiar el nombre de la ventana
        String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre de la ventana:");
        if (nuevoNombre != null) {
            marcoLista.setTitle(nuevoNombre);
        }
    }
}
