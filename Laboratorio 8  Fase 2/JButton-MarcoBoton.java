import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame {
    private final JButton botonJButtonSimple; // botón con texto solamente
    private final JButton botonJButtonElegante; // botón con iconos

    // MarcoBoton agrega objetos JButton a JFrame
    public MarcoBoton() {
        super("Prueba de botones");
        setLayout(new FlowLayout());

        botonJButtonSimple = new JButton("Boton simple"); // botón con texto
        add(botonJButtonSimple); // agrega botonJButtonSimple a JFrame 

        // Carga la imagen "insecto1.gif" desde el mismo directorio que tu archivo Java
        Icon insecto1 = new ImageIcon(getClass().getResource("insecto1.gif"));
        Icon insecto2 = new ImageIcon(getClass().getResource("insecto2.gif"));

        botonJButtonElegante = new JButton("Boton elegante", insecto1); // establece la imagen
        botonJButtonElegante.setRolloverIcon(insecto2); // establece la imagen de sustitución

        add(botonJButtonElegante); // agrega botonJButtonElegante a JFrame

        // crea nuevo ManejadorBoton para manejar los eventos de botón
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }

    // clase interna para manejar eventos de botón
    private class ManejadorBoton implements ActionListener {
        // maneja evento de botón
        @Override
        public void actionPerformed(ActionEvent evento) {
            String nuevoTitulo = JOptionPane.showInputDialog("Ingrese un nuevo título para la ventana:");
            if (nuevoTitulo != null) {
                setTitle(nuevoTitulo);
            }
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format("Usted oprimió: %s", evento.getActionCommand()));
        }
    }

    public static void main(String[] args) {
        MarcoBoton marco = new MarcoBoton();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(300, 200);
        marco.setVisible(true);
    }
}
