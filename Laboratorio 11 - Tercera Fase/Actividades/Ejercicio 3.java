public class Bag<T> {
    private T[] list;
    private int count; 
    public Bag(int n) {
        this.list = (T[]) new Object[n];
        this.count = 0;
    }
    public void add(T obj) throws IsFull {
        if (count < list.length) {
            list[count++] = obj;
        } else {
            throw new IsFull("La bolsa esta llena");
        }
    }
    public T[] getObjects() throws IsEmpty {
        if (count > 0) {
            return list;
        } else {
            throw new IsEmpty("La bolsa está vacia");
        }
    }
    public T remove(T obj) throws ObjectNoExist {
        int index = getIndex(obj);
        if (index != -1) {
            T removedObject = list[index];
            for (int i = index; i < count - 1; i++) {
                list[i] = list[i + 1];
            }
            list[count - 1] = null;
            count--;
            return removedObject;
        } else {
            throw new ObjectNoExist("El objeto no existe en la bolsa");
        }
    }
    public int getIndex(T obj) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Contenido de la bolsa:\n");
        for (int i = 0; i < count; i++) {
            result.append(list[i]).append("\n");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        try {
            Bag<Integer> integerBag = new Bag<>(5);
            integerBag.add(1);
            integerBag.add(2);
            integerBag.add(3);
            System.out.println(integerBag);

            Bag<String> stringBag = new Bag<>(3);
            stringBag.add("Uno");
            stringBag.add("Dos");
            System.out.println(stringBag);

            Bag<Persona> personaBag = new Bag<>(2);
            personaBag.add(new Persona("Juan"));
            System.out.println(personaBag);

            System.out.println("Objeto eliminado: " + integerBag.remove(2));
            System.out.println(integerBag);
            System.out.println("indice de 'Uno' en la bolsa de Strings: " + stringBag.getIndex("Uno"));
            System.out.println("indice de 'Tres' en la bolsa de Strings: " + stringBag.getIndex("Tres"));
        } catch (IsFull | ObjectNoExist e) {
            e.printStackTrace();
        }
    }
}
class IsFull extends Exception {
    public IsFull(String message) {
        super(message);
    }
}
class IsEmpty extends Exception {
    public IsEmpty(String message) {
        super(message);
    }
}
class ObjectNoExist extends Exception {
    public ObjectNoExist(String message) {
        super(message);
    }
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
