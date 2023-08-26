package Principal6;

import java.util.Scanner;

public class Principal6 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        /*
         * Perro p1 = new Perro();
         * p1.setRaza("chow chow");
         * System.out.println(p1.getRaza());
         * 
         * Perro p2 = new Perro("doberman", "marron", 35,5, 9);
         * System.out.println((p2));
         * p2.ladrar();
         * p2.increEdad(5);
         * p2.comer();
         * p2.dormir();
         * System.out.println(p2);
         * 
         */

        Perro p3 = new Perro("doberman", "negro", 34, 6, 9);
        System.out.println(p3);

        try (Scanner s1 = new Scanner(System.in)) {
            System.out.println("Ingresa la temperatura del perro: ");
            double decimal = s1.nextDouble();

            System.out.println("Ingresa la edad del perro: ");
            int numero = s1.nextInt();

            System.out.println("Ingresa el peso del perro: ");
            double pesoPerro = s1.nextDouble();

            p3.setTemp(decimal);
            p3.setEdad(numero);
            p3.setPeso(pesoPerro);
        }
        Diagnostico d1 = new Diagnostico();
        d1.aptoVacunaA(p3);

        /*
         * 
         * Scanner s1 = new Scanner(System.in);
         * System.out.println("Ingresa una cadena: ");
         * String texto = s1.next();
         * 
         * System.out.println("Ingresa un numero entero: ");
         * int numero = s1.nextInt(0);
         * 
         * System.out.println("Ingresa un nuemro decimal: ");
         * double decimal = s1.nextDouble();
         * 
         * System.out.println("Texto: "+texto+" Entero:"+ numero +"Decimal: "+decimal);
         * 
         * Diagnostico d1 = new Diagnostico();
         * d1.aptoVacunaA(p2);
         * 
         */
    }
}