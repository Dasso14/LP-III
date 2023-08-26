import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            vida++;
            System.out.println("Vida: " + vida + "\t¿Cuál es el número secreto? ");
            rp = sc.nextInt();
            if (rp == 1234) {
                fl = true;
                break; // Salir del bucle si adivina el número
            }
        } while (vida < 3);
        
        sc.close(); // Cerrar el objeto Scanner
        
        if (fl) {
            System.out.println("¡Adivinaste!");
        } else {
            System.out.println("Ups, perdiste...");
        }
    }
}
