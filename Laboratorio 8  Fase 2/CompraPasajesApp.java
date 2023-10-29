import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompraPasajesApp {
    private JFrame frame;
    private JTextField nombreTextField, documentoTextField;
    private JComboBox<String> origenComboBox, destinoComboBox;
    private JRadioButton primerPisoRadioButton, segundoPisoRadioButton;
    private JCheckBox audifonosCheckBox, mantaCheckBox, revistasCheckBox;
    private JComboBox<String> calidadServicioComboBox;

    public CompraPasajesApp() {
        frame = new JFrame("Compra de Pasajes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT)); // Usar FlowLayout alineado a la izquierda

        JLabel nombreLabel = new JLabel("Nombre Completo");
        nombreTextField = new JTextField(15);
        JLabel documentoLabel = new JLabel("Documento de Identidad:");
        documentoTextField = new JTextField(15);
        JLabel origenLabel = new JLabel("Origen:");
        origenComboBox = new JComboBox<>(new String[]{"Ciudad A", "Ciudad B", "Ciudad C"});
        JLabel destinoLabel = new JLabel("Destino:");
        destinoComboBox = new JComboBox<>(new String[]{"Ciudad X", "Ciudad Y", "Ciudad Z"});
        JLabel pisoLabel = new JLabel("Piso:");
        primerPisoRadioButton = new JRadioButton("1er Piso");
        segundoPisoRadioButton = new JRadioButton("2do Piso");
        ButtonGroup pisoButtonGroup = new ButtonGroup();
        pisoButtonGroup.add(primerPisoRadioButton);
        pisoButtonGroup.add(segundoPisoRadioButton);
        JLabel serviciosLabel = new JLabel("Servicios Opcionales:");
        audifonosCheckBox = new JCheckBox("Audífonos");
        mantaCheckBox = new JCheckBox("Manta");
        revistasCheckBox = new JCheckBox("Revistas");
        JLabel calidadServicioLabel = new JLabel("Calidad de Servicio:");
        calidadServicioComboBox = new JComboBox<>(new String[]{"Económico", "Standard", "VIP"});

        JButton comprarButton = new JButton("Comprar Pasaje");

        comprarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Recopilar los datos ingresados y mostrar un resumen en un cuadro de diálogo
                String nombre = nombreTextField.getText();
                String documento = documentoTextField.getText();
                String origen = (String) origenComboBox.getSelectedItem();
                String destino = (String) destinoComboBox.getSelectedItem();
                String piso = primerPisoRadioButton.isSelected() ? "1er Piso" : "2do Piso";
                String serviciosOpcionales = "";
                if (audifonosCheckBox.isSelected()) serviciosOpcionales += "Audífonos ";
                if (mantaCheckBox.isSelected()) serviciosOpcionales += "Manta ";
                if (revistasCheckBox.isSelected()) serviciosOpcionales += "Revistas ";
                String calidadServicio = (String) calidadServicioComboBox.getSelectedItem();

                String resumen = "Resumen de la Compra:\n" +
                        "Nombre: " + nombre + "\n" +
                        "Documento de Identidad: " + documento + "\n" +
                        "Origen: " + origen + "\n" +
                        "Destino: " + destino + "\n" +
                        "Piso: " + piso + "\n" +
                        "Servicios Opcionales: " + serviciosOpcionales + "\n" +
                        "Calidad de Servicio: " + calidadServicio;

                JOptionPane.showMessageDialog(frame, resumen, "Resumen de Compra", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Agregar los componentes al panel
        panel.add(nombreLabel);
        panel.add(nombreTextField);
        panel.add(documentoLabel);
        panel.add(documentoTextField);
        panel.add(origenLabel);
        panel.add(origenComboBox);
        panel.add(destinoLabel);
        panel.add(destinoComboBox);
        panel.add(pisoLabel);
        panel.add(primerPisoRadioButton);
        panel.add(segundoPisoRadioButton);
        panel.add(serviciosLabel);
        panel.add(audifonosCheckBox);
        panel.add(mantaCheckBox);
        panel.add(revistasCheckBox);
        panel.add(calidadServicioLabel);
        panel.add(calidadServicioComboBox);

        frame.add(panel);
        frame.add(comprarButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CompraPasajesApp());
    }
}
