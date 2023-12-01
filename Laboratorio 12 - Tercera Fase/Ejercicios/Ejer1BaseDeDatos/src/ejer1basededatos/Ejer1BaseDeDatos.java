/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1basededatos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;

public class Ejer1BaseDeDatos extends JFrame {

    private JTextField sqlQueryField, filterField;
    private JButton executeButton;
    private JTable resultTable;
    private JScrollPane scrollPane;

    public Ejer1BaseDeDatos() {
        setTitle("Aplicación SQL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        sqlQueryField = new JTextField();
        filterField = new JTextField();
        executeButton = new JButton("Ejecutar");
        resultTable = new JTable();
        scrollPane = new JScrollPane(resultTable);

        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeQuery();
            }
        });

        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel(new GridLayout(3, 2));
        topPanel.add(new JLabel("Sentencia SQL:"));
        topPanel.add(sqlQueryField);
        topPanel.add(new JLabel("Filtro (WHERE):"));
        topPanel.add(filterField);
        topPanel.add(new JLabel());
        topPanel.add(executeButton);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void executeQuery() {
        String query = sqlQueryField.getText();
        String filter = filterField.getText();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/actividad", "root", "root");
             Statement statement = connection.createStatement()) {

            if (!filter.isEmpty()) {
                query += " WHERE " + filter;
            }

            if (query.toLowerCase().startsWith("select")) {
                ResultSet resultSet = statement.executeQuery(query);
                resultTable.setModel(buildTableModel(resultSet));
            } else {
                int rowsAffected = statement.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Operación completada. Filas afectadas: " + rowsAffected);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private static DefaultTableModel buildTableModel(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();

        // Names of columns
        Vector<String> columnNames = new Vector<>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // Data of the table
        Vector<Vector<Object>> data = new Vector<>();
        while (resultSet.next()) {
            Vector<Object> vector = new Vector<>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(resultSet.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ejer1BaseDeDatos().setVisible(true);
            }
        });
    }
}


