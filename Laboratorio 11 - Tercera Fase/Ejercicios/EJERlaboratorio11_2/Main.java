package EJERlaboratorio11_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary<Object, Object> dictionary = new Dictionary<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Añade key-value pair");
            System.out.println("2. Elimina key");
            System.out.println("3. Valor de la key");
            System.out.println("4. Muestra el diccionario");
            System.out.println("5. Salir");

            System.out.print("Ingrese tu elección: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ingrese key: ");
                    Object key = scanner.next();
                    System.out.print("Ingresa el valor: ");
                    Object value = scanner.next();
                    dictionary.add(key, value);
                    break;
                case 2:
                    System.out.print("Ingresa key para eliminar: ");
                    Object keyToDelete = scanner.next();
                    boolean deleted = dictionary.delete(keyToDelete);
                    System.out.println(deleted ? "Key eliminada." : "Key no encontrada.");
                    break;
                case 3:
                    System.out.print("Ingresa key para obtener su valor: ");
                    Object keyToGet = scanner.next();
                    try {
                        Object retrievedValue = dictionary.getValue(keyToGet);
                        System.out.println("Valor de la key '" + keyToGet + "': " + retrievedValue);
                    } catch (ObjectNoExist e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Diccionario: " + dictionary);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción invalidad. Ingrese un numero entre 1 y 5.");
            }
        }
    }
}