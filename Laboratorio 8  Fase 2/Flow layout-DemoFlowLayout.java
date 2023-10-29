import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DemoFlowLayout {
    public static void main(String[] args) {
        MarcoFlowLayout marcoFlowLayout = new MarcoFlowLayout();
        marcoFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoFlowLayout.setSize(400, 100);

        // Cambiar el nombre de la ventana
        String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre de la ventana:");
        marcoFlowLayout.setTitle(nuevoNombre);

        marcoFlowLayout.setVisible(true);
    }
}
