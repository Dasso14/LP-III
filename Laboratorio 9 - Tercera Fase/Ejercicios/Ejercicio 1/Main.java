package EjerMajArchSerObj;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Main {
    static JTable table;

    public static void main(String[] args) {
        // Create and set up the window.
        JFrame frame = new JFrame("Aplicación Empleados");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Add the components to the frame.
        JButton btnAgregar = new JButton("Agregar empleado");
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarEmpleado();
            }
        });
        table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Número");
        model.addColumn("Nombre");
        model.addColumn("Sueldo");
        table.setModel(model);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.getContentPane().add(btnAgregar, BorderLayout.NORTH);

        // Display the window.
        frame.setVisible(true);
        reporteEmpleados(model);
    }

    public static void agregarEmpleado() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del empleado:"));
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del empleado:"));
        Empleado empleado = new Empleado(numero, nombre, sueldo);
        empleado.guardarEmpleado();
        reporteEmpleados((DefaultTableModel) table.getModel());
    }

    public static void reporteEmpleados(DefaultTableModel model) {
        model.setRowCount(0);
        try {
            File archivo = new File("empleados.txt");
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split(";");
                Object[] fila = new Object[3];
                fila[0] = Integer.parseInt(data[0]);
                fila[1] = data[1];
                fila[2] = Double.parseDouble(data[2]);
                model.addRow(fila);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

