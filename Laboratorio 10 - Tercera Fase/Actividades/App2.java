import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};

        try {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Ingrese el límite inferior: ");
                int limiteInferior = sc.nextInt();

                System.out.println("Ingrese el límite superior: ");
                int limiteSuperior = sc.nextInt();

                imprimirArray(intArray, limiteInferior, limiteSuperior);
            }
        } catch (LimiteInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void imprimirArray(Integer[] inputArray, int limiteInferior, int limiteSuperior)
            throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteSuperior >= inputArray.length || limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Límites fuera de rango");
        }

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            System.out.printf("%s ", inputArray[i]);
        }

        System.out.println();
    }

    static class LimiteInvalidoException extends Exception {
        public LimiteInvalidoException(String message) {
            super(message);
        }
    }
}
