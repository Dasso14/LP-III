import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MarcoFlowLayout extends JFrame {
    private final JButton botonJButtonIzquierda;
    private final JButton botonJButtonCentro;
    private final JButton botonJButtonDerecha;
    private final FlowLayout esquema;
    private final Container contenedor;

    public MarcoFlowLayout() {
        super("Demostracion de FlowLayout");

        esquema = new FlowLayout();
        contenedor = getContentPane();
        setLayout(esquema);

        botonJButtonIzquierda = new JButton("Izquierda");
        add(botonJButtonIzquierda);
        botonJButtonIzquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                esquema.setAlignment(FlowLayout.LEFT);
                esquema.layoutContainer(contenedor);
            }
        });

        botonJButtonCentro = new JButton("Centro");
        add(botonJButtonCentro);
        botonJButtonCentro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                esquema.setAlignment(FlowLayout.CENTER);
                esquema.layoutContainer(contenedor);
            }
        });

        botonJButtonDerecha = new JButton("Derecha");
        add(botonJButtonDerecha);
        botonJButtonDerecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                esquema.setAlignment(FlowLayout.RIGHT);
                esquema.layoutContainer(contenedor);
            }
        });
    }

    public static void main(String[] args) {
        MarcoFlowLayout marco = new MarcoFlowLayout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400, 100);

        // Cambiar el nombre de la ventana
        String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre de la ventana:");
        marco.setTitle(nuevoNombre);

        marco.setVisible(true);
    }
}
