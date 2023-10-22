package EjerciciosLab7;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            System.out.println(metodo("42"));
        } catch (NumberFormatException e) {
            System.out.println("Excepción en main(): " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static int metodo(String num) {
        int valor = 0;
        try {
            valor++;
            valor += Integer.parseInt(num);
            valor++;
            System.out.println("Valor al final del try: " + valor);
        } catch (NumberFormatException e) {
            valor += Integer.parseInt("42");
            System.out.println("Valor al final del catch: " + valor);
            throw e; // Lanzar la excepción nuevamente para que sea capturada en el método main
        } finally {
            valor++;
            System.out.println("Valor al final de finally: " + valor);
        }
        valor++;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}
