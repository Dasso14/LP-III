import java.util.ArrayList;

public class Dictionary {
    private ArrayList<KeyValuePair> pairs;

    public Dictionary() {
        pairs = new ArrayList<>();
    }

    public void add(Object key, Object value) {
        KeyValuePair pair = new KeyValuePair(key, value);
        pairs.add(pair);
    }

    public boolean delete(Object key) {
        for (KeyValuePair pair : pairs) {
            if (pair.getKey().equals(key)) {
                pairs.remove(pair);
                return true;
            }
        }
        return false;
    }

    public Object getValue(Object key) throws ObjectNoExist {
        for (KeyValuePair pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new ObjectNoExist("Contacto con EL DNI: '" + key + "' no existe.");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (KeyValuePair pair : pairs) {
            result.append(pair.toString()).append(", ");
        }
        if (result.length() > 1) {
            result.setLength(result.length() - 2);
        }
        result.append("]");
        return result.toString();
    }
}
