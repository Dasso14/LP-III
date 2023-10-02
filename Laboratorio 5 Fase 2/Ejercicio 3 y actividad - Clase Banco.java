import java.util.Arrays;

public class Banco {
    private String nombre;
    private Persona clientes[];

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }

    public void agregarCliente(Persona persona) {
        if (persona == null) {
            System.out.println("No se puede agregar un cliente nulo.");
            return;
        }

        // Verificar si el cliente ya existe
        if (buscarCliente(persona)) {
            System.out.println("El cliente ya existe en el banco.");
            return;
        }

        // Verificar capacidad del arreglo
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = persona;
                System.out.println("Cliente agregado exitosamente.");
                return;
            }
        }
        System.out.println("El banco está lleno, no se puede agregar más clientes.");
    }

    public Persona darBajaCliente(Persona persona) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                Persona clienteEliminado = clientes[i];
                clientes[i] = null;
                // Llenar el espacio vacío con el último cliente no nulo
                for (int j = i; j < clientes.length - 1; j++) {
                    if (clientes[j + 1] != null) {
                        clientes[i] = clientes[j + 1];
                        clientes[j + 1] = null;
                    }
                }
                return clienteEliminado;
            }
        }
        return null;
    }

    public void clientesTipo(char tipo) {
        for (Persona cliente : clientes) {
            if (cliente != null && cliente.getTipo() == tipo) {
                System.out.println(cliente);
            }
        }
    }

    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", clientes=" + Arrays.toString(clientes) + "]";
    }
}
