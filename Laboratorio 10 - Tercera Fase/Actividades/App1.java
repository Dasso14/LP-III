public class App1 {
    public static void main(String[] args) throws Exception {
        Integer minInt = minimo(5, 3, 7, 2);
        Double minDouble = minimo(2.5, 4.1, 1.8, 3.2);
        String minString = minimo("apple", "banana", "orange", "grape");
        Persona minPersona = minimo(
                new Persona("123", "Juan", "Calle A"),
                new Persona("456", "Maria", "Calle B"),
                new Persona("789", "Carlos", "Calle C"),
                new Persona("321", "Ana", "Calle D"));

        System.out.println("Mínimo Integer: " + minInt);
        System.out.println("Mínimo Double: " + minDouble);
        System.out.println("Mínimo String: " + minString);
        System.out.println("Mínimo Persona: " + minPersona.nombres);
    }

    public static <T extends Comparable<T>> T minimo(T a, T b, T c, T d) {
        T min = a;

        if (b.compareTo(min) < 0) {
            min = b;
        }

        if (c.compareTo(min) < 0) {
            min = c;
        }

        if (d.compareTo(min) < 0) {
            min = d;
        }

        return min;
    }

    static class Persona implements Comparable<Persona> {
        String dni;
        String nombres;
        String direccion;

        public Persona(String dni, String nombres, String direccion) {
            this.dni = dni;
            this.nombres = nombres;
            this.direccion = direccion;
        }

        @Override
        public int compareTo(Persona otraPersona) {
            // Comparación basada en los nombres
            return this.nombres.compareTo(otraPersona.nombres);
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "dni='" + dni + '\'' +
                    ", nombres='" + nombres + '\'' +
                    ", direccion='" + direccion + '\'' +
                    '}';
        }
    }
}