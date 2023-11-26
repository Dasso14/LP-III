import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Informacion de contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");

            System.out.print("Ingrese su opción: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el DNI: ");
                    String dni = scanner.next();
                    System.out.print("Ingrese informacion del contacto: ");
                    String contactData = scanner.next();
                    contacts.addContact(dni, contactData);
                    break;
                case 2:
                    System.out.print("Ingrese el DNI para borrar el contacto: ");
                    String dniToDelete = scanner.next();
                    boolean deleted = contacts.deleteContact(dniToDelete);
                    System.out.println(deleted ? "Contacto eliminado." : "Contacto no encontrado.");
                    break;
                case 3:
                    System.out.print("Ingrese el DNI para mostrar el contacto: ");
                    String dniToGet = scanner.next();
                    try {
                        String retrievedData = contacts.getContactData(dniToGet);
                        System.out.println("Informacion de contacto para el DNI mostrado es '" + dniToGet + "': " + retrievedData);
                    } catch (ObjectNoExist e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Todos los contactos: " + contacts.getAllContacts());
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Eleccion invalida, ingrese un numero entre 1 y 5..");
            }
        }
    }
}
