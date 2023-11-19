package EjerMetodosGenericos;

class Busqueda {
    // Método genérico con restricción para buscar en arreglos de objetos numéricos
    public static <T extends Number & Comparable<T>> int buscarElemento(T[] arreglo, T elementoBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(elementoBuscado)) {
                return i; // Devuelve la posición del elemento si se encuentra
            }
        }
        return -1; // Devuelve -1 si el elemento no se encuentra
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        // Ejemplo de uso con números

        // Arreglo de enteros
        Integer[] enteros = { 1, 2, 3, 4, 5 };
        int posicionEntero = Busqueda.buscarElemento(enteros, 3);
        System.out.println("Posición del entero: " + posicionEntero);

        // Arreglo de números decimales
        Double[] decimales = { 1.5, 2.5, 3.5, 4.5, 5.5 };
        int posicionDecimal = Busqueda.buscarElemento(decimales, 4.5);
        System.out.println("Posición del decimal: " + posicionDecimal);

        // Pruebas adicionales

        // Intentar buscar una cadena en un arreglo de enteros
        // Esto generará un error en tiempo de compilación debido a la restricción
        // Busqueda.buscarElemento(enteros, "cadena");

        // Intentar buscar un objeto no numérico en un arreglo de decimales
        // Esto generará un error en tiempo de compilación debido a la restricción
        // Busqueda.buscarElemento(decimales, "cadena");
    }
}
