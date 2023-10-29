import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class demoborderlayout {
    public static void main(String[] args) {
        MarcoBorderLayout marcoBorderLayout = new MarcoBorderLayout();
        marcoBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cambiar el nombre de la ventana
        String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre de la ventana:");
        marcoBorderLayout.setTitle(nuevoNombre);

        marcoBorderLayout.setSize(400, 300);
        marcoBorderLayout.setVisible(true);
    }
}
