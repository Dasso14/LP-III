package EjerLab11_4;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Biscuits biscuits = new Biscuits(1, "Biscuits", 4.99f);
        Chocolate chocolate = new Chocolate(2, "Chocolate", 2.99f);
        BiscuitsWithSodaAndSweet biscuitsWithSodaAndSweet = new BiscuitsWithSodaAndSweet(3,
                "Biscuits with Soda and Sweet", 6.99f, "Cola", "Candy");

        // Imprimir información sobre los productos
        System.out.println(biscuits);
        System.out.println(chocolate);
        System.out.println(biscuitsWithSodaAndSweet);
    }
}
