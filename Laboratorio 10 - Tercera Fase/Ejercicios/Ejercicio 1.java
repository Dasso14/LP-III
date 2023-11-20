import java.util.Arrays;

public class Ejemploarray {

    // Método sobrecargado para imprimir un array genérico
    public static <T> void imprimirArray(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    // Método no genérico para imprimir un array de tipo String en formato tabular ordenado
    public static void imprimirArray(String[] array) {
        Arrays.sort(array);
        System.out.println("Array de cadenas contiene:");
        for (String elemento : array) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        String[] arrayCadenas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};

        // Prueba del método imprimirArray sobrecargado
        imprimirArray(arrayCadenas);
    }
}
