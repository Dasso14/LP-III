package EJERlaboratorio11_1;

class CandyBags extends Bag {
    public CandyBags() {
        super();
    }

    @Override
    public void add(Goodie item) {
        if (!items.contains(item)) {
            super.add(item);
        } else {
            System.out.println("La golosina '" + item.getName() + "' ya está en la bolsa.");
        }
    }

    public Goodie cheapest() {
        if (items.isEmpty()) {
            return null;
        }

        Goodie cheapestGoodie = items.get(0);
        for (Goodie goodie : items) {
            if (goodie.getPrice() < cheapestGoodie.getPrice()) {
                cheapestGoodie = goodie;
            }
        }

        return cheapestGoodie;
    }

    public CandyBags mostExpensive(int n) {
        if (items.isEmpty()) {
            return null;
        }

        items.sort((g1, g2) -> Double.compare(g2.getPrice(), g1.getPrice()));

        CandyBags expensiveBag = new CandyBags();
        for (int i = 0; i < Math.min(n, items.size()); i++) {
            expensiveBag.add(items.get(i));
        }

        return expensiveBag;
    }
}
