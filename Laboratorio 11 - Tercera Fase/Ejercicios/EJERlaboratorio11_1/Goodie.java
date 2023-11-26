package EJERlaboratorio11_1;

public class Goodie {
    private String name;
    private double price;

    public Goodie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Goodie goodie = (Goodie) obj;
        return Double.compare(goodie.price, price) == 0 && name.equals(goodie.name);
    }
}
