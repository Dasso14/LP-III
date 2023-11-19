package ejer;

import java.util.*;

public class Main {
    public static <T> T[] copyArray(T[] arr1, T[] arr2) {
        Set<T> set = new LinkedHashSet<>(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2));
        return set.toArray(arr1);
    }

    public static void main(String[] args) {
        String[] arr1 = { "Hola", "Mundo" };
        String[] arr2 = { "Hola", "Java" };
        String[] resultStr = copyArray(arr1, arr2);
        System.out.println(Arrays.toString(resultStr));

        Producto[] arr3 = { new Producto("Producto 1"), new Producto("Producto 2") };
        Producto[] arr4 = { new Producto("Producto 2"), new Producto("Producto 3") };
        Producto[] resultProd = copyArray(arr3, arr4);
        System.out.println(Arrays.toString(resultProd));

        Persona[] arr5 = { new Persona("Nombre 1"), new Persona("Nombre 2") };
        Persona[] arr6 = { new Persona("Nombre 2"), new Persona("Nombre 3") };
        Persona[] resultPers = copyArray(arr5, arr6);
        System.out.println(Arrays.toString(resultPers));
    }
}

class Producto {
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
