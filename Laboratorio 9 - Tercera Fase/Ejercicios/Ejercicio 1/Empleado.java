package EjerMajArchSerObj;
import java.io.*;

public class Empleado {
    private int numero;
    private String nombre;
    private double sueldo;

    public Empleado(int numero, String nombre, double sueldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void guardarEmpleado() {
        try {
            FileWriter writer = new FileWriter("empleados.txt", true);
            writer.write(numero + ";" + nombre + ";" + sueldo + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

