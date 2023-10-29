import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JOptionPane;

public class MarcoSeleccionMultiple extends JFrame {
    private final JList<String> listaJListColores;
    private final JList<String> listaJListCopia;
    private JButton botonJButtonCopiar;
    private static final String[] nombresColores = {
        "Negro", "Azul", "Cyan", "Gris oscuro", "Gris", "Verde",
        "Gris claro", "Magenta", "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo"
    };

    public MarcoSeleccionMultiple() {
        super("Listas de selección múltiple");
        setLayout(new FlowLayout());

        listaJListColores = new JList<String>(nombresColores);
        listaJListColores.setVisibleRowCount(5);
        listaJListColores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(listaJListColores));

        botonJButtonCopiar = new JButton("Copiar >>>");
        botonJButtonCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                listaJListCopia.setListData(listaJListColores.getSelectedValuesList().toArray(new String[0]));
            }
        });
        add(botonJButtonCopiar);

        listaJListCopia = new JList<String>();
        listaJListCopia.setVisibleRowCount(5);
        listaJListCopia.setFixedCellWidth(100);
        listaJListCopia.setFixedCellHeight(15);
        listaJListCopia.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(listaJListCopia));

        // Cambiar el nombre de la ventana
        String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre de la ventana:");
        if (nuevoNombre != null) {
            setTitle(nuevoNombre);
        }
    }
}
