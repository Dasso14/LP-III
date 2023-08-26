package Principal5;

import java.util.Scanner;

public class Principal5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        CuentaBanco b1 = new CuentaBanco(null, 0);

        try (Scanner s1 = new Scanner(System.in)) {
            System.out.println("-----CUENTA BANCO-----");
            System.out.println("Ingresa el titular: ");
            String titular1 = s1.nextLine();
            System.out.println("Ingrese una cantidad inicial: ");
            double cantidadIni = s1.nextDouble();

            b1.setTitular(titular1);
            b1.setCantidad(cantidadIni);

            int variable;

            do {
                System.out.println(" -----Listas de operaciones----");
                System.out.println("1: ¿Desea hacer retiros?");
                System.out.println("2: ¿Desea hacer depositos?");
                System.out.println("3: Mostrar Saldo Actual...");
                System.out.println("4: Salir");
                variable = s1.nextInt();
                switch (variable) {
                    case 1:
                        System.out.println("Ingrese un monto: ");
                        double monto = s1.nextDouble();
                        b1.retirar(monto);
                        break;
                    case 2:
                        System.out.println("Ingrese un monto: ");
                        double monto1 = s1.nextDouble();
                        b1.ingresar(monto1);
                        break;
                    case 3:
                        System.out.println("Su saldo es de: " + b1.getCantidad());
                        break;
                    case 4:
                        System.out.println("Saliendo.....");
                        break;
                    default:
                        System.out.println("Opnción no valida. Por favor, eliga nuevamente.");
                }
            } while (variable != 4);
        }
    }
}
