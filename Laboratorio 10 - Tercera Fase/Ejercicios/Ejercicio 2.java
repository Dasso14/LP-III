import java.util.Arrays;

public class Main {
    public static <T> void intercambiarElementos(T[] arreglo, int indice1, int indice2) {
        if (indice1 < 0 || indice1 >= arreglo.length || indice2 < 0 || indice2 >= arreglo.length) {
            throw new IllegalArgumentException("Los índices están fuera de rango.");
        }

        T temp = arreglo[indice1];
        arreglo[indice1] = arreglo[indice2];
        arreglo[indice2] = temp;
    }

    public static void main(String[] args) {
        Integer[] arregloEnteros = {1, 2, 3, 4, 5};
        String[] arregloStrings = {"Hola", "Mundo", "!"};

        System.out.println("Arreglo de enteros antes del intercambio: " + Arrays.toString(arregloEnteros));
        intercambiarElementos(arregloEnteros, 1, 3);
        System.out.println("Arreglo de enteros después del intercambio: " + Arrays.toString(arregloEnteros));

        System.out.println("Arreglo de strings antes del intercambio: " + Arrays.toString(arregloStrings));
        intercambiarElementos(arregloStrings, 0, 2);
        System.out.println("Arreglo de strings después del intercambio: " + Arrays.toString(arregloStrings));
    }
}
