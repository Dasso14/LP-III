public class TestHerencia {
    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado("Manuel Cortina", 12345678, 28, 2000.0);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Juan Mota", 553332222, 30, 2500.0, "noche");
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Antonio Camino", 55333666, 35, 2200.0, "Granada");

        System.out.println("El nombre de empleado 1 es " + empleado1.getNombre());
        System.out.println("El salario base de empleado 1 es " + empleado1.getSalarioBase());
        System.out.println("La nómina de empleado 1 es " + empleado1.calcularNomina());
        System.out.println();

        System.out.println("El nombre de empleado 2 es " + empleado2.getNombre());
        System.out.println("El turno del empleado 2 es " + empleado2.getTurno());
        System.out.println("La nómina de empleado 2 es " + empleado2.calcularNomina());
        System.out.println();

        System.out.println("El nombre de empleado 3 es " + empleado3.getNombre());
        System.out.println("La región del empleado 3 es " + empleado3.getRegion());
        System.out.println("La nómina de empleado 3 es " + empleado3.calcularNomina());
    }
}
