import java.util.Random;

public class EvaluacionCrediticia {
    public static void main(String[] args) {
        int totalPersonas = 8;
        int hombres = 0;
        int mujeres = 0;
        int hombresTrabajan = 0;
        int mujeresTrabajan = 0;
        int sueldoHombres = 0;
        int sueldoMujeres = 0;
        Random random = new Random();

        for (int i = 0; i < totalPersonas; i++) {
            int sexo = random.nextInt(2) + 1; // 1=masculino, 2=femenino
            int trabaja = random.nextInt(2) + 1; // 1=si trabaja, 2=no trabaja
            int sueldo = 0;

            if (trabaja == 1) {
                sueldo = random.nextInt(3001 - 950) + 950; // Sueldo entre 950 y 3000
            }

            // Calcula el porcentaje de hombres y mujeres
            if (sexo == 1) {
                hombres++;
                if (trabaja == 1) {
                    hombresTrabajan++;
                    sueldoHombres += sueldo;
                }
            } else {
                mujeres++;
                if (trabaja == 1) {
                    mujeresTrabajan++;
                    sueldoMujeres += sueldo;
                }
            }
        }

        // Calcula los porcentajes y sueldos promedio
        double porcentajeHombres = (double) hombres / totalPersonas * 100;
        double porcentajeMujeres = (double) mujeres / totalPersonas * 100;
        double porcentajeHombresTrabajan = (double) hombresTrabajan / totalPersonas * 100;
        double porcentajeMujeresTrabajan = (double) mujeresTrabajan / totalPersonas * 100;
        double sueldoPromedioHombres = (double) sueldoHombres / hombresTrabajan;
        double sueldoPromedioMujeres = (double) sueldoMujeres / mujeresTrabajan;

        // Muestra los resultados
        System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("Porcentaje de hombres que trabajan: " + porcentajeHombresTrabajan + "%");
        System.out.println("Porcentaje de mujeres que trabajan: " + porcentajeMujeresTrabajan + "%");
        System.out.println("Sueldo promedio de hombres que trabajan: " + sueldoPromedioHombres);
        System.out.println("Sueldo promedio de mujeres que trabajan: " + sueldoPromedioMujeres);
    }
}
