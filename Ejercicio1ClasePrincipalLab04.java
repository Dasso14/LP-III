package Contacto;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        ArrayList<contacto> agenda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1) Añadir contacto");
            System.out.println("2) Buscar contacto");
            System.out.println("3) Modificar contacto");
            System.out.println("4) Borrar contacto");
            System.out.println("5) Eliminar todos los contactos");
            System.out.println("6) Mostrar contactos");
            System.out.println("7) Salir");

            System.out.println("Ingrese una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del contacto:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el teléfono del contacto:");
                    String telefono = scanner.nextLine();
                    System.out.println("Ingrese la direccion del contacto:");
                    String direccion = scanner.nextLine();
                    contacto nuevoContacto = new contacto(nombre, telefono, direccion);
                    agenda.add(nuevoContacto);
                    System.out.println("Contacto agregado con éxito.");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del contacto a buscar:");
                    String nombreBuscar = scanner.nextLine();
                    boolean encontrado = false;
                    for (contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("Contacto encontrado:\n" + contacto);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del contacto a modificar:");
                    String nombreModificar = scanner.nextLine();
                    for (contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreModificar)) {
                            System.out.println("Ingrese el nuevo teléfono:");
                            String nuevoTelefono = scanner.nextLine();
                            contacto.setTelefono(nuevoTelefono);
                            System.out.println("Contacto modificado con éxito.");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del contacto a borrar:");
                    String nombreBorrar = scanner.nextLine();
                    contacto contactoBorrar = null;
                    for (contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreBorrar)) {
                            contactoBorrar = contacto;
                            break;
                        }
                    }
                    if (contactoBorrar != null) {
                        agenda.remove(contactoBorrar);
                        System.out.println("Contacto borrado con éxito.");
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 5:
                    agenda.clear();
                    System.out.println("Todos los contactos han sido eliminados con exito.");
                    break;
                case 6:
                    System.out.println("Lista de contactos:");
                    for (contacto contacto : agenda) {
                        System.out.println(contacto);
                    }
                    break;
                case 7:
                    System.out.println("Saliendo de la aplicación.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
