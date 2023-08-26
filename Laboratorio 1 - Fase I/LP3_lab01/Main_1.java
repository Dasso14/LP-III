import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        final int NUMERO_SECRETO = 1234;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            vida++;
            System.out.println("Vida: " + vida + "\t¿Cuál es el número secreto? ");
            rp = sc.nextInt();
            if (rp == NUMERO_SECRETO) {
                fl = true;
                break; 
            }
        } while (vida < 3);
        
        sc.close();
        
        if (fl) {
            System.out.println("¡Adivinaste!");
        } else {
            System.out.println("Ups, perdiste...");
        }
        

        if (!fl && vida == 3) {
            System.out.println("Intentos agotados. El número secreto era: " + NUMERO_SECRETO);
        }
    }
}