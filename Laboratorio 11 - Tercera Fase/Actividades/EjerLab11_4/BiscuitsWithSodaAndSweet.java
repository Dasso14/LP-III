package EjerLab11_4;

public class BiscuitsWithSodaAndSweet extends Goodies {
    private String soda;
    private String sweet;

    public BiscuitsWithSodaAndSweet(int id, String description, float price, String soda, String sweet) {
        super(id, description, price);
        this.soda = soda;
        this.sweet = sweet;
    }

    public String getSoda() {
        return soda;
    }

    public String getSweet() {
        return sweet;
    }
}
