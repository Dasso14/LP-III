import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaCasillaVerificacion {
    public static void main(String[] args) {
        MarcoCasillaVerificacion marcoCasillaVerificacion = new MarcoCasillaVerificacion();
        marcoCasillaVerificacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoCasillaVerificacion.setSize(400, 150);
        marcoCasillaVerificacion.setVisible(true);

        String nuevoTitulo = JOptionPane.showInputDialog("Nuevo título de la ventana:");
        marcoCasillaVerificacion.setTitle(nuevoTitulo);

        String nuevoTexto = JOptionPane.showInputDialog("Nuevo texto en el campo de texto:");
        marcoCasillaVerificacion.setTextoCampoTexto(nuevoTexto);
    }
}
