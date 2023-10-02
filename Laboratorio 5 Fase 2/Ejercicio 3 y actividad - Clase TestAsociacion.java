public class TestAsociacion {
    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);

        // Agregar clientes
        Persona cliente1 = new Persona(1, 1000.0, 101, "John", "Doe", 'A');
        Persona cliente2 = new Persona(2, 1500.0, 102, "Jane", "Smith", 'B');
        bcp.agregarCliente(cliente1);
        bbva.agregarCliente(cliente2);

        // Eliminar clientes
        if (bcp.buscarCliente(cliente1)) {
            System.out.println("Cliente 1 encontrado en el banco BCP.");
            Persona clienteEliminado = bcp.darBajaCliente(cliente1);
            System.out.println("Cliente eliminado: " + clienteEliminado);
        } else {
            System.out.println("Cliente 1 no encontrado en el banco BCP.");
        }

        // Listar los clientes por tipo
        System.out.println("Clientes de tipo 'A' en el banco BBVA:");
        bbva.clientesTipo('A');

        // Buscar clientes
        System.out.println("Clientes en el banco BCP:");
        for (Persona cliente : bcp.getClientes()) {
            if (cliente != null) {
                System.out.println(cliente);
            }
        }
