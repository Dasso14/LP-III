package EJERlaboratorio11_1;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    protected List<Goodie> items;

    public Bag() {
        items = new ArrayList<>();
    }

    public void add(Goodie item) {
        items.add(item);
    }
}
