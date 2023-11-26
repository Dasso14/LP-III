package EjerLab11_4;

public class Goodies {
    private int id;
    private String description;
    private float price;

    public Goodies(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goodies [id=" + id + ", description=" + description + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Goodies goodies = (Goodies) obj;
        return id == goodies.id;
    }
}
