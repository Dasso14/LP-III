import java.util.Scanner;

public class ResumenVentas {
    public static void main(String[] args) {
        int numVendedores = 4;
        int numProductos = 5;

        double[][] ventas = new double[numProductos][numVendedores];

        Scanner scanner = new Scanner(System.in);

        // Leer las ventas del mes pasado
        for (int vendedor = 1; vendedor <= numVendedores; vendedor++) {
            for (int producto = 1; producto <= numProductos; producto++) {
                System.out.print("Ingrese las ventas del vendedor " + vendedor + " para el producto " + producto + ": ");
                double venta = scanner.nextDouble();
                ventas[producto - 1][vendedor - 1] = venta;
            }
        }

        scanner.close();

        // Imprimir el resumen de ventas
        System.out.println("Resumen de Ventas:");
        System.out.println("Producto\tVendedor 1\tVendedor 2\tVendedor 3\tVendedor 4\tTotal Producto");
        
        double totalVentasMes = 0;

        for (int producto = 0; producto < numProductos; producto++) {
            double totalProducto = 0;
            System.out.print((producto + 1) + "\t\t");

            for (int vendedor = 0; vendedor < numVendedores; vendedor++) {
                System.out.print(ventas[producto][vendedor] + "\t\t");
                totalProducto += ventas[producto][vendedor];
            }

            totalVentasMes += totalProducto;
            System.out.println(totalProducto);
        }

        // Imprimir el total de ventas por vendedor
        System.out.println("Total Vendedor\t");
        for (int vendedor = 0; vendedor < numVendedores; vendedor++) {
            double totalVendedor = 0;

            for (int producto = 0; producto < numProductos; producto++) {
                totalVendedor += ventas[producto][vendedor];
            }

            System.out.print("Vendedor " + (vendedor + 1) + ":\t" + totalVendedor + "\t");
        }

        // Imprimir el total de ventas del mes
        System.out.println("\nTotal Mes: " + totalVentasMes);
    }
}
