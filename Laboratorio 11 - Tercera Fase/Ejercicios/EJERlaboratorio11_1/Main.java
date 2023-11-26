package EJERlaboratorio11_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CandyBags candyBag = new CandyBags();

            System.out.println("Ingrese el nombre y precio de las golosinas (o escriba 'fin' para terminar):");
            while (true) {
                System.out.print("Nombre: ");
                String name = scanner.next();

                if (name.equals("fin")) {
                    break;
                }

                System.out.print("Precio: ");
                double price = scanner.nextDouble();

                candyBag.add(new Goodie(name, price));
            }

            Goodie cheapestGoodie = candyBag.cheapest();
            System.out
                    .println("Cheapest Goodie: " + (cheapestGoodie != null ? cheapestGoodie.getName() : "No goodies"));

            CandyBags expensiveBag = candyBag.mostExpensive(2);
            System.out.println("Most Expensive Goodies:");
            for (Goodie item : expensiveBag.items) {
                System.out.println(item.getName() + " " + item.getPrice());
            }
        }
    }
}
