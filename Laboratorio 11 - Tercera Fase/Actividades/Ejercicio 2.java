class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

interface Pair<K, V> {
    K getKey();
    V getValue();
}

class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

class App {
    public static void main(String[] args) {
        OrderedPair<Integer, Integer> pair1 = new OrderedPair<>(1, 10);
        OrderedPair<Integer, String> pair2 = new OrderedPair<>(2, "Hello");
        OrderedPair<String, Persona> pair3 = new OrderedPair<>("Key", new Persona("Diego "));

        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);
        System.out.println("Pair 3: " + pair3);

        // Modificar un par ordenado
        pair1.setKey(11);
        pair2.setValue("World");


        System.out.println("Modified Pair 1: " + pair1);
        System.out.println("Modified Pair 2: " + pair2);
    }
}
