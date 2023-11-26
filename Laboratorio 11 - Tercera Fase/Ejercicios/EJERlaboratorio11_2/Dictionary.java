package EJERlaboratorio11_2;

import java.util.ArrayList;

public class Dictionary<K, V> {
    private ArrayList<KeyValuePair<K, V>> pairs;

    public Dictionary() {
        pairs = new ArrayList<>();
    }

    public void add(K key, V value) {
        KeyValuePair<K, V> pair = new KeyValuePair<>(key, value);
        pairs.add(pair);
    }

    public boolean delete(K key) {
        for (KeyValuePair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                pairs.remove(pair);
                return true;
            }
        }
        return false;
    }

    public V getValue(K key) throws ObjectNoExist {
        for (KeyValuePair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new ObjectNoExist("El objeto con clave '" + key + "' no existe.");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (KeyValuePair<K, V> pair : pairs) {
            result.append(pair.toString()).append(", ");
        }
        if (result.length() > 1) {
            result.setLength(result.length() - 2);
        }
        result.append("]");
        return result.toString();
    }
}
