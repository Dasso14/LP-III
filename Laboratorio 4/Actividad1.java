import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        boolean salir = false;
        int opcion, fila, columna;
        boolean rellenado = false;

        do {
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Sumar diagonales (P-I)");
            System.out.println("5. Media de los valores");
            System.out.println("6. Salir");
            System.out.println("Elige una opción:");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz);
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        do {
                            System.out.println("Elige una fila");
                            fila = sn.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));

                        System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    if (rellenado) {
                        do {
                            System.out.println("Elige una columna");
                            columna = sn.nextInt();
                        } while (!(columna >= 0 && columna < matriz[0].length));

                        System.out.println("La suma de los valores de la columna " + columna + " es: " + sumaColumna(matriz, columna));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                    System.out.println("La matriz es:");
                    int sumaPrincipal = sumarDiagonal(matriz, "p");
                    int sumaSecundaria = sumarDiagonal(matriz, "s");
                    System.out.printf("La suma de la diagonal Principal es %d y la de la Inversa es %d\n", sumaPrincipal, sumaSecundaria);
                    break;
                case 5:
                    media(matriz);
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Debes ingresar un valor entre 1 y 6");
            }
        } while (!salir);

        System.out.println("FIN");
    }

    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese un número en la posición " + i + " " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }

    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    static int sumarDiagonal(int[][] matriz, String diagonal) {
        int suma = 0;
        // Si es la principal
        if (diagonal.equals("p")) {
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][i];
            }
        } else {
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][matriz.length - 1 - i];
            }
        }
        return suma;
    }

    public static void media(int[][] matriz) {
        int sumaTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        double media = (double) sumaTotal / (matriz.length * matriz[0].length);
        System.out.println("La media es: " + media);
    }
}
