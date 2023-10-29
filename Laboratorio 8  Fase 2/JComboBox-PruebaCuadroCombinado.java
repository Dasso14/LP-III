import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaCuadroCombinado {
    public static void main(String[] args) {
        MarcoCuadroCombinado marcoCuadroCombinado = new MarcoCuadroCombinado();
        marcoCuadroCombinado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoCuadroCombinado.setSize(350, 150);
        marcoCuadroCombinado.setVisible(true);

        // Cambiar el nombre de la ventana
        String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre de la ventana:");
        if (nuevoNombre != null) {
            marcoCuadroCombinado.setTitle(nuevoNombre);
        }
    }
}
