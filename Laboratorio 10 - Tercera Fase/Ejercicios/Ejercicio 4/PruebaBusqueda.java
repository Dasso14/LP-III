package EjerMetodosGenericos;
import java.util.Scanner;

public class PruebaBusqueda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Producto[] productos = {
                new Producto(1, "Producto A", 10.5),
                new Producto(2, "Producto B", 20.3),
                new Producto(3, "Producto C", 15.0)
        };

        Persona[] personas = {
                new Persona("12345678", "Juan Perez", "Calle 123"),
                new Persona("87654321", "Maria Rodriguez", "Avenida 456"),
                new Persona("11223344", "Carlos Gomez", "Carrera 789")
        };

        Estudiante[] estudiantes = {
                new Estudiante("98765432", "Laura Torres", "Calle 567", "Ingeniería"),
                new Estudiante("56789012", "Pedro Martinez", "Avenida 890", "Medicina"),
                new Estudiante("34567890", "Ana Garcia", "Carrera 123", "Derecho")
        };

        System.out.print("Ingrese el código del producto a buscar: ");
        int codigoProducto = scanner.nextInt();
        Producto productoBuscado = new Producto(codigoProducto, "", 0);
        int posicionProducto = Busqueda.buscarElemento(productos, productoBuscado);
        System.out.println("Posición del producto: " + posicionProducto);

        scanner.nextLine(); 

        System.out.print("Ingrese el nombre de la persona a buscar: ");
        String nombrePersona = scanner.nextLine();
        Persona personaBuscada = new Persona("", nombrePersona, "");
        int posicionPersona = Busqueda.buscarElemento(personas, personaBuscada);
        System.out.println("Posición de la persona: " + posicionPersona);

        System.out.print("Ingrese el nombre del estudiante a buscar: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Ingrese la carrera del estudiante a buscar: ");
        String carreraEstudiante = scanner.nextLine();
        Estudiante estudianteBuscado = new Estudiante("", nombreEstudiante, "", carreraEstudiante);
        int posicionEstudiante = Busqueda.buscarElemento(estudiantes, estudianteBuscado);
        System.out.println("Posición del estudiante: " + posicionEstudiante);

        scanner.close();
    }
}

